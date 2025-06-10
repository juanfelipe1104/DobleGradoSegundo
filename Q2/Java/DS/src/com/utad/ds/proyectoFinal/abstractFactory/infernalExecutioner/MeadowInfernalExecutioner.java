package com.utad.ds.proyectoFinal.abstractFactory.infernalExecutioner;

import com.utad.ds.proyectoFinal.abstractFactory.MeadowAbstractFactory;
import com.utad.ds.proyectoFinal.common.CharacterStats;

public class MeadowInfernalExecutioner extends AbstractInfernalExecutioner{
	public MeadowInfernalExecutioner(){
		this(new CharacterStats("Bicho palo",30,0,20,10,10,50,0));
	}
	public MeadowInfernalExecutioner(CharacterStats characterStats){
		super(characterStats);
	}
	@Override
	public void increaseStats() {
		super.characterStats.increaseStats(MeadowAbstractFactory.INCREASE_STATS);
	}
}
