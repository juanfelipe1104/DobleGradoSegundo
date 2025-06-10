package com.utad.ds.abstractFactory.mobile;

public class Iphone4G extends Iphone {
	public Iphone4G(String language) {
		super(language);
	}
	@Override
	public TypeConnectivity getTypeConnectivity() {
		return TypeConnectivity.T4G;
	}
	@Override
	public String toString() {
		return "Iphone4G [typeConnectivity=" + this.getTypeConnectivity() + 
				", getLanguage()" + super.getLanguage() +
				", getBrand()" + super.getBrand() + "]";
	}
}
