package com.utad.ds.abstractFactory.game;

public class World2Daemon implements Daemon {
	private String name;
	private Integer power;
	private Integer lives;
	private String color;
	public World2Daemon(String name, String color) {
		this.name = name;
		this.power = Daemon.DEFAULT_POWER * World.LEVEL2.getComplexFactor();
		this.lives = Daemon.DEFAULT_LIVE * World.LEVEL2.getComplexFactor();
		this.color = color;
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
	public String getColor() {
		return this.color;
	}
	@Override
	public String toString() {
		return "World2Daemon [name=" + this.name + ", power=" + this.power + ", lives=" + this.lives + ", color=" + this.color + "]";
	}
}
