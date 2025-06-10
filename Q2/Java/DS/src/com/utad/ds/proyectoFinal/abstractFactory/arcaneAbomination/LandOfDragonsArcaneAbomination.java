package com.utad.ds.proyectoFinal.abstractFactory.arcaneAbomination;

import com.utad.ds.proyectoFinal.abstractFactory.LandOfDragonsAbstractFactory;
import com.utad.ds.proyectoFinal.common.CharacterStats;
import com.utad.ds.proyectoFinal.decorator.InflictParalysisComponentDecorator;
import com.utad.ds.proyectoFinal.strategy.MagicOffensiveBehaviorStrategy;

public class LandOfDragonsArcaneAbomination extends AbstractArcaneAbomination {
	private static Integer boostIncrease = 1;
	public LandOfDragonsArcaneAbomination() {
		this(new CharacterStats("Dragon de mana",0,60,45,60,20,80,300));
	}
	public LandOfDragonsArcaneAbomination(CharacterStats characterStats) {
		super(characterStats, new MagicOffensiveBehaviorStrategy());
		super.magicAttackAction = new InflictParalysisComponentDecorator(super.magicAttackAction,LandOfDragonsArcaneAbomination.boostIncrease++);
	}
	@Override
	public void increaseStats() {
		super.characterStats.increaseStats(LandOfDragonsAbstractFactory.INCREASE_STATS);
	}
}
