package com.utad.poo.tema7;

public class Country implements Comparable<Country>{
	public static final Integer DEFAULT_POBL = -1;
	private String nombre;
	private String ISOCode;
	private String continente;
	private Integer poblacionEnMillones;
	public Country(String nombre, String ISOCode, String continente) {
		this(nombre, ISOCode, continente, Country.DEFAULT_POBL);
	}
	public Country(String nombre, String ISOCode, String continente, String poblacionEnMillones) {
		this(nombre, ISOCode, continente, Country.DEFAULT_POBL);
	}
	public Country(String nombre, String ISOCode, String continente, Integer poblacionEnMillones) {
		this.nombre = nombre;
		this.ISOCode = ISOCode;
		this.continente = continente;
		this.poblacionEnMillones = poblacionEnMillones;
	}
	public int compareTo(Country otherCountry) {
		return this.poblacionEnMillones.compareTo(otherCountry.poblacionEnMillones);
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getISOCode() {
		return this.ISOCode;
	}
	public void setISOCode(String iSOCode) {
		this.ISOCode = iSOCode;
	}
	public String getContinente() {
		return this.continente;
	}
	public void setContinente(String continente) {
		this.continente = continente;
	}
	public Integer getPoblacionEnMillones() {
		return this.poblacionEnMillones;
	}
	public void setPoblacionEnMillones(Integer poblacionEnMillones) {
		this.poblacionEnMillones = poblacionEnMillones;
	}
	public String toString() {
		return "Country [nombre=" + this.nombre + ", ISOCode=" + this.ISOCode + ", continente=" + this.continente
				+ ", poblacionEnMillones=" + this.poblacionEnMillones + "]";
	}
}
