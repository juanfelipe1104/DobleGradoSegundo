package com.utad.ds.proyectoFinal.decorator;
import java.util.Random;

import com.utad.ds.proyectoFinal.common.CharacterStats;
import com.utad.ds.proyectoFinal.common.ActionException;
import com.utad.ds.proyectoFinal.common.Character;

//Para la accion de protegerse, añade la posibilidad de reflejar el daño
public class ReflectDamageComponentDecorator extends AbstractActionComponentDecorator{
	public static final Integer BASE_REFLECT_CHANCE = 30;
	public static final Integer MAX_REFLECT_CHANCE = 80;
	public static final String DEFAULT_NAME = "Mejora de reflejar daño";
	public ReflectDamageComponentDecorator(ActionComponent actionComponent, Integer level){
		this(actionComponent, level, ReflectDamageComponentDecorator.DEFAULT_NAME);
	}
	public ReflectDamageComponentDecorator(ActionComponent actionComponent, Integer level, String name) {
		super(actionComponent, level, name);
	}
	public String getDescription() {
		return super.getActionComponent().getDescription() + " con mejora de reflejar daño de nivel " + this.level;
	}
	//Decide si se reflejara el daño o no aleatoriamente. Cuanto mas nivel, mas probabilidades hay
	private void decideReflect(Character performer){
		CharacterStats performerStats = performer.getCharacterStats();
		Integer numRandom = 0;
		Integer chance = ReflectDamageComponentDecorator.BASE_REFLECT_CHANCE + (super.level-1)*10;
		if(chance > ReflectDamageComponentDecorator.MAX_REFLECT_CHANCE){
			chance = ReflectDamageComponentDecorator.MAX_REFLECT_CHANCE;
		}
		Random random = new Random();
		numRandom = random.nextInt(0, 99)+1;
		if(numRandom <= chance){
			System.out.println(performerStats.getName() + " reflejará próximos ataques.");
			performerStats.setReflecting(true);
		}
	}
	public void performAction(Character performer, Character target) throws ActionException{
		this.decideReflect(performer);
		super.getActionComponent().performAction(performer, target);
	}
	public void performAction(Character performer, Character target, Integer boost) throws ActionException{
		this.decideReflect(performer);
		super.getActionComponent().performAction(performer, target, boost);
	}
}
