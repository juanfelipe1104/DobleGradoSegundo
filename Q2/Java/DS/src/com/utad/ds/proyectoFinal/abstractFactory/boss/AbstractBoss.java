package com.utad.ds.proyectoFinal.abstractFactory.boss;

import com.utad.ds.proyectoFinal.common.Character;
import com.utad.ds.proyectoFinal.common.CharacterStats;
import com.utad.ds.proyectoFinal.common.Enemy;
import com.utad.ds.proyectoFinal.strategy.BalancedBehaviorStrategy;
import com.utad.ds.proyectoFinal.strategy.EnemyBehaviorStrategy;

public abstract class AbstractBoss extends Enemy implements Boss {
	protected Boolean revive;
	public AbstractBoss(CharacterStats characterStats) {
		this(characterStats, new BalancedBehaviorStrategy());
	}
	public AbstractBoss(CharacterStats characterStats, EnemyBehaviorStrategy enemyBehaviorStrategy) {
		super(characterStats, enemyBehaviorStrategy);
		this.revive = false;
	}
	@Override
	public void useSkill(Character target) {	
		this.revive();
	}
	@Override
	public void revive() {	
		if(!this.revive && super.isDead()){
			this.revive = true;
			System.out.println(super.characterStats.getName() + " ha revivido");
			super.characterStats.setHP(super.characterStats.getMaxHP());
			super.currentState = super.baseState;
		}
	}
}
