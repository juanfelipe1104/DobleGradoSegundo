package com.utad.ds.proyectoFinal.common;

public class AntidoteItem implements Item{
	public void useItem(Character character) {
		character.removeSideEffect();
		((Player)character).getInventory().remove(this);
	}
	public String getName() {
		return "Antídoto";
	}
	public String getDescription() {
		return "Cura los efectos alterados";
	}
	public String toString(){
		return this.getName() + ": " + this.getDescription();
	}
}
