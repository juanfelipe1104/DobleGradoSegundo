package com.utad.ds.proyectoFinal.abstractFactory.arcaneAbomination;

import com.utad.ds.proyectoFinal.abstractFactory.MostolesAbstractFactory;
import com.utad.ds.proyectoFinal.decorator.SkillBoostComponentDecorator;
import com.utad.ds.proyectoFinal.strategy.MagicOffensiveBehaviorStrategy;
import com.utad.ds.proyectoFinal.common.CharacterStats;

public class MostolesArcaneAbomination extends AbstractArcaneAbomination{
	private static Integer boostIncrease = 1;
	public MostolesArcaneAbomination() {
		this(new CharacterStats("Master de las cryptos(timos)",0,80,60,80,40,160,400));
	}
	public MostolesArcaneAbomination(CharacterStats characterStats) {
		super(characterStats, new MagicOffensiveBehaviorStrategy());
		super.magicAttackAction = new SkillBoostComponentDecorator(super.magicAttackAction, MostolesArcaneAbomination.boostIncrease++);
	}	
	@Override
	public void increaseStats() {
		super.characterStats.increaseStats(MostolesAbstractFactory.INCREASE_STATS);
	}
}
