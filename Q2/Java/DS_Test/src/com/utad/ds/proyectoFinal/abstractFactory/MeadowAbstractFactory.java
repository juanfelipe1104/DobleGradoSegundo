package com.utad.ds.proyectoFinal.abstractFactory;

import com.utad.ds.proyectoFinal.abstractFactory.arcaneAbomination.ArcaneAbomination;
import com.utad.ds.proyectoFinal.abstractFactory.arcaneAbomination.MeadowArcaneAbomination;
import com.utad.ds.proyectoFinal.abstractFactory.boss.Boss;
import com.utad.ds.proyectoFinal.abstractFactory.boss.MeadowBoss;
import com.utad.ds.proyectoFinal.abstractFactory.infernalExecutioner.InfernalExecutioner;
import com.utad.ds.proyectoFinal.abstractFactory.infernalExecutioner.MeadowInfernalExecutioner;
import com.utad.ds.proyectoFinal.abstractFactory.ironcladBrute.IroncladBrute;
import com.utad.ds.proyectoFinal.abstractFactory.ironcladBrute.MeadowIroncladBrute;

public class MeadowAbstractFactory implements EnemyAbstractFactory{
	public static Double INCREASE_STATS = 1.1;
	@Override
	public ArcaneAbomination createArcaneAbomination() {
		return new MeadowArcaneAbomination();
	}
	@Override
	public InfernalExecutioner createInfernalExecutioner() {	
		return new MeadowInfernalExecutioner();
	}
	@Override
	public IroncladBrute createIroncladBrute() {
		return new MeadowIroncladBrute();
	}
	@Override
	public Boss createBoss() {
		return new MeadowBoss();
	}
}
