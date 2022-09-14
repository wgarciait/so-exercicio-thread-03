package br.com.so.exercicio.thread;

public class ThreadMatriz extends Thread {

    private int[][] matriz;

    public ThreadMatriz(int[][] matriz) {
       this.matriz = matriz;
    }

    @Override
    public void run() {
        int somaColunas = 0;
        for(int linha = 0; linha < matriz.length; linha++) {
            for(int coluna = 0; coluna < matriz[linha].length; coluna ++) {
                somaColunas = somaColunas + matriz[linha][coluna];
            }
            System.out.println("Thread Id=" + getId() + " - Linha=" + linha + " - Soma=" + somaColunas);
        }

    }
}
