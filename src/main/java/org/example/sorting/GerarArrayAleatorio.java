package org.example.sorting;

import java.util.Random;

public class GerarArrayAleatorio {
    private static final Random RANDOM = new Random();

    public static int[] gerarArrayAleatorio(int tamanho, int limite) {
        int[] array = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            array[i] = RANDOM.nextInt(limite);
        }
        return array;
    }
}
