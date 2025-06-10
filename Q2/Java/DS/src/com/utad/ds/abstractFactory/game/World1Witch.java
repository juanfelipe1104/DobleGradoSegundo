package com.utad.ds.abstractFactory.game;

public class World1Witch implements Witch {
	private String name;
	private Integer power;
	private Integer lives;
	private String magicPower;
	
	public World1Witch(String name, String magicPower) {
		this.name = name;
		this.magicPower = magicPower;
		this.power = Witch.DEFAULT_POWER * World.LEVEL1.getComplexFactor();
		this.lives = Witch.DEFAULT_LIVE * World.LEVEL1.getComplexFactor();
	}
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public Integer getPower() {
		return this.power;
	}

	@Override
	public Integer getLives() {
		return this.lives;
	}

	@Override
	public String getMagicPower() {
		return this.magicPower;
	}

	@Override
	public String toString() {
		return "World1Witch [name=" + this.name + ", power=" + this.power + ", lives=" + this.lives + ", magicPower=" + this.magicPower
				+ "]";
	}
}
