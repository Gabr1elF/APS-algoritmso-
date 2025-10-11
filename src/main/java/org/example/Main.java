package org.example;

import org.example.sorting.BubbleSort;
import org.example.sorting.GerarArrayAleatorio;
import org.example.sorting.MergeSort;

import java.util.Arrays;

import static org.example.sorting.MergeSort.merge;

public class Main {
    public static void main(String[] args) {
        int[] tamanhos = {20}; // tamanhos de teste




        for (int n : tamanhos) {
            int[] meme = GerarArrayAleatorio.gerarArrayAleatorio(n, 20);
            MergeSort.mergeSort(meme, 0, meme.length - 1); // chamada correta
            MergeSort.printArray(meme); // opcional: para mostrar o resultado
        }
    }
    }

