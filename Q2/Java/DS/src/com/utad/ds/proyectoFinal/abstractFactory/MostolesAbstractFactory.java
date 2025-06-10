package com.utad.ds.proyectoFinal.abstractFactory;

import com.utad.ds.proyectoFinal.abstractFactory.arcaneAbomination.ArcaneAbomination;
import com.utad.ds.proyectoFinal.abstractFactory.arcaneAbomination.MostolesArcaneAbomination;
import com.utad.ds.proyectoFinal.abstractFactory.boss.Boss;
import com.utad.ds.proyectoFinal.abstractFactory.boss.MostolesBoss;
import com.utad.ds.proyectoFinal.abstractFactory.infernalExecutioner.InfernalExecutioner;
import com.utad.ds.proyectoFinal.abstractFactory.infernalExecutioner.MostolesInfernalExecutioner;
import com.utad.ds.proyectoFinal.abstractFactory.ironcladBrute.IroncladBrute;
import com.utad.ds.proyectoFinal.abstractFactory.ironcladBrute.MostolesIroncladBrute;

public class MostolesAbstractFactory implements EnemyAbstractFactory{
	public static Double INCREASE_STATS = 1.4;
	@Override
	public ArcaneAbomination createArcaneAbomination() {
		return new MostolesArcaneAbomination();
	}
	@Override
	public InfernalExecutioner createInfernalExecutioner() {	
		return new MostolesInfernalExecutioner();
	}
	@Override
	public IroncladBrute createIroncladBrute() {
		return new MostolesIroncladBrute();
	}
	@Override
	public Boss createBoss() {
		return new MostolesBoss();
	}
}
