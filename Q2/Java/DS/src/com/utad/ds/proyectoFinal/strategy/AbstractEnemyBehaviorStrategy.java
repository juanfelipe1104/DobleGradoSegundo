package com.utad.ds.proyectoFinal.strategy;

import java.util.Random;

import com.utad.ds.proyectoFinal.common.ActionException;
import com.utad.ds.proyectoFinal.common.Character;

public abstract class AbstractEnemyBehaviorStrategy implements EnemyBehaviorStrategy{
	//Metodo que en funcion de las probabilidades de realizar cada accion decide hacer una u otra
	public void chooseAction(Integer probAtk, Integer probMag, Integer probHeal, Character performer, Character target) throws ActionException{
		Random random = new Random();
		Integer numRandom = random.nextInt(0, 99) + 1;	
		//Ataque fisico
		if(numRandom <= probAtk){
			performer.getPhysicalAttackAction().performActionFirst(performer, target);
		}	
		//Ataque magico
		else if(numRandom > probAtk && numRandom <=probAtk + probMag){
			if(performer.hasEnoughMP()){
				performer.getMagicAttackAction().performActionFirst(performer, target);
			}	
			//Si no tiene MP, en su lugar hace un ataque fisico
			else{
				performer.getPhysicalAttackAction().performActionFirst(performer, target);
			}
		}	
		//Curarse
		else if(numRandom > probAtk+probMag && numRandom <=probAtk+probMag+probHeal){
			if(performer.hasEnoughMP()){
				performer.getHealAction().performActionFirst(performer, target);
			}
			//Si no tiene MP, en su lugar se protege
			else{
				performer.getGuardAction().performActionFirst(performer, target);
			}
		}	
		//Protegerse
		else{
			performer.getGuardAction().performActionFirst(performer, target);
		}
	}
}
