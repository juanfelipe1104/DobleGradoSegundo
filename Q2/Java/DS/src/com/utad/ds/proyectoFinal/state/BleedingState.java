package com.utad.ds.proyectoFinal.state;

import com.utad.ds.proyectoFinal.common.GameCharacter;

public class BleedingState implements CharacterState{
	private GameCharacter character;
	public BleedingState(GameCharacter character) {
		this.character = character;
	}
	@Override
	public void performEffect() {
		this.character.getCharacterStats().setHP((int)(this.character.getCharacterStats().getHP() * 0.95));
		System.out.println(this.character.getCharacterStats().getName() + " sufre de sangrado");
		if(this.character.getCharacterStats().getHP() <= 0) {
			this.killCharacter();
		}
	}
	@Override
	public void removeSideEffect() {
		this.character.setCurrentState(this.character.getBaseState());
	}
	@Override
	public void applyParalysis() {
		// Can't
	}
	@Override
	public void applyBleeding() {
		// Can't	
	}
	@Override
	public void applySlowDown() {
		// Can't
	}
	@Override
	public void killCharacter() {
		this.character.setCurrentState(this.character.getDeadState());
	}
	@Override
	public String toString() {
		return "BleedingState";
	}
}
