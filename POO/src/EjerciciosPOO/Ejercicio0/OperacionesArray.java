package EjerciciosPOO.Ejercicio0;

import java.util.Arrays;

public class OperacionesArray {
    private int[] array;

    public OperacionesArray(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "OperacionesArray{" +
                "array=" + Arrays.toString(array);
    }

    public void mostrarArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public void cargarArray(int[] array) {
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 10);
            }
    }

    public void calcularMedia(int[] array) {
        int suma = 0;
        for (int num : array) {
            suma += num;
        }
        double media = (double) suma / array.length;
        System.out.println("La media es: " + media);
    }

    public void ordenarArray(int[] array) {

        Arrays.sort(array);
    }

    public void invertirArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int aux = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = aux;
        }
    }
}