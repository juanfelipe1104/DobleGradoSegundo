package com.utad.ds.proyectoFinal.abstractFactory.boss;

import com.utad.ds.proyectoFinal.abstractFactory.MagicForestAbstractFactory;
import com.utad.ds.proyectoFinal.common.CharacterStats;
import com.utad.ds.proyectoFinal.decorator.SkillBoostComponentDecorator;

public class MagicForestBoss extends AbstractBoss{
	private static Integer boostIncrease = 2;
	public static final Double INCREASE_STATS = 3.0;
	public MagicForestBoss(){
		this(new CharacterStats("Dios del bosque",30,30,30,30,150,200,100));
	}
	public MagicForestBoss(CharacterStats characterStats){
		super(characterStats);
		super.magicAttackAction = new SkillBoostComponentDecorator(super.magicAttackAction,MagicForestBoss.boostIncrease++);
	}
	@Override
	public void increaseStats() {
		super.characterStats.increaseStats(MagicForestBoss.INCREASE_STATS*MagicForestAbstractFactory.INCREASE_STATS);
	}
}
