package com.utad.ds.abstractFactory.mobile;

public class Motorola3G extends Motorola{
	public Motorola3G(String language) {
		super(language);
	}
	@Override
	public TypeConnectivity getTypeConnectivity() {
		return TypeConnectivity.T3G;
	}
	@Override
	public String toString() {
		return "Motorola3G [typeConnectivity=" + this.getTypeConnectivity() + 
				", getLanguage()" + super.getLanguage() +
				", getBrand()" + super.getBrand() + "]";
	}
}
