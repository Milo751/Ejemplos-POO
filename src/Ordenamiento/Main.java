package Ordenamiento;

import java.util.Arrays;

public class Main {
    static void main(String[] args) {
        int[] numeros = {9, 3, 7, 1, 5, 2};
        System.out.println(Arrays.toString(numeros));

        Algoritmos.bubbleSort(numeros);
        System.out.println(Arrays.toString(numeros));
    }
}
