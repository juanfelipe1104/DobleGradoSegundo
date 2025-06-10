package com.utad.ds.proyectoFinal.strategy;

import com.utad.ds.proyectoFinal.common.Character;
import com.utad.ds.proyectoFinal.common.ActionException;

public interface EnemyBehaviorStrategy 
{
	public void performAction(Character performer, Character target) throws ActionException;
}
