package com.utad.poo.tema3.practica2;

import java.util.ArrayList;
import java.util.List;

public class Lampara implements Comparable<Lampara>{
	public static final Integer MAX_LAMPARAS = 5;
	private static Integer contador = 0;
	private Integer numeroLampara;
	static {
		Lampara.contador = 0;
	}
	public static Integer posicionLampara(List<Lampara> lamparas, Lampara lampara) {
		Integer posicion = -1;
		boolean encontrado = false;
		for (int i = 0; (i < lamparas.size()) && !encontrado; i++) {
			if (lamparas.get(i).equals(lampara)) {
				posicion = i;
				encontrado = true;
			}
		}
		return posicion;
	}
	public Lampara() {
		this(Lampara.contador+1);
	}
	public Lampara(int numeroLampara) {
		this.numeroLampara = numeroLampara;
		Lampara.contador++;
	}
	public static int getContador() {
		return Lampara.contador;
	}
	public int getNumeroLampara() {
		return this.numeroLampara;
	}
	public void setNumeroLampara(int numeroLampara) {
		this.numeroLampara = numeroLampara;
	}
	public int compareTo(Lampara lampara) {
		return this.numeroLampara.compareTo(lampara.getNumeroLampara());
	}
	public boolean equals(Object obj) {
		boolean resultado = false;
		if (obj instanceof Lampara) {
			Lampara lampara = (Lampara)obj;
			resultado = this.numeroLampara.equals(lampara.getNumeroLampara());
		}
		return resultado;
	}
	public String toString() {
		return "Lampara [numeroLampara=" + this.numeroLampara + "]";
	}
	public static void main(String[] args) {
		List<Lampara> lamparas = new ArrayList<Lampara>();
		for (int i = 0; i < Lampara.MAX_LAMPARAS; i++) {
			lamparas.add(new Lampara());
		}
		System.out.println(lamparas);
	}
}
