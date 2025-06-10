package com.utad.ds.abstractFactory.mobile;

public abstract class Samsung implements Mobile {
	private String language;
	public Samsung(String language) {
		this.language = language;
	}
	public String getBrand() {
		return "Samsung";
	}
	public String getLanguage() {
		return this.language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
}
