package com.utad.ds.abstractFactory.mobile;

public abstract class Iphone implements Mobile {
	private String language;
	public Iphone(String language) {
		this.language = language;
	}
	public String getBrand() {
		return "Iphone";
	}
	public String getLanguage() {
		return this.language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
}
