package com.utad.ds.proyectoFinal.common;


import com.utad.ds.proyectoFinal.decorator.ActionComponent;

//Define el comportamiento de los personajes
public interface Character {
	public abstract void performAction(Character opponent);
	public abstract void playTurn(Character opponent);
	public abstract CharacterStats getCharacterStats();
	public abstract void removeSideEffect();
	public abstract void applyParalysis();
	public abstract void applyBleeding();
	public abstract void applySlowDown();
	public abstract void killCharacter();
	public abstract void increaseStats();
	public abstract Boolean isDead();
	public abstract Boolean hasEnoughMP();
	public abstract Boolean isFaster(Character opponent);
	public abstract void setCurrentAction(ActionComponent currentAction);
	public abstract ActionComponent getPhysicalAttackAction();
	public abstract void setPhysicalAttackAction(ActionComponent physicalAttackAction);
	public abstract ActionComponent getMagicAttackAction();
	public abstract void setMagicAttackAction(ActionComponent magicAttackAction);
	public abstract ActionComponent getGuardAction();
	public abstract void setGuardAction(ActionComponent guardAction);
	public abstract ActionComponent getHealAction();
	public abstract void setHealAction(ActionComponent healAction);
}
