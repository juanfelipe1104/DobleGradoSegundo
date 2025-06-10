package com.utad.poo.tema3.practica2;

public class Persona implements Comparable<Persona>{
	public static final String DEFAULT_NOMBRE = "Persona";
	public static final Integer DEFAULT_EDAD = 1;
	public static final String DEFAULT_DNI = "12345678Z";
	private String nombre;
	private Integer edad;
	private String dni;
	public static Persona mayor(Persona persona1, Persona persona2) {
		Persona persona = null;
		if (persona1.getEdad() > persona2.getEdad()) {
			persona = persona1;
		}
		else {
			persona = persona2;
		}
		return persona;
	}
	public Persona() {
		this(Persona.DEFAULT_NOMBRE);
	}
	public Persona(String nombre) {
		this(nombre, Persona.DEFAULT_EDAD);
	}
	public Persona(String nombre, Integer edad) {
		this(nombre, edad, Persona.DEFAULT_DNI);
	}
	public Persona(String nombre, Integer edad, String dni) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
	}
	public int compareTo(Persona persona) {
		return this.edad.compareTo(persona.edad);
	}
	public boolean equals(Object object) {
		boolean comparacion = false;
		if (object instanceof Persona) {
			Persona persona = (Persona)object;
			comparacion = this.dni.equals(persona.dni);
		}
		return comparacion;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return this.edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getDni() {
		return this.dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String toString() {
		return "Persona [nombre=" + this.nombre + ", edad=" + this.edad + ", dni=" + this.dni + "]";
	}
	public static void main(String[] args) {
		Persona persona20 = new Persona("Ines", 20);
		Persona persona25 = new Persona("Paco", 25);
		System.out.println("Entre Ines y Paco, la mayor es " + Persona.mayor(persona20, persona25));
	}
}
