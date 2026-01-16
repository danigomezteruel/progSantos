package EjerciciosPOO.Ejercicio1;

public class triangulo {
    private double lado;

    public triangulo(double lado) {
        this.lado = lado;
    }

    public triangulo() {
        this.lado = 2.0;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    public double calcularArea(){
        return (Math.sqrt(3)/4)*(lado*lado);
    }
    public double calcularPerimetro(){
        return lado*3;
    }
}
