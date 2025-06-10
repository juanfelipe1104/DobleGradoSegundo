package com.utad.ds.proyectoFinal.decorator;

import com.utad.ds.proyectoFinal.common.ActionException;
import com.utad.ds.proyectoFinal.common.Character;

//Para acciones de ataque o curacion, aumenta el ataque o vida recuperada dependiendo del nivel
public class SkillBoostComponentDecorator extends AbstractActionComponentDecorator{
	public static final String DEFAULT_NAME = "Mejora de habilidad";
	public SkillBoostComponentDecorator(ActionComponent actionComponent, Integer level){
		this(actionComponent, level, SkillBoostComponentDecorator.DEFAULT_NAME);
	}
	public SkillBoostComponentDecorator(ActionComponent actionComponent, Integer level, String name) {
		super(actionComponent, level, name);
	}
	public String getDescription() {
		return super.getActionComponent().getDescription() + " con mejora de nivel " + this.level;
	}
	public void performAction(Character performer, Character target) throws ActionException{
		//Enviamos el nivel de la mejora, y en funcion de eso la calculadora suma daño o curacion
		super.getActionComponent().performAction(performer, target, super.level);
	}
	public void performAction(Character performer, Character target, Integer boost) throws ActionException{
		throw new ActionException("Error: Incongruencia en las acciones, hay una con doble boost.");
	}
}
