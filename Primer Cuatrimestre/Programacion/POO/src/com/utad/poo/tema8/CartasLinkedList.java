package com.utad.poo.tema8;

import java.util.LinkedList;

import com.utad.poo.tema3.practica3.Carta;
import com.utad.poo.tema3.practica3.Palo;

public class CartasLinkedList {
	private LinkedList<Carta> cartas;
	public CartasLinkedList() {
		this.cartas = new LinkedList<Carta>();
		this.cartas.add(new Carta(3,Palo.OROS));
		this.cartas.add(new Carta(1,Palo.COPAS));
		this.cartas.add(new Carta(12,Palo.ESPADAS));
	}
	public boolean isEmpty() {
		return this.cartas.isEmpty();
	}
	public void addFirst(Carta carta) {
		this.cartas.addFirst(carta);
	}
	public void addLast(Carta carta) {
		this.cartas.addLast(carta);
	}
	public Carta removeFirst() {
		return this.cartas.removeFirst();
	}
	public Carta removeLast() {
		return this.cartas.removeLast();
	}
	public Carta getFirst() {
		return this.cartas.getFirst();
	}
	public Carta getLast() {
		return this.cartas.getLast();
	}
	public String toString() {
		return this.cartas.toString();
	}
	public static void main(String[] args) {
		CartasLinkedList cartasLinkedList = new CartasLinkedList();
		System.out.println(cartasLinkedList);
		//As de espadas al principio de la lista
		cartasLinkedList.addFirst(new Carta(1,Palo.ESPADAS));
		System.out.println(cartasLinkedList);
	}
	
}