package EjerciciosPOO.Ejercicio1;

public class Circulo {
    private double radio;
    private Punto centro;

    public Circulo() {
        this.radio=Math.random()*10;
        centro = new Punto();
    }

    public Circulo(double radio, double x, double y) {
        this.radio = radio;
        centro=new Punto(x,y);
    }

    public Circulo(double radio) {
        this.radio=radio;
        centro = new Punto();
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }


    public void printArea(){
        double area=Math.PI*(radio*radio);
        System.out.println("el area es "+area);
    }

    public void calcularPerimetro(){
        double perimetro=2*Math.PI*radio;
        System.out.println("el perimetro es "+perimetro);
    }

}
