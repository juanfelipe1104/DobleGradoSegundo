package com.utad.poo.tema4;

import com.utad.poo.tema3.practica1.*;
public class Alimenticio extends Producto {
	private Fecha fechaDeCaducidad;
	public Alimenticio(String nombre, Double precio) {
		this(nombre, precio, new Fecha());
	}
	public Alimenticio(String nombre, Double precio, Fecha fechaDeCaducidad) {
		super(nombre, precio);
		this.fechaDeCaducidad = fechaDeCaducidad;
		this.comprobarFechaCaducidad();
	}
	public Fecha getFechaDeCaducidad() {
		return this.fechaDeCaducidad;
	}
	public void setFechaDeCaducidad(Fecha fechaDeCaducidad) {
		this.fechaDeCaducidad = fechaDeCaducidad;
	}
	public String toString() {
		return "Alimenticio [fechaDeCaducidad=" + this.fechaDeCaducidad + "]" + super.toString();
	}
	private void comprobarFechaCaducidad() {
		if (this.fechaDeCaducidad.equals(new Fecha())) {
			this.precio *= 0.8;
		}
	}
	public static void main(String[] args) {
		
	}
}
