package com.utad.ds.abstractFactory.game;

public interface Witch extends Enemy {
	public static final Integer DEFAULT_POWER = 15;
	public static final Integer DEFAULT_LIVE = 2;
	public abstract String getMagicPower();
}
