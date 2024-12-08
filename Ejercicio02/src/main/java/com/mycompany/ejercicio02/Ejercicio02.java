package com.mycompany.ejercicio02;
import java.util.Scanner;
public class Ejercicio02 {

    public static void rotar90(int[][] matriz) {
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matriz[i][j];
                matriz[i][j] = matriz[i][n - j - 1];
                matriz[i][n - j - 1] = temp;
            }
        }
    }
    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la dimension de la matriz (n x n): ");
        int n = sc.nextInt();
        int[][] matriz = new int[n][n];
        System.out.println("Ingresa los elementos de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nMatriz original:");
        imprimirMatriz(matriz);

        rotar90(matriz);

        System.out.println("\nMatriz rotada 90 grados:");
        imprimirMatriz(matriz);
    }
}