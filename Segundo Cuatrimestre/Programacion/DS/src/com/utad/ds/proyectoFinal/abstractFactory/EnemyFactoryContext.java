package com.utad.ds.proyectoFinal.abstractFactory;

import java.util.Random;

import com.utad.ds.proyectoFinal.abstractFactory.arcaneAbomination.ArcaneAbomination;
import com.utad.ds.proyectoFinal.abstractFactory.boss.Boss;
import com.utad.ds.proyectoFinal.abstractFactory.infernalExecutioner.InfernalExecutioner;
import com.utad.ds.proyectoFinal.abstractFactory.ironcladBrute.IroncladBrute;
import com.utad.ds.proyectoFinal.common.Enemy;

public class EnemyFactoryContext {
	public static final Double DEFAULT_STATS_MULTIPLIER = 2d;
	private static EnemyFactoryContext enemyFactoryContext = new EnemyFactoryContext(new MeadowAbstractFactory());
	public static EnemyFactoryContext getInstance() {
		return EnemyFactoryContext.enemyFactoryContext;
	}
	private EnemyAbstractFactory enemyAbstractFactory;
	private EnemyFactoryContext(EnemyAbstractFactory enemyAbstractFactory) {
		this.enemyAbstractFactory = enemyAbstractFactory;
	}
	public ArcaneAbomination createArcaneAbomination() {
		return this.enemyAbstractFactory.createArcaneAbomination();
	}
	public InfernalExecutioner createInfernalExecutioner() {
		return this.enemyAbstractFactory.createInfernalExecutioner();
	}
	public IroncladBrute createIroncladBrute() {
		return this.enemyAbstractFactory.createIroncladBrute();
	}
	public Boss createBoss(){
		return this.enemyAbstractFactory.createBoss();
	}
	public void setEnemyAbstractFactory(EnemyAbstractFactory enemyAbstractFactory) {
		this.enemyAbstractFactory = enemyAbstractFactory;
	}
	public Enemy createRandomEnemy() {
		Random random = new Random();
		Integer randomNumber = random.nextInt(0,99);
		Enemy randomEnemy = null;
		if(randomNumber < 30) {
			 randomEnemy = (Enemy) this.createArcaneAbomination();
		}
		else if(randomNumber < 60) {
			randomEnemy = (Enemy) this.createInfernalExecutioner();
		}
		else {
			randomEnemy = (Enemy) this.createIroncladBrute();
		}
		return randomEnemy;
	}
	public void increaseStats(Integer run) {
		Double multiplier = this.increaseStatMultipler(run);
		MeadowAbstractFactory.INCREASE_STATS *= multiplier;
		MagicForestAbstractFactory.INCREASE_STATS *= multiplier;
		LandOfDragonsAbstractFactory.INCREASE_STATS *= multiplier;
		MostolesAbstractFactory.INCREASE_STATS *= multiplier;
	}
	private Double increaseStatMultipler(Integer run) {
		return EnemyFactoryContext.DEFAULT_STATS_MULTIPLIER*run;
	}
}
