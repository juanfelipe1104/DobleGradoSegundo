package com.utad.ds.proyectoFinal.abstractFactory;

import com.utad.ds.proyectoFinal.abstractFactory.arcaneAbomination.ArcaneAbomination;
import com.utad.ds.proyectoFinal.abstractFactory.arcaneAbomination.LandOfDragonsArcaneAbomination;
import com.utad.ds.proyectoFinal.abstractFactory.boss.Boss;
import com.utad.ds.proyectoFinal.abstractFactory.boss.LandOfDragonsBoss;
import com.utad.ds.proyectoFinal.abstractFactory.infernalExecutioner.InfernalExecutioner;
import com.utad.ds.proyectoFinal.abstractFactory.infernalExecutioner.LandOfDragonsInfernalExecutioner;
import com.utad.ds.proyectoFinal.abstractFactory.ironcladBrute.IroncladBrute;
import com.utad.ds.proyectoFinal.abstractFactory.ironcladBrute.LandOfDragonsIroncladBrute;

public class LandOfDragonsAbstractFactory implements EnemyAbstractFactory{
	public static Double INCREASE_STATS = 1.3;
	@Override
	public ArcaneAbomination createArcaneAbomination() {
		return new LandOfDragonsArcaneAbomination();
	}
	@Override
	public InfernalExecutioner createInfernalExecutioner() {	
		return new LandOfDragonsInfernalExecutioner();
	}
	@Override
	public IroncladBrute createIroncladBrute() {
		return new LandOfDragonsIroncladBrute();
	}
	@Override
	public Boss createBoss() {
		return new LandOfDragonsBoss();
	}
}
