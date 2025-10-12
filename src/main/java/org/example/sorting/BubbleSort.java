package org.example.sorting;

import java.util.Arrays;

public class BubbleSort {

    //Esse é algoritmo mais lento, pois ele vê elemento a elemento, um por um, e vai passando
    public static void sort(int[] array) {
        System.out.println("\n" + "----------Bubble Sort----------" + "\n");
        System.out.println("Antes de sort de array: " + Arrays.toString(array))
        ;
        long inicio = System.currentTimeMillis();

        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            System.out.println("Passada " + (i+1) + ": " + Arrays.toString(array));
        }

        long fim = System.currentTimeMillis();
        System.out.println("Tempo total do BubbleSort: " + (fim - inicio) + " ms \n \n \n \n");

    }
}
