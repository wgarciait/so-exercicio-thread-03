package br.com.so.exercicio.thread;

import java.security.SecureRandom;
import java.util.Random;

public class View {

    public static void main(String[] args) {
        final int linha = 3;
        final int coluna = 5;
        int[][] matriz = new int[linha][coluna];

        // populando a matriz com valores aleatorios de 0 a 10
        for(int x = 0; x < linha; x++) {
            for (int y = 0; y < coluna; y++) {
                matriz[x][y] = new SecureRandom().nextInt(10);
            }
        }

        int qtdThreads = 3;

        for (int i = 0; i < qtdThreads; i++) {
            ThreadMatriz threadMatriz = new ThreadMatriz(matriz);
            threadMatriz.start();
        }

    }
}
