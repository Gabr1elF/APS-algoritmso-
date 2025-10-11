package org.example.sorting;

import java.util.Arrays;

public class MergeSort {

    public static int contadorPassadas = 1;
    private static long inicioTempo = 0;   // ⏳ armazena o tempo inicial
    private static boolean iniciou = false; // controla se já iniciamos a contagem

    // Função principal que será chamada no main
    public static void mergeSort(int[] array, int left, int right) {

        // Inicia a contagem de tempo na primeira chamada
        if (!iniciou) {
            inicioTempo = System.currentTimeMillis();
            iniciou = true;
        }

        if (left < right) {
            int middle = (left + right) / 2;

            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);

            merge(array, left, middle, right);

            System.out.println("Passada " + contadorPassadas + ": " + Arrays.toString(array));
            contadorPassadas++;
        }

        // Quando a recursão termina (condição final)
        if (left == 0 && right == array.length - 1) {
            long fimTempo = System.currentTimeMillis();
            System.out.println("Tempo total MergeSort: " + (fimTempo - inicioTempo) + " ms");
            iniciou = false;  // reseta para futuras execuções
        }
    }

    // Função que faz o merge de duas metades
    public static void merge(int[] array, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = array[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = array[middle + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }

    // Função para imprimir o array
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void resetContador() {
        contadorPassadas = 1;
    }
}
