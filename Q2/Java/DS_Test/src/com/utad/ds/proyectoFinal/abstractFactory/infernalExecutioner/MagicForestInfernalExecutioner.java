package com.utad.ds.proyectoFinal.abstractFactory.infernalExecutioner;

import com.utad.ds.proyectoFinal.abstractFactory.MagicForestAbstractFactory;
import com.utad.ds.proyectoFinal.common.CharacterStats;
import com.utad.ds.proyectoFinal.decorator.InflictParalysisComponentDecorator;
import com.utad.ds.proyectoFinal.strategy.DefensiveBehaviorStrategy;

public class MagicForestInfernalExecutioner extends AbstractInfernalExecutioner{
	private static Integer boostIncrease = 1;
	public MagicForestInfernalExecutioner(){
		this(new CharacterStats("Araña magica",60,0,40,20,20,100,0));
	}
	public MagicForestInfernalExecutioner(CharacterStats characterStats){
		super(characterStats, new DefensiveBehaviorStrategy());
		super.physicalAttackAction = new InflictParalysisComponentDecorator(super.physicalAttackAction, MagicForestInfernalExecutioner.boostIncrease++);
	}
	@Override
	public void increaseStats() {
		super.characterStats.increaseStats(MagicForestAbstractFactory.INCREASE_STATS);
	}
}
