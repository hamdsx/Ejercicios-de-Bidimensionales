package com.mycompany.ejercicio04;
import java.util.Scanner;
public class Ejercicio04 {
    public static int[][] transponerMatriz(int[][] matriz, int filas, int columnas) {
        int[][] transpuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }

        return transpuesta;
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
        System.out.print("Ingresa el numero de filas de la matriz: ");
        int filas = sc.nextInt();

        System.out.print("Ingresa el numero de columnas de la matriz: ");
        int columnas = sc.nextInt();

        int[][] matriz = new int[filas][columnas];

        System.out.println("Ingresa los elementos de la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatriz original:");
        imprimirMatriz(matriz);

        int[][] transpuesta = transponerMatriz(matriz, filas, columnas);
        System.out.println("\nMatriz transpuesta:");
        imprimirMatriz(transpuesta);
    }
}


