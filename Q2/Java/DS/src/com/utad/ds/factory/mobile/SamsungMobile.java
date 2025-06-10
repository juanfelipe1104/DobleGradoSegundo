package com.utad.ds.factory.mobile;

public class SamsungMobile implements Mobile {
	private String language;
	public SamsungMobile(String language) {
		this.language = language;
	}
	@Override
	public String getBrand() {
		return "Samsung";
	}
	@Override
	public String getLanguage() {
		return this.language;
	}
}
