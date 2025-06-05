package com.utad.ds.proyectoFinal.abstractFactory.boss;

import com.utad.ds.proyectoFinal.abstractFactory.MeadowAbstractFactory;
import com.utad.ds.proyectoFinal.common.CharacterStats;

public class MeadowBoss extends AbstractBoss{
	public static final Double INCREASE_STATS = 2.0;
	public MeadowBoss(){
		this(new CharacterStats("Brr Brr Patapim",30,30,30,30,150,100,100));
	}
	public MeadowBoss(CharacterStats characterStats){
		super(characterStats);
	}
	@Override
	public void increaseStats() {
		super.characterStats.increaseStats(MeadowBoss.INCREASE_STATS*MeadowAbstractFactory.INCREASE_STATS);
	}
}
