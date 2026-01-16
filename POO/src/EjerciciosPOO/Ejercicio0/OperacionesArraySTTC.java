package EjerciciosPOO.Ejercicio0;

import java.util.Arrays;

public class OperacionesArraySTTC {

    public static void mostrarArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void cargarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
    }

    public static void calcularMedia(int[] array) {
        int suma = 0;
        for (int num : array) {
            suma += num;
        }
        double media = (double) suma / array.length;
        System.out.println("La media es: " + media);
    }

    public static void ordenarArray(int[] array) {

        Arrays.sort(array);
    }

    public static void invertirArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int aux = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = aux;
        }
    }
}