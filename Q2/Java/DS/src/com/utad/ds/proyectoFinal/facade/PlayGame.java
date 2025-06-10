package com.utad.ds.proyectoFinal.facade;

public class PlayGame {
	public static void main(String[] args) {
		GameController gameController = GameControllerFacade.getInstance();
		gameController.play();
	}
}
