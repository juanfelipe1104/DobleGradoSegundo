package com.utad.ds.proyectoFinal.abstractFactory.infernalExecutioner;

import com.utad.ds.proyectoFinal.common.Character;
import com.utad.ds.proyectoFinal.common.CharacterStats;
import com.utad.ds.proyectoFinal.common.Enemy;
import com.utad.ds.proyectoFinal.strategy.BalancedBehaviorStrategy;
import com.utad.ds.proyectoFinal.strategy.EnemyBehaviorStrategy;

public abstract class AbstractInfernalExecutioner extends Enemy implements InfernalExecutioner {
	public AbstractInfernalExecutioner(CharacterStats characterStats) {
		this(characterStats, new BalancedBehaviorStrategy());
	}
	public AbstractInfernalExecutioner(CharacterStats characterStats, EnemyBehaviorStrategy enemyBehaviorStrategy) {
		super(characterStats, enemyBehaviorStrategy);
	}
	@Override
	public void useSkill(Character target) {	
		this.increaseMagicDefense();
	}
	@Override
	public void increaseMagicDefense() {
		if(super.skillUses < Enemy.MAX_SKILL_USES) {
			super.characterStats.setMagicDef((int)(super.characterStats.getMagicDef()*Enemy.DEFAULT_SKILL_BOOST));
			super.skillUses++;
		}
	}
}
