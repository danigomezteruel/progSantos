package EjerciciosPOO.Ejercicio1;

public class Cuadrado {
    private double lado;
    private Punto centro;

    public Cuadrado() {
        this.lado=Math.random()*10;
        centro = new Punto();
    }

    public Cuadrado(double lado, double x, double y) {
        this.lado = lado;
        centro=new Punto(x,y);
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setRadio(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + lado +
                '}';
    }


    public void printArea(){
        double area=lado*lado;
        System.out.println("el area es "+area);
    }

    public void calcularPerimetro(){
        double perimetro=4*lado;
        System.out.println("el perimetro es "+perimetro);
    }


}
