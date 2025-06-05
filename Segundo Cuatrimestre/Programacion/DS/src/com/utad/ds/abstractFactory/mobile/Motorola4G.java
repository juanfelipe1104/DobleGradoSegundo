package com.utad.ds.abstractFactory.mobile;

public class Motorola4G extends Motorola {
	public Motorola4G(String language) {
		super(language);
	}
	@Override
	public TypeConnectivity getTypeConnectivity() {
		return TypeConnectivity.T4G;
	}
	@Override
	public String toString() {
		return "Motorola4G [typeConnectivity=" + this.getTypeConnectivity() + 
				", getLanguage()" + super.getLanguage() +
				", getBrand()" + super.getBrand() + "]";
	}
}
