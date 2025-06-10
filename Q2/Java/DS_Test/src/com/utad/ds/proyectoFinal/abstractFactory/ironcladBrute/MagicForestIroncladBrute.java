package com.utad.ds.proyectoFinal.abstractFactory.ironcladBrute;

import com.utad.ds.proyectoFinal.abstractFactory.MagicForestAbstractFactory;
import com.utad.ds.proyectoFinal.common.CharacterStats;
import com.utad.ds.proyectoFinal.decorator.SkillBoostComponentDecorator;
import com.utad.ds.proyectoFinal.strategy.DefensiveBehaviorStrategy;

public class MagicForestIroncladBrute extends AbstractIronCladBrute{
	private static Integer boostIncrease = 1;
	public MagicForestIroncladBrute(){
		this(new CharacterStats("Golem arcano",40,0,100,100,10,400,0));
	}
	public MagicForestIroncladBrute(CharacterStats characterStats){
		super(characterStats, new DefensiveBehaviorStrategy());
		super.guardAction = new SkillBoostComponentDecorator(super.guardAction, MagicForestIroncladBrute.boostIncrease++);
	}
	@Override
	public void increaseStats() {
		super.characterStats.increaseStats(MagicForestAbstractFactory.INCREASE_STATS);
	}
}
