package com.utad.ds.proyectoFinal.strategy;

import com.utad.ds.proyectoFinal.common.ActionException;
import com.utad.ds.proyectoFinal.common.Character;

public class BalancedBehaviorStrategy extends AbstractEnemyBehaviorStrategy{
	//25% atacar, 25% ataque magico, 25% curacion, 25% proteccion
	public void performAction(Character performer, Character target) throws ActionException{
		super.chooseAction(25, 25, 25, performer, target);
	}
	
	@Override
	public String toString() {
		return "BalancedBehaviorStrategy";
	}
}
