package org.example.sorting;

import java.util.Arrays;

public class QuickSort {
    public static int[] sort(int[] array) {

        long inicio = System.currentTimeMillis();
        quickSort(array);
        long fim = System.currentTimeMillis();
        long tempoExecucao = fim - inicio;
        System.out.println("Tempo QuickSort: " + tempoExecucao + " Ns");
        return array;
    }

    public static int[] quickSort(int[] array) {
        System.out.println(Arrays.toString(array));
        return array;
    }


    public static void main(String[] args) {
        int[] tamanhos = {10, 2, 3, 4, 80};
        for(int n : tamanhos){
            QuickSort.sort(GerarArrayAleatorio.gerarArrayAleatorio(n, 100));
        }
    }
}


