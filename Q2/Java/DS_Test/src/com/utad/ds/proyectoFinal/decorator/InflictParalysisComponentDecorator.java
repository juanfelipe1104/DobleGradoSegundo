package com.utad.ds.proyectoFinal.decorator;
import java.util.Random;

import com.utad.ds.proyectoFinal.common.ActionException;
import com.utad.ds.proyectoFinal.common.Character;

public class InflictParalysisComponentDecorator extends AbstractActionComponentDecorator{
	public static final Integer BASE_INFLICT_CHANCE = 40;
	public static final Integer MAX_INFLICT_CHANCE = 100;
	public static final String DEFAULT_NAME = "Mejora de infligir parálisis";
	public InflictParalysisComponentDecorator(ActionComponent actionComponent, Integer level){
		this(actionComponent, level, InflictParalysisComponentDecorator.DEFAULT_NAME);
	}
	public InflictParalysisComponentDecorator(ActionComponent actionComponent, Integer level, String name) {
		super(actionComponent, level, name);
	}
	public String getDescription() {
		return super.getActionComponent().getDescription() + " con capacidad de paralizar de nivel " + this.level;
	}
	//Decidimos si se inflige el estado o no aleatoriamente
	private void decideInflict(Character target){
		Integer numRandom = 0;
		Integer chance = InflictParalysisComponentDecorator.BASE_INFLICT_CHANCE + (super.level-1)*10;
		if(chance > InflictParalysisComponentDecorator.MAX_INFLICT_CHANCE){
			chance = InflictParalysisComponentDecorator.MAX_INFLICT_CHANCE;
		}
		Random random = new Random();
		numRandom = random.nextInt(0, 99)+1;
		if(numRandom <= chance){
			target.removeSideEffect();
			target.applyParalysis();
		}
	}
	
	public void performAction(Character performer, Character target) throws ActionException{
		this.decideInflict(target);
		super.getActionComponent().performAction(performer, target);
	}
	public void performAction(Character performer, Character target, Integer boost) throws ActionException{
		this.decideInflict(target);
		super.getActionComponent().performAction(performer, target, boost);
	}
}
