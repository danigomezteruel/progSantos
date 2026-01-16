package Practica5A;

public class Triangulo {

    private Punto x;
    private Punto y;
    private Punto z;

    public Triangulo(Punto x, Punto y, Punto z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

public Triangulo(){
        this.x=new Punto(0,0);
        this.z=new Punto(0,0);
        this.y=new Punto(0,0);

}

public Triangulo(double x1, double y1, double x2, double y2, double x3, double y3){
        this.x=new Punto(x1,y1);
        this.y=new Punto(x2,y2);
        this.z=new Punto(x3,y3);
}

    public Punto getX() {
        return x;
    }

    public Punto getY(){
        return y;
    }

    public Punto getZ() {
        return z;
    }

public double CalcularDistanciaDesde(Punto otro){
    double cx = (x.getX() + y.getX() + z.getX()) / 3;
    double cy = (x.getY() + y.getY() + z.getY()) / 3;

    Punto centroide = new Punto(cx, cy);
    return centroide.CalcularDistanciaDesde(otro);
}
    public double calcularArea() {
    return Math.abs(x.getX() * (y.getY() - z.getY()) + y.getX() * (z.getY() - x.getY()) + z.getX() * (x.getY() -y.getY())) / 2;

}
    public double CalcularPerimetro(){

        double lado1 = x.CalcularDistanciaDesde(y);
        double lado2 = y.CalcularDistanciaDesde(z);
        double lado3 = z.CalcularDistanciaDesde(x);

        return lado1 + lado2 + lado3;
    }

}


