package com.utad.ds.abstractFactory.game;

public class Test {
	public static void main(String[] args) {
		GameController gameController = GameController.getInstance();
		System.out.println("Empieza el juego en el Mundo 1");
		System.out.println("Creamos un demonio en el mundo 1 " + gameController.createDaemon("Daemon", "rojo"));
		System.out.println("Creamos una bruja en el mundo 1 " + gameController.createWitch("Witch", "Magic wand"));
		System.out.println("Cambiamos de mundo");
		gameController.setFactory(new World2AbstractFactory());
		System.out.println("Creamos un demonio en el mundo 2 " + gameController.createDaemon("Big Daemon", "verdes"));
		System.out.println("Creamos una bruja en el mundo 2 " + gameController.createWitch("Big Witch", "Magic wand and magic broom"));
		System.out.println("Juego finalizado!!");
	}
}
