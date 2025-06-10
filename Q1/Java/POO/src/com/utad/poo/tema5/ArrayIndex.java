package com.utad.poo.tema5;

public class ArrayIndex {
	public static void main(String[] args) {
		int numeros[] = {0,1,2,3,4,5};
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		int indiceDelValor = 6;
		try {
			System.out.println(numeros[indiceDelValor]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("El indice no es valido " + e.getClass());
			System.out.println(e.getMessage());
		}
	}
}
