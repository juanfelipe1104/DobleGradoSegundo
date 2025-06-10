package com.utad.ds.abstractFactory.mobile;

public enum Language {
	ENGLISH("en"), SPANISH("es");
	private String isoCode;
	private Language(String isoCode) {
		this.isoCode = isoCode;
	}
	public String getIsoCode() {
		return this.isoCode;
	}
}
