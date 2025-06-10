package com.utad.poo.tema5;

import java.util.Random;

public class OddEvenNumber {
	public static void numberProcesing() throws Exception{
		Integer numero = new Random().nextInt();
		if ((numero%2)==0) {
			throw new EvenException(numero);
		}
		else {
			throw new OddException(numero);
		}
	}
	public static void main(String[] args) {
		try {
			OddEvenNumber.numberProcesing();
		}catch(OddException e) {
			System.out.println("Hay un error " + e.getClass());
			System.out.println(e.getMessage());
		}catch(EvenException e) {
			System.out.println("Hay un error " + e.getClass());
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Hay un error " + e.getClass());
			System.out.println(e.getMessage());
		}
	}
}
