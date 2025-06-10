package com.utad.ds.proyectoFinal.strategy;

import com.utad.ds.proyectoFinal.common.ActionException;
import com.utad.ds.proyectoFinal.common.Character;

public class MagicOffensiveBehaviorStrategy extends AbstractEnemyBehaviorStrategy{
	//20% atacar, 60% ataque magico, 10% curacion, 10% proteccion
	public void performAction(Character performer, Character target) throws ActionException{
		super.chooseAction(20, 60, 10, performer, target);
	}
	
	@Override
	public String toString() {
		return "MagicOffensiveBehaviorStrategy";
	}
}
