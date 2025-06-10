package com.utad.ds.proyectoFinal.state;

import com.utad.ds.proyectoFinal.common.GameCharacter;

public class DeadState implements CharacterState {
	private GameCharacter character;
	public DeadState(GameCharacter character) {
		this.character = character;
	}
	@Override
	public void performEffect() {
		System.out.println(this.character.getCharacterStats().getName() + " esta muerto");
	}
	@Override
	public void removeSideEffect() {
		// None	
	}
	@Override
	public void applyParalysis() {
		// None	
	}
	@Override
	public void applyBleeding() {
		// None	
	}

	@Override
	public void applySlowDown() {
		// None
	}
	@Override
	public void killCharacter() {
		// None
	}
	@Override
	public String toString() {
		return "DeadState";
	}
}
