package Practica5A;

public class Practica5a {

    static void main(String[] args) {


        Punto p1 = new Punto(2, 3);
        Punto p2 = new Punto(6, 7);

        double distanciaPuntos = p1.CalcularDistanciaDesde(p2);
        System.out.println("Distancia entre p1 y p2: " + distanciaPuntos);


        Circulo c = new Circulo(new Punto(4, 4), 5);

        System.out.println("\nCÍRCULO");
        System.out.println("Área: " + c.calcularArea());
        System.out.println("Perímetro: " + c.calcularPerimetro());
        System.out.println("Distancia del centro al punto p1: " + c.calcularDistanciaDesde(p1));


        Triangulo t = new Triangulo(
                new Punto(0, 0),
                new Punto(4, 0),
                new Punto(0, 3)
        );

        Punto p3 = new Punto(5, 5);

        System.out.println("\nTRIÁNGULO");
        System.out.println("Área: " + t.calcularArea());
        System.out.println("Perímetro: " + t.CalcularPerimetro());
        System.out.println("Distancia del centroide al punto p3: " + t.CalcularDistanciaDesde(p3));
    }
}
