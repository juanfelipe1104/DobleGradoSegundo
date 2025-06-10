package com.utad.ds.proyectoFinal.abstractFactory.ironcladBrute;

import com.utad.ds.proyectoFinal.common.Character;
import com.utad.ds.proyectoFinal.common.CharacterStats;
import com.utad.ds.proyectoFinal.common.Enemy;
import com.utad.ds.proyectoFinal.strategy.BalancedBehaviorStrategy;
import com.utad.ds.proyectoFinal.strategy.EnemyBehaviorStrategy;

public abstract class AbstractIronCladBrute extends Enemy implements IroncladBrute {
	public AbstractIronCladBrute(CharacterStats characterStats) {
		this(characterStats, new BalancedBehaviorStrategy());
	}
	public AbstractIronCladBrute(CharacterStats characterStats, EnemyBehaviorStrategy enemyBehaviorStrategy) {
		super(characterStats, enemyBehaviorStrategy);
	}
	@Override
	public void useSkill(Character target) {	
		this.increasePhysicalDefense();
	}
	@Override
	public void increasePhysicalDefense() {
		if(super.skillUses < Enemy.MAX_SKILL_USES) {
			super.characterStats.setPhysicalDef((int)(super.characterStats.getPhysicalDef()*Enemy.DEFAULT_SKILL_BOOST));
			super.skillUses++;
		}
	}
}
