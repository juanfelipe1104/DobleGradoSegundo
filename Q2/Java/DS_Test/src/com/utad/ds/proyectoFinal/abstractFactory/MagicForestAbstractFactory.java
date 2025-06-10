package com.utad.ds.proyectoFinal.abstractFactory;

import com.utad.ds.proyectoFinal.abstractFactory.arcaneAbomination.ArcaneAbomination;
import com.utad.ds.proyectoFinal.abstractFactory.arcaneAbomination.MagicForestArcaneAbomination;
import com.utad.ds.proyectoFinal.abstractFactory.boss.Boss;
import com.utad.ds.proyectoFinal.abstractFactory.boss.MagicForestBoss;
import com.utad.ds.proyectoFinal.abstractFactory.infernalExecutioner.InfernalExecutioner;
import com.utad.ds.proyectoFinal.abstractFactory.infernalExecutioner.MagicForestInfernalExecutioner;
import com.utad.ds.proyectoFinal.abstractFactory.ironcladBrute.IroncladBrute;
import com.utad.ds.proyectoFinal.abstractFactory.ironcladBrute.MagicForestIroncladBrute;

public class MagicForestAbstractFactory implements EnemyAbstractFactory{
	public static Double INCREASE_STATS = 1.2;
	@Override
	public ArcaneAbomination createArcaneAbomination() {
		return new MagicForestArcaneAbomination();
	}
	@Override
	public InfernalExecutioner createInfernalExecutioner() {	
		return new MagicForestInfernalExecutioner();
	}
	@Override
	public IroncladBrute createIroncladBrute() {
		return new MagicForestIroncladBrute();
	}
	@Override
	public Boss createBoss() {
		return new MagicForestBoss();
	}
}
