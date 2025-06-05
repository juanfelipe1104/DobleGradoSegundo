package com.utad.ds.proyectoFinal.decorator;

public interface ActionComponentDecorator extends ActionComponent{
	public abstract ActionComponent getActionComponent();
	public abstract void levelUp();
	public abstract String getName();
}
