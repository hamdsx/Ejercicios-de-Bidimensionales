package com.mycompany.ejercicio01;
import java.util.Scanner;
public class Ejercicio01 {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leyendo la dimensión de la matriz
        System.out.print("Introduce la dimension de la matriz: ");
        int d = scanner.nextInt();

        // Creando la matriz y leyendo sus elementos
        int[][] matriz = new int[d][d];
        System.out.println("Introduce los elementos de la matriz:");
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Mostrando la matriz
        System.out.println("\nMatriz ingresada:");
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Calculando las sumas de las diagonales
        int sumaDiagonalPrincipal = 0;
        int sumaDiagonalSecundaria = 0;

        for (int i = 0; i < d; i++) {
            sumaDiagonalPrincipal += matriz[i][i];
            sumaDiagonalSecundaria += matriz[i][d - 1 - i];
        }

        // Imprimiendo los resultados
        System.out.println("\nLa Suma de la diagonal principal: " + sumaDiagonalPrincipal);
        System.out.println("La Suma de la diagonal secundaria: " + sumaDiagonalSecundaria);
    }
}