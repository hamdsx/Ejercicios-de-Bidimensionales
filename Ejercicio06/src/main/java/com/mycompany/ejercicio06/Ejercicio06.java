package com.mycompany.ejercicio06;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio06 {

    public static List<Integer> recorrerEnEspiral(int[][] 
         matriz, int filas, int columnas) {
        List<Integer> resultado = new ArrayList<>();

        int inicioFila = 0, finFila = filas - 1;
        int inicioColumna = 0, finColumna = columnas - 1;

        while (inicioFila <= finFila && inicioColumna <= finColumna) {
            for (int j = inicioColumna; j <= finColumna; j++) {
                resultado.add(matriz[inicioFila][j]);
            }
            inicioFila++;

            for (int i = inicioFila; i <= finFila; i++) {
                resultado.add(matriz[i][finColumna]);
            }
            finColumna--;

            if (inicioFila <= finFila) {
                for (int j = finColumna; j >= inicioColumna; j--) {
                    resultado.add(matriz[finFila][j]);
                }
                finFila--;
            }

            if (inicioColumna <= finColumna) {
                for (int i = finFila; i >= inicioFila; i--) {
                    resultado.add(matriz[i][inicioColumna]);
                }
                inicioColumna++;
            }
        }
        return resultado;
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
        System.out.println("\nMatriz ingresada:");
        imprimirMatriz(matriz);
        List<Integer> recorrido = recorrerEnEspiral(matriz, filas, columnas);
        System.out.println("\nRecorrido en espiral: " + recorrido);
    }
}



