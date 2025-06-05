package com.utad.ds.abstractFactory.game;

public interface Daemon extends Enemy {
	public static final Integer DEFAULT_POWER = 10;
	public static final Integer DEFAULT_LIVE = 1;
	public abstract String getColor();
}
