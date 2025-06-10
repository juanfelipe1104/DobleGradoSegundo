package com.utad.poo.tema2.practica2;

public class Ejercicio11 {
	public static final int [][] MATRIZ1 = {{1,2,3},{4,5,6}};
	public static final int [][] MATRIZ2 = {{7,8}, {9,1}, {2,3}};
	public static void main(String[] args) {
		Ejercicio11.imprimirMatriz(multiplicarMatrices(Ejercicio11.MATRIZ1, Ejercicio11.MATRIZ2));
	}
	public static int [][] multiplicarMatrices (int [][] matriz1, int [][] matriz2){
		int [][] resultado = new int [matriz1.length][matriz2[0].length];
		Integer filasMatriz1 = 0, columnasMatriz1 = 0, filasMatriz2 = 0, columnasMatriz2 = 0;
		filasMatriz1 = matriz1.length;
		columnasMatriz1 = matriz1[0].length;
		filasMatriz2 = matriz2.length;
		columnasMatriz2 = matriz2[0].length;
		if (!columnasMatriz1.equals(filasMatriz2)) {
			System.out.println("Las matrices no se pueden multiplicar");
		}
		else {
			for (int i = 0; i < filasMatriz1; i++) {
				for (int j = 0; j < columnasMatriz2; j++) {
					for (int k = 0; k < filasMatriz2; k++) {
						resultado[i][j] += matriz1[i][k] * matriz2[k][j];
					}
				}
			}
		}
		return resultado;
	}
	public static void imprimirMatriz (int [][] matriz){
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print("[" + matriz[i][j] + "]");
			}
			System.out.println();
		}
	}
}
