package com.utad.ds.abstractFactory.game;

public class World2AbstractFactory implements EnemyAbstractFactory {

	@Override
	public Daemon createDaemon(String name, String color) {
		return new World2Daemon(name, color);
	}

	@Override
	public Witch createWitch(String name, String magicPower) {
		return new World2Witch(name, magicPower);
	}

}
