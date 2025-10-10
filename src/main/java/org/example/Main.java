package org.example;

import org.example.sorting.BubbleSort;
import org.example.sorting.GerarArrayAleatorio;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] tamanhos = {200}; // tamanhos de teste


        for (int n : tamanhos) {
            int[] dados = GerarArrayAleatorio.gerarArrayAleatorio(n, 200);
            BubbleSort.sort(dados);
        }
}}