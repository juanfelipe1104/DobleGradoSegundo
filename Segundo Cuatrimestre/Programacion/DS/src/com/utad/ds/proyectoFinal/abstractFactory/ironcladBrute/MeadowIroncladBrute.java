package com.utad.ds.proyectoFinal.abstractFactory.ironcladBrute;

import com.utad.ds.proyectoFinal.abstractFactory.MeadowAbstractFactory;
import com.utad.ds.proyectoFinal.common.CharacterStats;

public class MeadowIroncladBrute extends AbstractIronCladBrute{
	public MeadowIroncladBrute(){
		this(new CharacterStats("Golem de Piedra",20,0,50,50,5,200,0));
	}
	public MeadowIroncladBrute(CharacterStats characterStats){
		super(characterStats);
	}
	@Override
	public void increaseStats() {
		super.characterStats.increaseStats(MeadowAbstractFactory.INCREASE_STATS);
	}
}
