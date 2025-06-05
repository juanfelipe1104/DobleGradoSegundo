package com.utad.ds.proyectoFinal.abstractFactory.arcaneAbomination;

import com.utad.ds.proyectoFinal.abstractFactory.MeadowAbstractFactory;
import com.utad.ds.proyectoFinal.common.CharacterStats;

public class MeadowArcaneAbomination extends AbstractArcaneAbomination{
	public MeadowArcaneAbomination() {
		this(new CharacterStats("Bruja de la pradera",0,20,15,20,10,40,100));
	}
	public MeadowArcaneAbomination(CharacterStats characterStats) {
		super(characterStats);
	}	
	@Override
	public void increaseStats() {
		super.characterStats.increaseStats(MeadowAbstractFactory.INCREASE_STATS);
	}
}
