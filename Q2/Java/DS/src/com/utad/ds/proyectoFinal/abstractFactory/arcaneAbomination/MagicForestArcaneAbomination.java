package com.utad.ds.proyectoFinal.abstractFactory.arcaneAbomination;

import com.utad.ds.proyectoFinal.abstractFactory.MagicForestAbstractFactory;
import com.utad.ds.proyectoFinal.common.CharacterStats;
import com.utad.ds.proyectoFinal.decorator.SkillBoostComponentDecorator;
import com.utad.ds.proyectoFinal.strategy.DefensiveBehaviorStrategy;

public class MagicForestArcaneAbomination extends AbstractArcaneAbomination{
	private static Integer boostIncrease = 1;
	public MagicForestArcaneAbomination() {
		this(new CharacterStats("Bruja del bosque",0,40,30,40,20,80,200));
	}
	public MagicForestArcaneAbomination(CharacterStats characterStats) {
		super(characterStats,new DefensiveBehaviorStrategy());
		super.healAction = new SkillBoostComponentDecorator(super.healAction, MagicForestArcaneAbomination.boostIncrease++);
	}
	@Override
	public void increaseStats() {
		super.characterStats.increaseStats(MagicForestAbstractFactory.INCREASE_STATS);
	}
}
