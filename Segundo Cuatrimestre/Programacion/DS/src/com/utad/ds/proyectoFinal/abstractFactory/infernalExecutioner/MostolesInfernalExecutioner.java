package com.utad.ds.proyectoFinal.abstractFactory.infernalExecutioner;

import com.utad.ds.proyectoFinal.abstractFactory.MostolesAbstractFactory;
import com.utad.ds.proyectoFinal.common.CharacterStats;
import com.utad.ds.proyectoFinal.decorator.InflictSlowdownComponentDecorator;
import com.utad.ds.proyectoFinal.decorator.SkillBoostComponentDecorator;
import com.utad.ds.proyectoFinal.strategy.OffensiveBehaviorStrategy;

public class MostolesInfernalExecutioner extends AbstractInfernalExecutioner{
	private static Integer boostIncrease = 1;
	public MostolesInfernalExecutioner(){
		this(new CharacterStats("Navajero",120,0,80,40,40,200,0));
	}
	public MostolesInfernalExecutioner(CharacterStats characterStats){
		super(characterStats, new OffensiveBehaviorStrategy());
		super.physicalAttackAction = new SkillBoostComponentDecorator(super.physicalAttackAction, MostolesInfernalExecutioner.boostIncrease++);
		super.physicalAttackAction = new InflictSlowdownComponentDecorator(super.physicalAttackAction, MostolesInfernalExecutioner.boostIncrease++);
	}
	@Override
	public void increaseStats() {
		super.characterStats.increaseStats(MostolesAbstractFactory.INCREASE_STATS);
	}
}

