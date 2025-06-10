package com.utad.ds.abstractFactory.game;

public class GameController {
	private static GameController gameController = new GameController(new World1AbstractFactory());
	public static GameController getInstance() {
		return GameController.gameController;
	}
	private EnemyAbstractFactory factory;
	private GameController(EnemyAbstractFactory factory) {
		this.factory = factory;
	}
	public void setFactory(EnemyAbstractFactory factory) {
		this.factory = factory;
	}
	public Daemon createDaemon(String name, String color) {
		return this.factory.createDaemon(name, color); //Delegacion por agregacion
	}
	public Witch createWitch(String name, String magicPower) {
		return this.factory.createWitch(name, magicPower); //Delegacion por agregacion
	}
}
