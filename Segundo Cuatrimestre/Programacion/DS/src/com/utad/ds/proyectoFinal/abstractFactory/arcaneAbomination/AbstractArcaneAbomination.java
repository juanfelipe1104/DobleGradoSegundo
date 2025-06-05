package com.utad.ds.proyectoFinal.abstractFactory.arcaneAbomination;

import com.utad.ds.proyectoFinal.common.Character;
import com.utad.ds.proyectoFinal.common.CharacterStats;
import com.utad.ds.proyectoFinal.common.Enemy;
import com.utad.ds.proyectoFinal.strategy.BalancedBehaviorStrategy;
import com.utad.ds.proyectoFinal.strategy.EnemyBehaviorStrategy;

public abstract class AbstractArcaneAbomination extends Enemy implements ArcaneAbomination {
	protected Boolean followUpAttack;
	public AbstractArcaneAbomination(CharacterStats characterStats) {
		this(characterStats, new BalancedBehaviorStrategy());
	}
	public AbstractArcaneAbomination(CharacterStats characterStats, EnemyBehaviorStrategy enemyBehaviorStrategy) {
		super(characterStats, enemyBehaviorStrategy);
		this.followUpAttack = false;
	}
	@Override
	public void followUpAttack(Character opponent) {	
		if(!this.followUpAttack){
			this.followUpAttack = true;
			System.out.println(super.characterStats.getName() + " ataca de nuevo");
			super.performAction(opponent);
		}
	}
	@Override
	public void useSkill(Character opponent) {	
		this.followUpAttack(opponent);
	}
}
