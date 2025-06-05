package com.utad.ds.proyectoFinal.common;

public class MpPotionItem implements Item{
	public static final Integer MP_HEALED = 50;
	public void useItem(Character character) {
		character.getCharacterStats().setMP(character.getCharacterStats().getMP() + MP_HEALED);
		if(character.getCharacterStats().getMP() > character.getCharacterStats().getMaxMP())
		{
			character.getCharacterStats().setMP(character.getCharacterStats().getMaxMP());
		}
		((Player)character).getInventory().remove(this);
	}
	public String getName() {
		return "Poción de maná";
	}
	public String getDescription() {
		return "Recupera " + MpPotionItem.MP_HEALED + " puntos de magia";
	}
	public String toString(){
		return this.getName() + ": " + this.getDescription();
	}
}
