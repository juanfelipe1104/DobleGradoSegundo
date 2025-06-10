package com.utad.poo.tema8;

import java.util.LinkedList;

import com.utad.poo.tema3.practica3.Carta;
import com.utad.poo.tema3.practica3.Palo;

public class GenericLinkedList <T> {
	private LinkedList<T> genericLinkedList;
	public GenericLinkedList() {
		this.genericLinkedList = new LinkedList<T>();
	}
	public boolean isEmpty() {
		return this.genericLinkedList.isEmpty();
	}
	public void addFirst(T t) {
		this.genericLinkedList.addFirst(t);
	}
	public void addLast(T t) {
		this.genericLinkedList.addLast(t);
	}
	public T removeFirst() {
		return this.genericLinkedList.removeFirst();
	}
	public T removeLast() {
		return this.genericLinkedList.removeLast();
	}
	public T getFirst() {
		return this.genericLinkedList.getFirst();
	}
	public T getLast() {
		return this.genericLinkedList.getLast();
	}
	public String toString() {
		return this.genericLinkedList.toString();
	}
	public static void main(String[] args) {
		GenericLinkedList<Carta> cartasLinkedList = new GenericLinkedList<Carta>();
		cartasLinkedList.addFirst(new Carta(1, Palo.ESPADAS));
		cartasLinkedList.addLast(new Carta(6, Palo.OROS));
		cartasLinkedList.addLast(new Carta(3, Palo.BASTOS));
		cartasLinkedList.addFirst(new Carta(12, Palo.ESPADAS));
		System.out.println(cartasLinkedList);
	}
}
