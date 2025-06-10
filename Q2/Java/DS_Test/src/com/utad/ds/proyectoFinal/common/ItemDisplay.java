package com.utad.ds.proyectoFinal.common;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import com.utad.ds.proyectoFinal.decorator.*;
import com.utad.ds.proyectoFinal.facade.GameControllerFacade;

//Despues de cada pelea se daran a elegir tres mejoras
public class ItemDisplay {	
	private List<ActionComponentDecorator> actions;
	private List<Item> items;
	private Player player;
	//Acciones e items que vamos a ofrecer
	private Item item;
	private ActionComponentDecorator action;
	public ItemDisplay(Player player){
		this.player = player;
		this.items = new ArrayList<Item>();
		this.items.add(new AntidoteItem());
		this.items.add(new MpPotionItem());
		this.actions = new ArrayList<ActionComponentDecorator>();
		this.actions.add(new SkillBoostComponentDecorator(player.getPhysicalAttackAction(), 1, "Mejora para el ataque físico"));
		this.actions.add(new SkillBoostComponentDecorator(player.getMagicAttackAction(), 1, "Mejora para el ataque mágico"));
		this.actions.add(new SkillBoostComponentDecorator(player.getHealAction(), 1, "Mejora para la curación"));
		this.actions.add(new SkillBoostComponentDecorator(player.getGuardAction(), 1, "Mejora para la protección"));
		this.actions.add(new AbsorbDamageComponentDecorator(player.getPhysicalAttackAction(), 1, "Mejora de absorción de daño para el ataque físico"));
		this.actions.add(new AbsorbDamageComponentDecorator(player.getMagicAttackAction(), 1, "Mejora de absorción de daño para el ataque mágico"));
		this.actions.add(new ReflectDamageComponentDecorator(player.getGuardAction(), 1, "Mejora de reflejar daño al protegerse"));
		this.actions.add(new InflictParalysisComponentDecorator(player.getMagicAttackAction(), 1, "Mejora de infligir parálisis en los ataques mágicos"));
		this.actions.add(new InflictSlowdownComponentDecorator(player.getMagicAttackAction(), 1, "Mejora de infligir ralentización en los ataques mágicos"));
		this.chooseItems();
	}
	//Elige el item y la mejora que se mostraran para elegir
	public void chooseItems(){
		Collections.shuffle(this.actions);
		Collections.shuffle(this.items);
		this.action = this.actions.getFirst();
		this.item = this.items.getFirst();
	}
	public void selectUpgrade(){
		System.out.println("Tienes la oportunidad de elegir una mejora");
		Integer opcionElegida = -1;
		List<String> opciones = new ArrayList<String>();
		opciones.add(this.item.toString());
		opciones.add(this.action.getName());
		opcionElegida = GameControllerFacade.menuSelection(opciones);
		//Se elige el item
		switch(opcionElegida) {
		case 1:
			this.player.getInventory().add(item);
		break;
		case 2:
			//El jugador no tenia esa mejora
			if(this.action.getActionComponent().searchComponentDecorator(action) == null){
				//Buscamos la accion base para saber de que tipo es y asi ver que accion cambiar
				BaseActionComponent baseAction = this.action.getActionComponent().getBaseAction();
				switch(baseAction.getActionType()){
				case ActionType.ATK:
					this.player.setPhysicalAttackAction(this.action);
				break;
				case ActionType.MAG:
					this.player.setMagicAttackAction(this.action);
				break;
				case ActionType.HEAL:
					this.player.setHealAction(this.action);
				break;
				case ActionType.GUARD:
					this.player.setGuardAction(this.action);
				break;
				}
			}
			//Si ya tenia esta mejora, la subimos de nivel
			else{
				this.action.getActionComponent().searchComponentDecorator(this.action).levelUp();
			}
		break;
		}
	}
}
