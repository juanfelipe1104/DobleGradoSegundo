package com.utad.ds.proyectoFinal.abstractFactory.boss;

import com.utad.ds.proyectoFinal.abstractFactory.LandOfDragonsAbstractFactory;
import com.utad.ds.proyectoFinal.common.CharacterStats;
import com.utad.ds.proyectoFinal.decorator.SkillBoostComponentDecorator;

public class LandOfDragonsBoss extends AbstractBoss{
	private static Integer boostIncrease = 2;
	public static final Double INCREASE_STATS = 4.0;
	public LandOfDragonsBoss(){
		this(new CharacterStats("Dragon anciano",30,30,30,30,150,300,100));
	}
	public LandOfDragonsBoss(CharacterStats characterStats){
		super(characterStats);
		super.magicAttackAction = new SkillBoostComponentDecorator(super.magicAttackAction,LandOfDragonsBoss.boostIncrease++);
	}
	@Override
	public void increaseStats() {
		super.characterStats.increaseStats(LandOfDragonsBoss.INCREASE_STATS*LandOfDragonsAbstractFactory.INCREASE_STATS);
	}
}
