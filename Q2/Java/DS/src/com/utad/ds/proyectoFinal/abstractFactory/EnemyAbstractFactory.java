package com.utad.ds.proyectoFinal.abstractFactory;

import com.utad.ds.proyectoFinal.abstractFactory.arcaneAbomination.ArcaneAbomination;
import com.utad.ds.proyectoFinal.abstractFactory.boss.Boss;
import com.utad.ds.proyectoFinal.abstractFactory.infernalExecutioner.InfernalExecutioner;
import com.utad.ds.proyectoFinal.abstractFactory.ironcladBrute.IroncladBrute;

public interface EnemyAbstractFactory {
	public abstract ArcaneAbomination createArcaneAbomination();
	public abstract InfernalExecutioner createInfernalExecutioner();
	public abstract IroncladBrute createIroncladBrute();
	public abstract Boss createBoss();
}
