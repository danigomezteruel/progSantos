package Practica5B;

public class Profesor {
    public static void ponerNotas(Alumno nota){
        nota.getAsignatura1().setNota(Math.random()*1);
        nota.getAsignatura2().setNota(Math.random()*1);
        nota.getAsignatura3().setNota(Math.random()*1);

    }

    public static double mediaNotas(Alumno media){
        double suma = 0;
        suma += media.getAsignatura1().getNota();
        suma += media.getAsignatura2().getNota();
        suma += media.getAsignatura3().getNota();
        return suma / 3;
    }


}
