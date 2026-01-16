package EjerciciosPOO.Ejercicio1;

public class Tester {
    static void main(String[] args) {
        Triangulo tringu =new Triangulo();
        Triangulo tresangulos=new Triangulo(6.5);

        Circulo cir =new Circulo();
        Circulo culo =new Circulo(6);

        Cuadrado bob=new Cuadrado();
        Cuadrado esponja=new Cuadrado(5);


        System.out.println("*----Triangulo-----*");
        tringu.printArea();
        tringu.calcularPerimetro();

        System.out.println();

        tresangulos.printArea();
        tresangulos.calcularPerimetro();
        System.out.println("*----Circulo-----*");
        cir.printArea();
        cir.calcularPerimetro();

        System.out.println();

        culo.printArea();
        culo.calcularPerimetro();
        System.out.println("*----Cuadrado-----*");
        bob.printArea();
        bob.calcularPerimetro();

        System.out.println();

        esponja.printArea();
        esponja.calcularPerimetro();
        //ya si le meto un constantes corono ticher
    }
}
