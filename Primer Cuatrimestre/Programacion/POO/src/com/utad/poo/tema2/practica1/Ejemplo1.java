package com.utad.poo.tema2.practica1;

public class Ejemplo1 { //a)
	public static void main(String[] args) { //b)
		String shortMsg = "Short Message"; //c)
		String longMsg = "Looooong Message"; //d)
		Boolean printShort = true; //e)
		Integer j = 0;
		//int counter; )f)
		//System.out.println("Valor de counter: " + counter); //f) Da error ya que la variable no esta incializada
		if (printShort) { //g)
			System.out.println(shortMsg);
		}
		else { //h)
			System.out.println(longMsg);
		}
		System.out.println("This message is always printed"); //i) 
		for (int i = 0; i < 10; i++) { //j)
			System.out.println("Are we there yet" + i);
		}
		while (j <= 7) { //k)
			System.out.println("I am going to pass this course " + j);
			j++;
		}
	}
}