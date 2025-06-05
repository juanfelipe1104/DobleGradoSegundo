package com.utad.ds.proyectoFinal.decorator;

import com.utad.ds.proyectoFinal.common.ActionException;
import com.utad.ds.proyectoFinal.common.Character;

public abstract class AbstractActionComponentDecorator implements ActionComponentDecorator{
	//Componente al que decora
	protected ActionComponent actionComponent;
	protected Integer level;
	protected String name;
	public AbstractActionComponentDecorator(ActionComponent actionComponent, Integer level, String name){
		this.actionComponent = actionComponent;
		this.level = level;
		this.name = name;
	}
	public void levelUp(){
		this.level++;
	}	
	//Metodo para buscar un decorador concreto por ejemplo
	public ActionComponentDecorator searchComponentDecorator(ActionComponentDecorator decorator){
		if(this.getClass().equals(decorator.getClass())){
			return this;
		}
		//Si hemos llegado a la base, no lo hemos encontrado
		else if(!(this instanceof ActionComponentDecorator))
		{
			return null;
		}
		else 
		{
			return this.getActionComponent().searchComponentDecorator(decorator);
		}
	}
	@Override
	public BaseActionComponent getBaseAction(){
		if(this.getActionComponent() instanceof BaseActionComponent){
			return (BaseActionComponent)this.getActionComponent();
		}
		else{
			return this.getActionComponent().getBaseAction();
		}
	}
	
	public void performActionFirst(Character performer, Character target) throws ActionException
	{
		System.out.println(performer.getCharacterStats().getName() + " realiza " + this.getDescription());
		this.performAction(performer, target);
	}
	
	public ActionComponent getActionComponent() { return this.actionComponent; }
	public void setLevel(Integer level) { this.level = level; }
	public Integer getLevel() { return this.level; }
	@Override
	public String getName() { return this.name; }
}
