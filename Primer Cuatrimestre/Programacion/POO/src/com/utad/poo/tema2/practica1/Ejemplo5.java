package com.utad.poo.tema2.practica1;
//Transformar un bucle while en for
/*
int i = 0;
while ( (!found) && (i < MAX_ITEMS) ) {
	found = (items[i] == find);
	i++;
}
System.out.println(i-1);
 */
public class Ejemplo5 {
	public static final int MAX_ITEMS = 10;
	public static void main(String[] args) {
		int [] items = {2, 4, 6, 8, 10, 9, 7, 5, 3, 1};
		boolean found = false;
		int find = 10;
		for (int i = 0; (i < Ejemplo5.MAX_ITEMS) && !found; i++) {
			found = (items[i] == find);
			if (found) {
				System.out.println(i-1);
			}
		}
	}
}
