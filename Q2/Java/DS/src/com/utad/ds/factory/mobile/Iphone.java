package com.utad.ds.factory.mobile;

public class Iphone implements Mobile {
	private String language;
	public Iphone(String language) {
		this.language = language;
	}
	@Override
	public String getBrand() {
		return "Iphone";
	}
	@Override
	public String getLanguage() {
		return this.language;
	}

}
