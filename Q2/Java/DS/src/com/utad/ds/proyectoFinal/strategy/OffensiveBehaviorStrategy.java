package com.utad.ds.proyectoFinal.strategy;

import com.utad.ds.proyectoFinal.common.ActionException;
import com.utad.ds.proyectoFinal.common.Character;

public class OffensiveBehaviorStrategy extends AbstractEnemyBehaviorStrategy{
	//60% atacar, 20% ataque magico, 10% curacion, 10% proteccion
	public void performAction(Character performer, Character target) throws ActionException{
		super.chooseAction(60, 20, 10, performer, target);
	}
	@Override
	public String toString() {
		return "OffensiveBehaviorStrategy";
	}
}
