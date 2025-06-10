package com.utad.ds.proyectoFinal.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.utad.ds.proyectoFinal.abstractFactory.EnemyFactoryContext;
import com.utad.ds.proyectoFinal.abstractFactory.LandOfDragonsAbstractFactory;
import com.utad.ds.proyectoFinal.abstractFactory.MagicForestAbstractFactory;
import com.utad.ds.proyectoFinal.abstractFactory.MeadowAbstractFactory;
import com.utad.ds.proyectoFinal.abstractFactory.MostolesAbstractFactory;
import com.utad.ds.proyectoFinal.common.Character;
import com.utad.ds.proyectoFinal.common.Enemy;
import com.utad.ds.proyectoFinal.common.ItemDisplay;
import com.utad.ds.proyectoFinal.common.Player;

public class GameControllerFacade implements GameController{
	public static final Integer MAX_ENEMIES_ROUND = 4;
	private static GameControllerFacade gameControllerFacade = new GameControllerFacade();
	public static GameControllerFacade getInstance() {
		return GameControllerFacade.gameControllerFacade;
	}
	public static List<String> GAME_OPTIONS;   //Se usará luego para pedir la acción
	public static List<String> ATK_TYPES;
	public static List<String> VICTORY_OPTIONS;
	static {
		GameControllerFacade.ATK_TYPES = new ArrayList<String>();
		GameControllerFacade.ATK_TYPES.add("Ataque fisico");
		GameControllerFacade.ATK_TYPES.add("Ataque magico");
		GameControllerFacade.GAME_OPTIONS = new ArrayList<String>();
		GameControllerFacade.GAME_OPTIONS.add("Atacar");
		GameControllerFacade.GAME_OPTIONS.add("Defenderse");
		GameControllerFacade.GAME_OPTIONS.add("Curarse");
		GameControllerFacade.GAME_OPTIONS.add("Usar item");
		GameControllerFacade.VICTORY_OPTIONS = new ArrayList<String>();
		GameControllerFacade.VICTORY_OPTIONS.add("Jugar otra partida, con enemigos mas dificiles");
	}
	//Método para dar a elegir varias opciones de una lista
	public static Integer menuSelection(List<?> lista){
		Scanner scanner = new Scanner(System.in);
		Integer resultado = 0;
		System.out.println("0 - Salir");
		for(int i = 1; i <= lista.size(); i++){
			System.out.println(i + " - " + lista.get(i-1));
		}
		do{
			System.out.println("Elige una opción:");
			resultado = scanner.nextInt();
			if(resultado < 0 || resultado > (lista.size()+1)){
				System.out.println("Error: La opción está fuera del rango");
			}
		}
		while(resultado < 0 || resultado > (lista.size()+1));   //Sigue hasta que elija una opcion valida
		return resultado;
	}
	private Character player;
	private Character enemy;
	private Boolean victory;
	private Integer roundNumber;
	private Integer worldNumber;
	private Integer runNumber;
	private Boolean endRun;
	private ItemDisplay itemDisplay;
	private EnemyFactoryContext enemyFactoryContext;
	private GameControllerFacade() {
		this.enemyFactoryContext = EnemyFactoryContext.getInstance();
		this.createPlayer();
		this.enemy = this.enemyFactoryContext.createRandomEnemy();
		this.victory = false;
		this.endRun = false;
		this.roundNumber = 0;
		this.worldNumber = 1;
		this.runNumber = 1;
	}
	private void createPlayer() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el nombre de jugador");
		String nombre = scanner.next();
		this.player = new Player(nombre);
	}
	@Override
	public void play() {
		while(!this.endRun && !this.player.isDead()) {
			System.out.println(this.player);
			System.out.println(this.enemy);
			this.choosePlayerAction(GameControllerFacade.menuSelection(GameControllerFacade.GAME_OPTIONS));
			this.playTurn();
			this.nextTurn();
			this.checkVictory();
		}
	}
	private void choosePlayerAction(Integer option) {
		switch(option) {
		case 0:
			this.endRun = true;
		break;
		case 1:
			this.chooseAttackType(GameControllerFacade.menuSelection(GameControllerFacade.ATK_TYPES));
		break;
		case 2:
			this.player.setCurrentAction(this.player.getGuardAction());
		break;
		case 3:
			if(this.player.hasEnoughMP()){
				this.player.setCurrentAction(this.player.getHealAction());
			}
			else{
				System.out.println(this.player.getCharacterStats().getName() + " no tiene suficientes puntos de magia para curarse.");
				this.choosePlayerAction(GameControllerFacade.menuSelection(GameControllerFacade.GAME_OPTIONS));
			}
		break;
		case 4:
			Integer index = GameControllerFacade.menuSelection(((Player)this.player).getInventory());
			if(!(index.equals(0))) {
				((Player)this.player).getInventory().get(index-1).useItem(this.player);
			}
			this.choosePlayerAction(GameControllerFacade.menuSelection(GameControllerFacade.GAME_OPTIONS));
		}
	}
	private void chooseAttackType(Integer option) {
		switch(option) {
		case 0:
			this.choosePlayerAction(GameControllerFacade.menuSelection(GameControllerFacade.GAME_OPTIONS));
		break;
		case 1:
			this.player.setCurrentAction(this.player.getPhysicalAttackAction());
		break;
		case 2:
			if(this.player.hasEnoughMP()) {
				this.player.setCurrentAction(this.player.getMagicAttackAction());
			}
			else {
				System.out.println(this.player.getCharacterStats().getName() + " no tiene suficientes puntos de magia para lanzar un hechizo.");
				this.choosePlayerAction(GameControllerFacade.menuSelection(GameControllerFacade.GAME_OPTIONS));
			}
		break;
		}
	}
	private void playTurn() {
		if(!this.endRun) {
			if(this.player.isFaster(this.enemy)){
				this.player.playTurn(this.enemy);
				this.enemy.playTurn(this.player);
			}
			else{
				this.enemy.playTurn(this.player);
				this.player.playTurn(this.enemy);
			}
			if(((Enemy)this.enemy).isBoss()) {
				((Enemy)this.enemy).useSkill(this.player);
			}
		}
	}
	private void nextTurn() {
		if(this.enemy.isDead()) {
			((Player)this.player).increaseStats();
			this.itemDisplay = new ItemDisplay((Player)this.player);
			this.itemDisplay.selectUpgrade();
			this.createNextEnemy();
		}
	}
	private void createNextEnemy(){
		this.roundNumber++;
		this.checkPreviousBoss();
		if(!this.victory) {
			if(this.roundNumber < GameControllerFacade.MAX_ENEMIES_ROUND){
				this.enemy = this.enemyFactoryContext.createRandomEnemy();
				System.out.println("Se ha generado un nuevo enemigo");
			}
			else{
				this.enemy = (Enemy) this.enemyFactoryContext.createBoss();
				System.out.println("Ha aparecido el jefe " + this.enemy.getCharacterStats().getName());
				this.roundNumber = 0;		
			}
		}
	}
	private void checkPreviousBoss() {
		if(((Enemy)this.enemy).isBoss()) {
			if(((Enemy)this.enemy).isFinalBoss()) {
				this.victory = true;
			}
			else {
				this.worldNumber++;
				this.changeWorld();
			}
		}
	}
	
	private void changeWorld() {
		switch(this.worldNumber) {
		case 1:
			this.enemyFactoryContext.setEnemyAbstractFactory(new MeadowAbstractFactory());
			System.out.println("Has entrado en la pradera");
		break;
		case 2:
			this.enemyFactoryContext.setEnemyAbstractFactory(new MagicForestAbstractFactory());
			System.out.println("Has entrado al bosque magico");
		break;
		case 3:
			this.enemyFactoryContext.setEnemyAbstractFactory(new LandOfDragonsAbstractFactory());
			System.out.println("Has entrado a la tierra de los dragones");
		break;
		case 4:
			this.enemyFactoryContext.setEnemyAbstractFactory(new MostolesAbstractFactory());
			System.out.println("Has entrado en Mostoles. Revisa tus bolsillos.");
			this.worldNumber = 1;
		break;
		}
	}
	private void checkVictory() {
		if(this.player.isDead()){
			System.out.println("Perdiste, buena partida");
		}
		else if(this.victory){
			System.out.println("Ganaste. Tienes dos opciones:");
			this.chooseVictoryOption(GameControllerFacade.menuSelection(VICTORY_OPTIONS)); 
		}
	}
	private void chooseVictoryOption(Integer option){
		switch(option){
			case 0:
				System.out.println("Gracias por jugar");
				this.endRun = true;
			break;
			case 1:
				System.out.println("Empieza una nueva partida");
				this.startNewRun();
			break;
		}	
	}
	private void startNewRun() {
		this.victory = false;
		this.roundNumber = 0;
		this.worldNumber = 1;
		this.runNumber++;
		this.changeWorld();
		this.enemyFactoryContext.increaseStats(this.runNumber);
		this.enemy = this.enemyFactoryContext.createRandomEnemy();
	}
}
