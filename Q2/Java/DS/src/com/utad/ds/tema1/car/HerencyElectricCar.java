package com.utad.ds.tema1.car;

public class HerencyElectricCar extends Car {
	public HerencyElectricCar(String marca, String modelo, String color) {
		super(marca, modelo, color, new Engine("Electrico"));
	}
	public static void main(String[] args) {
		Car coche = new HerencyElectricCar("Tesla", "Model3", "Rojo");
		coche.encender();
		coche.avanzar();
		coche.parar();
	}
}
