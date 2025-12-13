public class Circulo {
    private Punto centro;
    private double radio;

    public Circulo(Punto centro, double radio) {
        this.centro = centro;
        this.radio = radio;

    }

    public Circulo() {
        this.centro = new Punto(0, 0);
        this.radio = 0;
    }

    public Circulo(double x, double y, double radio) {
        this.centro = new Punto(0, 0);
        this.radio = radio;
    }

    public Punto getcentro() {
        return centro;
    }

    public double getRadio() {

        return radio;
    }

    public double calcularDistanciaDesde(Punto p){

        return centro.CalcularDistanciaDesde(p);

    }

    public double calcularArea(){
        return Math.PI*radio*radio;
    }

    public double calcularPerimetro(){
        return 2 * Math.PI * radio;
    }

}
