package com.utad.ds.proyectoFinal.abstractFactory.infernalExecutioner;

import com.utad.ds.proyectoFinal.abstractFactory.LandOfDragonsAbstractFactory;
import com.utad.ds.proyectoFinal.common.CharacterStats;
import com.utad.ds.proyectoFinal.decorator.AbsorbDamageComponentDecorator;
import com.utad.ds.proyectoFinal.strategy.OffensiveBehaviorStrategy;

public class LandOfDragonsInfernalExecutioner extends AbstractInfernalExecutioner{
	private static Integer boostIncrease = 1;
	public LandOfDragonsInfernalExecutioner(){
		this(new CharacterStats("Dragon veloz",90,0,60,30,30,150,0));
	}
	public LandOfDragonsInfernalExecutioner(CharacterStats characterStats){
		super(characterStats, new OffensiveBehaviorStrategy());
		super.physicalAttackAction = new AbsorbDamageComponentDecorator(super.physicalAttackAction, LandOfDragonsInfernalExecutioner.boostIncrease++);
	}
	@Override
	public void increaseStats() {
		super.characterStats.increaseStats(LandOfDragonsAbstractFactory.INCREASE_STATS);
	}
}
