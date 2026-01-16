package EjerciciosPOO.Ejercicio1;

public class Triangulo {
    private double lado;

    public Triangulo(double lado) {
        this.lado = lado;
    }

    public Triangulo() {
        this.lado = 2.0;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public void printArea(){
        double area=(Math.sqrt(3)/4)*(lado*lado);
        System.out.println("el area es "+area);
    }
    public void calcularPerimetro(){

        double perimetro=lado*3;
        System.out.println("el perimetro es "+perimetro);
    }

}
