package Practica5B;

public class Practica5b {
    static void main(String[] args) {
        Asignatura Mates =new Asignatura(1);
        Asignatura asignatura3=new Asignatura(3);
        Asignatura asignatura2=new Asignatura(2);


        Alumno alumno=new Alumno(Mates,asignatura2,asignatura3);


       Profesor.ponerNotas(alumno);

       Profesor.mediaNotas(alumno);


        System.out.println(String.format("Nota Mates: %.2f", alumno.getAsignatura1().getNota()));
        System.out.println(String.format("Nota Asignatura 2: %.2f", alumno.getAsignatura2().getNota()));
        System.out.println(String.format("Nota Asignatura 3: %.2f", alumno.getAsignatura3().getNota()));

        System.out.println("MEDIA DE LAS NOTAS: ");
        System.out.print(String.format("%.2f",Profesor.mediaNotas(alumno)));
    }
}
