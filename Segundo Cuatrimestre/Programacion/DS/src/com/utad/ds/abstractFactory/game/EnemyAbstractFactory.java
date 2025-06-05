package com.utad.ds.abstractFactory.game;

public interface EnemyAbstractFactory {
	public abstract Daemon createDaemon(String name, String color);
	public abstract Witch createWitch(String name, String magicPower);
}
