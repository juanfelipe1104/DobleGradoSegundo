package com.utad.poo.tema5;

public class ThrowArrayIndexException {
	public static void generaExcepcion(int indiceDelVector) throws ArrayIndexOutOfBoundsException {
		int numeros[] = {0,1,2,3,4,5};
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		System.out.println(numeros[indiceDelVector]);
	}
	public static void main(String[] args) {
		try {
			ThrowArrayIndexException.generaExcepcion(4);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("El indice no es valido " + e.getClass());
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Se ejecuta siempre");
		}
	}
}
