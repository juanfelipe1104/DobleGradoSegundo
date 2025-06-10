package com.utad.ds.proyectoFinal.common;

import com.utad.ds.proyectoFinal.abstractFactory.boss.Boss;
import com.utad.ds.proyectoFinal.abstractFactory.boss.MostolesBoss;
import com.utad.ds.proyectoFinal.state.DeadState;
import com.utad.ds.proyectoFinal.strategy.BalancedBehaviorStrategy;
import com.utad.ds.proyectoFinal.strategy.EnemyBehaviorStrategy;

public abstract class Enemy extends GameCharacter{
	public static final Double DEFAULT_SKILL_BOOST = 1.1;
	public static final Integer MAX_SKILL_USES = 5;
	public static final Integer MP_COST = 50;
	protected EnemyBehaviorStrategy enemyBehaviorStrategy;
	protected Integer skillUses;
	public Enemy(CharacterStats characterStats) {
		this(characterStats, new BalancedBehaviorStrategy());
	}
	public Enemy(CharacterStats characterStats, EnemyBehaviorStrategy enemyBehaviorStrategy) {
		super(characterStats);
		this.increaseStats();
		this.enemyBehaviorStrategy = enemyBehaviorStrategy;
		this.skillUses = 0;
	}
	//Template method
	public void playTurn(Character target) {
		super.characterStats.setReflecting(false);
		super.characterStats.setGuarding(false);
		super.characterStats.setCanAttack(true);
		super.performEffect();
		if(super.characterStats.getCanAttack() && !(super.currentState instanceof DeadState)){
			this.performAction(target);
			this.useSkill(target);
		}
	}
	public void performAction(Character target) {
		try {
			this.enemyBehaviorStrategy.performAction(this, target); //Delegacion por agregacion
		}catch(ActionException actionException) {
			System.out.println(actionException.getMessage());
		}
	}
	public abstract void useSkill(Character character);
	public void setEnemyBehaviorStrategy(EnemyBehaviorStrategy enemyBehaviorStrategy){
		this.enemyBehaviorStrategy = enemyBehaviorStrategy;
	}
	@Override
	public String toString() {
		return "Enemy: " + super.toString() + "\n"
				+ this.enemyBehaviorStrategy;
	}
	public Boolean isBoss() {
		return this instanceof Boss;
	}
	public Boolean isFinalBoss() {
		return this instanceof MostolesBoss;
	}
}
