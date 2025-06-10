package com.utad.poo.tema4;

public class Ropa extends Producto {
	public static final String MATERIAL_DEFECTO = "N/A";
	private String material;
	public Ropa(String nombre, Double precio) {
		this(nombre, precio, Ropa.MATERIAL_DEFECTO);
	}
	public Ropa(String nombre, Double precio, String material) {
		super(nombre, precio);
		this.material = material;
	}
	public String getMaterial() {
		return this.material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String toString() {
		return "Ropa [material=" + material + "]";
	}
}
