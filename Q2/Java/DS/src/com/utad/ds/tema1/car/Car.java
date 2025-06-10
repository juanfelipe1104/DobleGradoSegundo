package com.utad.ds.tema1.car;

public class Car {
	private String marca;
	private String modelo;
	private String color;
	private Engine motor; 
	public Car(String marca, String modelo, String color, Engine motor) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.motor = motor;
	}
	public void encender() {
		this.motor.encender(); //Delegación por agregación
	}
	public void avanzar() {
		System.out.println("Avanzando");
	}
	public void parar() {
		System.out.println("Parando");
	}
	@Override
	public String toString() {
		return "Car [marca=" + this.marca + ", modelo=" + this.modelo + ", color=" + this.color + ", motor=" + this.motor + "]";
	}
	public static void main(String[] args) {
		Engine motor = new Engine("Diesel");
		Car coche = new Car("Tesla", "Model3", "Rojo", motor);
		coche.encender();
		coche.avanzar();
		coche.parar();
	}
}
