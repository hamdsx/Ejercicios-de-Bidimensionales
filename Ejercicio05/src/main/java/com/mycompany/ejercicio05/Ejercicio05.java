package com.mycompany.ejercicio05;
import java.util.Scanner;
public class Ejercicio05 {

    public static boolean esSimetrica(int[][] matriz, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int j = 0; j < fila.length; j++) {
                System.out.print(fila[j]);
                if (j < fila.length - 1) {
                    System.out.print("-");
                }
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

        System.out.println("\nMatriz ingresada:");
        imprimirMatriz(matriz);

        if (esSimetrica(matriz, n)) {
            System.out.println("\nLa matriz es simetrica.");
        } else {
            System.out.println("\nLa matriz no es simetrica.");
        }
    }
}
