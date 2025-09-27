package org.example;

import org.example.sorting.BubbleSort;
import org.example.sorting.GerarArrayAleatorio;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] tamanhos = {100000}; // tamanhos de teste


        for (int n : tamanhos) {
            int[] dados = GerarArrayAleatorio.gerarArrayAleatorio(n, 1000000);
            BubbleSort.sort(dados);
        }
}}