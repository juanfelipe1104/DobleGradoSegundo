package com.utad.ds.abstractFactory.mobile;

public class Samsung4G extends Samsung {
	public Samsung4G(String language) {
		super(language);
	}
	@Override
	public TypeConnectivity getTypeConnectivity() {
		return TypeConnectivity.T4G;
	}
	@Override
	public String toString() {
		return "Samsung4G [typeConnectivity=" + this.getTypeConnectivity() + 
				", getLanguage()" + super.getLanguage() +
				", getBrand()" + super.getBrand() + "]";
	}
}
