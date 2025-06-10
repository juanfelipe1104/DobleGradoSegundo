package com.utad.ds.proyectoFinal.abstractFactory.boss;

import com.utad.ds.proyectoFinal.abstractFactory.MostolesAbstractFactory;
import com.utad.ds.proyectoFinal.common.CharacterStats;
import com.utad.ds.proyectoFinal.decorator.SkillBoostComponentDecorator;

public class MostolesBoss extends AbstractBoss{
	private static Integer boostIncrease = 2;
	public static Double INCREASE_STATS = 5.0;
	public MostolesBoss(){
		this(new CharacterStats("El capo mostoleño",30,30,30,30,150,500,100));
	}
	public MostolesBoss(CharacterStats characterStats){
		super(characterStats);
		super.magicAttackAction = new SkillBoostComponentDecorator(super.magicAttackAction,MostolesBoss.boostIncrease++);
		super.physicalAttackAction = new SkillBoostComponentDecorator(super.physicalAttackAction, MostolesBoss.boostIncrease++);
		super.healAction = new SkillBoostComponentDecorator(super.healAction, MostolesBoss.boostIncrease++);
		super.guardAction = new SkillBoostComponentDecorator(super.guardAction, MostolesBoss.boostIncrease++);
	}
	@Override
	public void increaseStats() {
		super.characterStats.increaseStats(MostolesBoss.INCREASE_STATS*MostolesAbstractFactory.INCREASE_STATS);
	}
}
