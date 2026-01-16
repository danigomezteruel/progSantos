package Practica06;

import java.util.Scanner;

public class Practica6 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Titular titular1 = new Titular("Gomez", "Dannnih",21);
        Titular titular2 = new Titular("Mata", "ESAUstivo", 22);
        CuentaCorriente cuenta1 = new CuentaCorriente(titular1, "69420NIG", 1000);
        CuentaAhorro cuenta2 = new CuentaAhorro(titular2, "13005PLA");

        System.out.println("ANTES:");
        cuenta1.printCuenta();
        cuenta2.printCuenta();

        cuenta1.ingresarDinero(500);
        cuenta1.retirarDinero(200);
        cuenta2.ingresarDinero(250);
        cuenta2.calcularInteres();

        System.out.println("\nDESPUÉS:");
        cuenta1.printCuenta();
        cuenta2.printCuenta();

    }
}

