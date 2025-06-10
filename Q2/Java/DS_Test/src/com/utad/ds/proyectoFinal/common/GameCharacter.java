package com.utad.ds.proyectoFinal.common;

import com.utad.ds.proyectoFinal.decorator.ActionComponent;
import com.utad.ds.proyectoFinal.decorator.BaseAttackAction;
import com.utad.ds.proyectoFinal.decorator.BaseGuardAction;
import com.utad.ds.proyectoFinal.decorator.BaseHealingAction;
import com.utad.ds.proyectoFinal.decorator.BaseMagicAction;
import com.utad.ds.proyectoFinal.state.BaseState;
import com.utad.ds.proyectoFinal.state.BleedingState;
import com.utad.ds.proyectoFinal.state.CharacterState;
import com.utad.ds.proyectoFinal.state.DeadState;
import com.utad.ds.proyectoFinal.state.ParalysisState;
import com.utad.ds.proyectoFinal.state.SlowDownState;

public abstract class GameCharacter implements Character{
	protected CharacterStats characterStats;
	
	protected CharacterState currentState;
	protected BaseState baseState;
	protected BleedingState bleedingState;
	protected ParalysisState paralysisState;
	protected SlowDownState slowDownState;
	protected DeadState deadState;
	
	protected ActionComponent currentAction;
	protected ActionComponent physicalAttackAction;
	protected ActionComponent magicAttackAction;
	protected ActionComponent guardAction;
	protected ActionComponent healAction;
	
	public GameCharacter(CharacterStats characterStats) {
		this.characterStats = characterStats;
		
		this.baseState = new BaseState(this);
		this.bleedingState = new BleedingState(this);
		this.paralysisState = new ParalysisState(this);
		this.slowDownState = new SlowDownState(this);
		this.deadState = new DeadState(this);
		this.currentState = this.baseState;
		
		//Las acciones al principio son basicas, luego las iremos decorando
		this.physicalAttackAction = new BaseAttackAction();
		this.magicAttackAction = new BaseMagicAction();
		this.healAction = new BaseHealingAction();
		this.guardAction = new BaseGuardAction();
		this.currentAction = this.physicalAttackAction;
	}
	public void performEffect() {
		this.currentState.performEffect(); //Delegación por composición
	}
	@Override
	public void removeSideEffect() {
		this.currentState.removeSideEffect(); //Delegación por composición
	}
	@Override
	public void applyParalysis() {
		this.currentState.applyParalysis(); //Delegación por composición
	}
	@Override
	public void applyBleeding() {
		this.currentState.applyBleeding(); //Delegación por composición
	}
	@Override
	public void applySlowDown() {
		this.currentState.applySlowDown(); //Delegación por composición
	}
	@Override
	public void killCharacter() {
		this.currentState.killCharacter(); //Delegación por composición
	}
	@Override
	public Boolean isDead() {
		return this.currentState instanceof DeadState;
	}
	@Override
	public Boolean hasEnoughMP() {
		return this.characterStats.getMP() >= Enemy.MP_COST;
	}
	@Override
	public Boolean isFaster(Character opponent){
		return this.characterStats.getSpeed() >= opponent.getCharacterStats().getSpeed();
	}
	@Override
	public CharacterStats getCharacterStats() { return this.characterStats; }
	public void setCurrentState(CharacterState characterState) { this.currentState = characterState;}
	public BaseState getBaseState() { return this.baseState; }
	public BleedingState getBleedingState() { return this.bleedingState; }
	public ParalysisState getParalysisState() { return this.paralysisState; }
	public SlowDownState getSlowDownState() { return this.slowDownState; }
	public DeadState getDeadState() { return this.deadState; }
	@Override
	public ActionComponent getPhysicalAttackAction() { return this.physicalAttackAction; }
	@Override
	public void setPhysicalAttackAction(ActionComponent physicalAttackAction) { this.physicalAttackAction = physicalAttackAction; }
	@Override
	public ActionComponent getMagicAttackAction() { return this.magicAttackAction; }
	@Override
	public void setMagicAttackAction(ActionComponent magicAttackAction) { this.magicAttackAction = magicAttackAction; }
	@Override
	public ActionComponent getGuardAction() { return this.guardAction; }
	@Override
	public void setGuardAction(ActionComponent guardAction) { this.guardAction = guardAction; }
	@Override
	public ActionComponent getHealAction() { return this.healAction; }
	@Override
	public void setHealAction(ActionComponent healAction) { this.healAction = healAction; }
	@Override
	public void setCurrentAction(ActionComponent currentAction) { this.currentAction = currentAction; }
	@Override
	public String toString() {
		return this.characterStats + "\n" + this.currentState;
	}
}
