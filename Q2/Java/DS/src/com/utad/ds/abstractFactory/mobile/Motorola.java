package com.utad.ds.abstractFactory.mobile;

public abstract class Motorola implements Mobile {
	private String language;
	public Motorola(String language) {
		this.language = language;
	}
	public String getBrand() {
		return "Motorola";
	}
	public String getLanguage() {
		return this.language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
}
