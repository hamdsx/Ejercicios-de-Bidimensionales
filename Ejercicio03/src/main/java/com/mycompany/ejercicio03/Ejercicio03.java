package com.mycompany.ejercicio03;
import java.util.Scanner;
public class Ejercicio03 {
     public static int calculandoPerimetro(int[][] matriz) {
        int n = matriz.length;
        StringBuilder numerosSumados = new StringBuilder();
        int suma = 0;
        for (int j = 0; j < n; j++) {
            suma += matriz[0][j];
            numerosSumados.append(matriz[0][j]).append("+");
        }
        for (int j = 0; j < n; j++) {
            if (n > 1) {
                suma += matriz[n - 1][j];
                numerosSumados.append(matriz[n - 1][j]).append("+");
            }
        }
        for (int i = 1; i < n - 1; i++) {
            suma += matriz[i][0];
            numerosSumados.append(matriz[i][0]).append("+");

            suma += matriz[i][n - 1];
            numerosSumados.append(matriz[i][n - 1]).append("+");
        }
        if (numerosSumados.length() > 0) {
            numerosSumados.setLength(numerosSumados.length() - 1);
        }
        System.out.println("Resultado: " + numerosSumados + " = " + suma);

        return suma;
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

        System.out.println("\nMatriz:");
        imprimirMatriz(matriz);

        calculandoPerimetro(matriz);
    }
}


