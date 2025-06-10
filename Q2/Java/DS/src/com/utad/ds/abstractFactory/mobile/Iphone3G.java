package com.utad.ds.abstractFactory.mobile;

public class Iphone3G extends Iphone {
	public Iphone3G(String language) {
		super(language);
	}
	@Override
	public TypeConnectivity getTypeConnectivity() {
		return TypeConnectivity.T3G;
	}
	@Override
	public String toString() {
		return "Iphone3G [typeConnectivity=" + this.getTypeConnectivity() + 
				", getLanguage()" + super.getLanguage() +
				", getBrand()" + super.getBrand() + "]";
	}
}
