package com.utad.ds.proyectoFinal.state;

import com.utad.ds.proyectoFinal.common.GameCharacter;

public class BaseState implements CharacterState {
	private GameCharacter character;
	public BaseState(GameCharacter character) {
		this.character = character;
	}
	@Override
	public void performEffect() {
		//None
	}
	@Override
	public void removeSideEffect() {
		//None
	}
	@Override
	public void applyParalysis() {
		this.character.setCurrentState(this.character.getParalysisState());
		System.out.println(this.character.getCharacterStats().getName() + " ha sido paralizado.");
	}
	@Override
	public void applyBleeding() {
		this.character.setCurrentState(this.character.getBleedingState());
		System.out.println(this.character.getCharacterStats().getName() + " le han apuñalado");
	}
	@Override
	public void applySlowDown() {
		this.character.setCurrentState(this.character.getSlowDownState());
		System.out.println(this.character.getCharacterStats().getName() + " ha sido ralentizado");
	}
	@Override
	public void killCharacter() {
		this.character.setCurrentState(this.character.getDeadState());
		System.out.println(this.character.getCharacterStats().getName() + " ha muerto");
	}
	@Override
	public String toString() {
		return "BaseState";
	}
}
