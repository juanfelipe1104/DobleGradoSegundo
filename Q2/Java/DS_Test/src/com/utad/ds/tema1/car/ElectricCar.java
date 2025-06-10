package com.utad.ds.tema1.car;

public class ElectricCar {
	private String marca;
	private String modelo;
	private String color;
	private Engine motor;
	public ElectricCar(String marca, String modelo, String color) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.motor = new Engine("Electrico");
	}
	public void encender() {
		this.motor.encender();
	}
	public void avanzar() {
		System.out.println("Avanzando");
	}
	public void parar() {
		System.out.println("Parando");
	}
	public static void main(String[] args) {
		ElectricCar cocheElectrico = new ElectricCar("Tesla", "Model3", "Blanco");
		cocheElectrico.encender();
		cocheElectrico.avanzar();
		cocheElectrico.parar();
	}
	@Override
	public String toString() {
		return "ElectricCar [marca=" + this.marca + ", modelo=" + this.modelo + ", color=" + this.color + ", motor=" + this.motor + "]";
	}
}
