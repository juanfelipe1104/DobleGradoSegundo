package com.utad.ds.proyectoFinal.decorator;

import com.utad.ds.proyectoFinal.common.ActionException;
import com.utad.ds.proyectoFinal.common.Character;

public interface ActionComponent {
	public abstract String getDescription();
	//Metodo sobrecargado porque no siempre va a haber boost
	public abstract void performAction(Character performer, Character target) throws ActionException;
	public abstract void performAction(Character performer, Character target, Integer boost) throws ActionException;
	public abstract ActionComponentDecorator searchComponentDecorator(ActionComponentDecorator decorator);
	public abstract BaseActionComponent getBaseAction();
	public abstract void performActionFirst(Character performer, Character target) throws ActionException;
}
