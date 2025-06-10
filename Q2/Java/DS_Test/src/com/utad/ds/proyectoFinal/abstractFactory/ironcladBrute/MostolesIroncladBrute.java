package com.utad.ds.proyectoFinal.abstractFactory.ironcladBrute;

import com.utad.ds.proyectoFinal.abstractFactory.MostolesAbstractFactory;
import com.utad.ds.proyectoFinal.common.CharacterStats;
import com.utad.ds.proyectoFinal.decorator.ReflectDamageComponentDecorator;
import com.utad.ds.proyectoFinal.strategy.DefensiveBehaviorStrategy;

public class MostolesIroncladBrute extends AbstractIronCladBrute{
	private static Integer boostIncrease = 1;
	public MostolesIroncladBrute(){
		this(new CharacterStats("Guardia de discoteca",80,0,200,200,20,800,0));
	}
	public MostolesIroncladBrute(CharacterStats characterStats){
		super(characterStats, new DefensiveBehaviorStrategy());
		super.guardAction = new ReflectDamageComponentDecorator(super.guardAction, MostolesIroncladBrute.boostIncrease++);
	}
	@Override
	public void increaseStats() {
		super.characterStats.increaseStats(MostolesAbstractFactory.INCREASE_STATS);
	}
}
