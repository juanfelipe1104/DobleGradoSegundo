package com.utad.poo.tema4;

public class Producto {
	protected String nombre;
	protected Double precio;
	public Producto(String nombre, Double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecio() {
		return this.precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public String toString() {
		return "Producto [nombre=" + this.nombre + ", codigoBarras=" + ", precio=" + this.precio + "]";
	}
}
