package com.utad.ds.proyectoFinal.abstractFactory.ironcladBrute;

import com.utad.ds.proyectoFinal.abstractFactory.LandOfDragonsAbstractFactory;
import com.utad.ds.proyectoFinal.common.CharacterStats;
import com.utad.ds.proyectoFinal.decorator.SkillBoostComponentDecorator;
import com.utad.ds.proyectoFinal.strategy.OffensiveBehaviorStrategy;

public class LandOfDragonsIroncladBrute extends AbstractIronCladBrute{
	private static Integer boostIncrease = 1;
	public LandOfDragonsIroncladBrute(){
		this(new CharacterStats("Golem igneo",60,0,150,150,15,600,0));
	}
	public LandOfDragonsIroncladBrute(CharacterStats characterStats){
		super(characterStats, new OffensiveBehaviorStrategy());
		super.physicalAttackAction = new SkillBoostComponentDecorator(super.physicalAttackAction, LandOfDragonsIroncladBrute.boostIncrease++);
	}
	@Override
	public void increaseStats() {
		super.characterStats.increaseStats(LandOfDragonsAbstractFactory.INCREASE_STATS);
	}
}
