package com.utad.ds.proyectoFinal.decorator;

import com.utad.ds.proyectoFinal.common.CharacterStats;
import com.utad.ds.proyectoFinal.common.ActionException;
import com.utad.ds.proyectoFinal.common.Character;

public class BaseAttackAction implements BaseActionComponent{
	public String getDescription() {
		return this.getActionType().getActionName();
	}
	public void performAction(Character performer, Character target) throws ActionException{
		this.performAction(performer, target, 0);
	}
	public void performAction(Character performer, Character target, Integer boost) throws ActionException{
		CharacterStats performerStats = performer.getCharacterStats();
		CharacterStats targetStats = target.getCharacterStats();
		Integer damage = BattleCalculator.getInstance().calculatePhysicalDamage(performer, target, boost);
		//Ataque reflejado
		if(damage <= 0)	{
			System.out.println(targetStats.getName() + " ha reflejado el ataque, " + performerStats.getName() + " se ha hecho " + -damage + " de daño.");
			performerStats.setHP(performerStats.getHP() + damage);
			//Muere el atacante
			if(performerStats.getHP() <= 0)	{ 
				performer.killCharacter();
			}
		}
		//Ataque exitoso
		else {
			System.out.println(performerStats.getName() + " ha atacado a " + targetStats.getName() + " y le ha hecho " + damage + " de daño.");
			targetStats.setHP(targetStats.getHP() - damage);
			//Muere el objetivo
			if(targetStats.getHP() <= 0){
				target.killCharacter();
			}
		}
	}
	public ActionType getActionType() {
		return ActionType.ATK;
	}
	public ActionComponentDecorator searchComponentDecorator(ActionComponentDecorator decorator){
		//Por debajo de la base no hay nada
		return null;
	}
	@Override
	public BaseActionComponent getBaseAction() {
		return this;
	}
	
	public void performActionFirst(Character performer, Character target) throws ActionException{
		System.out.println(performer.getCharacterStats().getName() + " realiza " + this.getDescription());
		this.performAction(performer, target);
	}
}
