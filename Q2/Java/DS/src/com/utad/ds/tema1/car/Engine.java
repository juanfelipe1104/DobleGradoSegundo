package com.utad.ds.tema1.car;

public class Engine {
	private String tipo;
	public Engine(String tipo) {
		this.tipo = tipo;
	}
	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void encender() {
		System.out.println(this.tipo + " encendido");
	}
	public static void main(String[] args) {
		Engine motorElectrico = new Engine("Electrico");
		motorElectrico.encender();
	}
}
