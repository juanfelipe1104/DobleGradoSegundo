package com.utad.ds.proyectoFinal.decorator;
import java.util.Random;

import com.utad.ds.proyectoFinal.common.CharacterStats;
import com.utad.ds.proyectoFinal.common.Character;

public class BattleCalculator {
	public static final Integer BASE_GUARDING_PERCENTAGE = 30;
	public static final Integer MAX_GUARDING_PERCENTAGE = 90;
	public static final Integer CRIT_RATE = 15;
	//Singleton
	private static BattleCalculator battleCalculator = new BattleCalculator();
	private BattleCalculator() {}
	public static BattleCalculator getInstance(){
		return BattleCalculator.battleCalculator;
	}
	//Hace una serie de cambios en el daño de base para que no siempre sea el mismo
	private Integer changeBaseDamage(Integer baseDamage, CharacterStats targetStats, Integer boost){
		Random random = new Random();
		Integer damage = baseDamage;
		if(damage > 0)	damage = random.nextInt((int)(0.8*baseDamage), (int)(1.2*baseDamage));
		damage += (int)(0.5*boost*damage);	
		if(targetStats.getGuarding()){
			damage = (int)(damage*((double)(100-targetStats.getGuardingPercentage())/100) );
		}	
		//Siempre se hace al menos 1 de daño
		if(damage <= 0){
			damage = 1;
		}
		return damage;
	}
	//Decide si un golpe fisico es critico o no
	private Boolean decideCrit(){
		Boolean crit = false;
		Random random = new Random();
		Integer numRandom = random.nextInt(0, 99)+1;
		if(numRandom <= BattleCalculator.CRIT_RATE){
			crit = true;
		}
		return crit;
	}
	public Integer calculatePhysicalDamage(Character attacker, Character target, Integer boost){
		CharacterStats attackerStats = attacker.getCharacterStats();
		CharacterStats targetStats = target.getCharacterStats();
		Integer baseDamage = attackerStats.getStrength() - (int)(targetStats.getPhysicalDef()*0.75);
		Integer damage = this.changeBaseDamage(baseDamage, targetStats, boost);
		//Un golpe critico deja al enemigo herido y hace mas daño. Solo los golpes fisicos pueden ser criticos
		if(this.decideCrit()){
			System.out.println("Un golpe crítico!");
			damage = (int)(damage*1.5);
			if(!targetStats.getReflecting()){
				target.removeSideEffect();
				target.applyBleeding();
			}
			else{
				attacker.removeSideEffect();
				attacker.applyBleeding();
			}
			
		}
		if(targetStats.getReflecting()){
			damage = (int)(damage*-0.7);  //Refleja el 70% del daño si lo hace, y lo ponemos negativo para indicar que el daño se hace en sentido contrario
		}
		return damage;
	}
	public Integer calculateMagicDamage(Character attacker, Character target, Integer boost){
		CharacterStats attackerStats = attacker.getCharacterStats();
		CharacterStats targetStats = target.getCharacterStats();
		Integer baseDamage = attackerStats.getMagic() - (int)(targetStats.getMagicDef()*0.75);
		Integer damage = changeBaseDamage(baseDamage, targetStats, boost);
		if(targetStats.getReflecting()){
			damage = (int)(damage*-0.7);  //Refleja el 70% del daño si lo hace, y lo ponemos negativo para indicar que el daño se hace en sentido contrario
		}
		return damage;	
	}
	//En funcion del nivel del boost calcula el porcentaje de daño absorbido
	public Integer calculateGuardingPercentage(Integer boost){
		Integer result = BattleCalculator.BASE_GUARDING_PERCENTAGE + boost*10;
		if(result > BattleCalculator.MAX_GUARDING_PERCENTAGE){
			result = BattleCalculator.MAX_GUARDING_PERCENTAGE;
		}
		return result;
	}
	public Integer calculateHealing(Character performer, Integer boost){
		Integer result = 0;
		CharacterStats performerStats = performer.getCharacterStats();
		result = (int)((0.4 + boost/10)*performerStats.getMaxHP());
		return result;
	}
}
