package org.example.sorting;

import java.util.Arrays;

public class MergeSort {

    // Função principal que será chamada no main
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);

            merge(array, left, middle, right);


        }
    }





    // Função que faz o merge de duas metades
    private static void merge(int[] array, int left, int middle, int right) {


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

        int i = 0, j = 0;
        int k = left;

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

        System.out.println("Passada " + (i+1) + ": " + Arrays.toString(array));
    }

    // Função para imprimir o array
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Teste no main utilizando a classe GerarArrayAleatorio
    public static void main(String[] args) {

        long inicio = System.currentTimeMillis();

        // Gera um array aleatório de tamanho 10, com valores entre
        int[] array = GerarArrayAleatorio.gerarArrayAleatorio(20, 200);

        System.out.println("Array original:");
        printArray(array);

        mergeSort(array, 0, array.length - 1);

        long fim = System.currentTimeMillis();

        System.out.println("Tempo: " + (fim-inicio) + " ms \n \n \n \n");
    }
}



