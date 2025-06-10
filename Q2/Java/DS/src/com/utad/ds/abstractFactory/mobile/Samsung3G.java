package com.utad.ds.abstractFactory.mobile;

public class Samsung3G extends Samsung {
	public Samsung3G(String language) {
		super(language);
	}
	@Override
	public TypeConnectivity getTypeConnectivity() {
		return TypeConnectivity.T3G;
	}
	@Override
	public String toString() {
		return "Samsung3G [typeConnectivity=" + this.getTypeConnectivity() + 
				", getLanguage()" + super.getLanguage() +
				", getBrand()" + super.getBrand() + "]";
	}
}
