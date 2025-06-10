package com.utad.ds.proyectoFinal.decorator;

import com.utad.ds.proyectoFinal.common.ActionException;
import com.utad.ds.proyectoFinal.common.Character;
import com.utad.ds.proyectoFinal.common.CharacterStats;

//Para ataques fisicos y magicos, el usuario absorbe una cantidad fija de daño dependiendo del nivel
public class AbsorbDamageComponentDecorator extends AbstractActionComponentDecorator{
	public static final Double BASE_DAMAGE_ABSORBED = 0.2;
	public static final String DEFAULT_NAME = "Mejora de absorber daño";
	public AbsorbDamageComponentDecorator(ActionComponent actionComponent, Integer level){
		this(actionComponent, level, AbsorbDamageComponentDecorator.DEFAULT_NAME);
	}
	public AbsorbDamageComponentDecorator(ActionComponent actionComponent, Integer level, String name) {
		super(actionComponent, level, name);
	}
	public String getDescription() {
		return super.getActionComponent().getDescription() + " con mejora de absorber daño de nivel " + this.level;
	}
	public void absorbDamage(Character performer){
		CharacterStats performerStats = performer.getCharacterStats();
		//Se cura en base al nivel del boost
		Integer healedDamage = (int)(performerStats.getStrength()*
				(AbsorbDamageComponentDecorator.BASE_DAMAGE_ABSORBED + (super.level-1)*0.1));
		System.out.println(performerStats.getName() + " ha absorbido " + healedDamage + " de vida.");
		performerStats.setHP(performerStats.getHP() + healedDamage);
		if(performerStats.getHP() > performerStats.getMaxHP()){
			performerStats.setHP(performerStats.getMaxHP());
		}
	}
	public void performAction(Character performer, Character target) throws ActionException{
		this.absorbDamage(performer);
		super.getActionComponent().performAction(performer, target);
	}
	public void performAction(Character performer, Character target, Integer boost) throws ActionException{
		this.absorbDamage(performer);
		super.getActionComponent().performAction(performer, target, boost);
	}
}
