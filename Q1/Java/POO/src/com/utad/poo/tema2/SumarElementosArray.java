package com.utad.poo.tema2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumarElementosArray {
	public static final Integer CANT_NUM_DEFECTO = 10;
	private List<Integer> numeros;
	private Integer sumaElementos;
	public SumarElementosArray() {
		this(SumarElementosArray.CANT_NUM_DEFECTO);
	}
	public SumarElementosArray(Integer cantidadNumeros) {
		this.numeros = new ArrayList<Integer>();
		this.rellenarArray(cantidadNumeros);
		this.sumaElementos = this.sumarElementos();
	}
	private void rellenarArray(Integer cantidadNumeros) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < cantidadNumeros; i++) {
			System.out.println("Ingrese un numero:");
			this.numeros.add(scanner.nextInt());
		}
		scanner.close();
	}
	private int sumarElementos() {
		int sumaElementos = 0;
		for (int i = 0; i < this.numeros.size(); i++) {
			sumaElementos += this.numeros.get(i);
		}
		return sumaElementos;
	}
	public Integer getSumaElementos() {
		return this.sumaElementos;
	}
	@Override
	public String toString() {
		return "SumarElementosArray [numeros=" + this.numeros + ", sumaElementos=" + this.sumaElementos + "]";
	}
	
}
