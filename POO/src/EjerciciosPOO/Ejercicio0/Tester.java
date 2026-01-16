package EjerciciosPOO.Ejercicio0;

import java.util.Arrays;

public class Tester {
    static void main(String[] args) {


    int[] array=new int[5];
    int[] array2 = {5, 2, 9, 1, 7};
    OperacionesArray simba = new OperacionesArray(array);
        simba.cargarArray(array);
        simba.mostrarArray(array);
        simba.calcularMedia(array);
        System.out.println("-------------------");
        simba.ordenarArray(array2);
        simba.mostrarArray(array2);
        simba.invertirArray(array2);
        simba.mostrarArray(array2);

        System.out.println("-*-*-*-*--*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            OperacionesArraySTTC.cargarArray(array);
            OperacionesArraySTTC.mostrarArray(array);
            OperacionesArraySTTC.calcularMedia(array);
        System.out.println("-------------------");
            OperacionesArraySTTC.ordenarArray(array2);
            OperacionesArraySTTC.mostrarArray(array2);
            OperacionesArraySTTC.invertirArray(array2);
            OperacionesArraySTTC.mostrarArray(array2);

    }
}
