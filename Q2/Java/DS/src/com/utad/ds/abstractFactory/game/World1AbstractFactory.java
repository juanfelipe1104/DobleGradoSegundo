package com.utad.ds.abstractFactory.game;

public class World1AbstractFactory implements EnemyAbstractFactory {
	@Override
	public Daemon createDaemon(String name, String color) {
		return new World1Daemon(name, color);
	}
	@Override
	public Witch createWitch(String name, String magicPower) {
		return new World1Witch(name, magicPower);
	}
	
}
