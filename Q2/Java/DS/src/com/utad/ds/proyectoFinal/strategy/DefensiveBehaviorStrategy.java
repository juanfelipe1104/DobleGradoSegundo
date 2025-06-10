package com.utad.ds.proyectoFinal.strategy;

import com.utad.ds.proyectoFinal.common.ActionException;
import com.utad.ds.proyectoFinal.common.Character;

public class DefensiveBehaviorStrategy extends AbstractEnemyBehaviorStrategy{
	//20% atacar, 10% ataque magico, 20% curacion, 50% proteccion
	public void performAction(Character performer, Character target) throws ActionException{
		super.chooseAction(20, 10, 20, performer, target);
	}
	
	@Override
	public String toString() {
		return "DefensiveBehaviorStrategy";
	}
}
