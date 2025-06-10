package com.utad.ds.proyectoPersonal.common;

public enum StageType {
	TRANSPORT("Transport"), ACTIVITY("Activity");
	private String type;
	private StageType(String type) {
		this.type = type;
		
	}
	public String getType() {
		return this.type;
	}
}
