package com.utad.ds.proyectoFinal.decorator;

public enum ActionType{	
	ATK("Ataque físico"), MAG("Hechizo ofensivo"), HEAL("Hechizo curativo"), GUARD("Protección");
	private final String actionName;
	private ActionType(String actionName){
		this.actionName = actionName;
	}
	public String getActionName() { return this.actionName; }
}
