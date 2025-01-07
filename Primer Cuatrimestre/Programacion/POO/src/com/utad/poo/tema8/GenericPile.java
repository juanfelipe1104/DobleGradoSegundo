package com.utad.poo.tema8;

public class GenericPile<T> extends GenericLinkedList<T>{
	public GenericPile(){
		super();
	}
	public void push(T t) {
		super.addLast(t);
	}
	public T pop() {
		return super.removeLast();
	}
	public String toString() {
		return super.toString();
	}
	public static void main(String[] args) {
		GenericPile<String> pilaNombres = new GenericPile<String>();
		pilaNombres.push("Daniel");
		pilaNombres.push("Rafael");
		pilaNombres.push("Juan");
		System.out.println(pilaNombres);
		System.out.println(pilaNombres.pop());
		System.out.println(pilaNombres.pop());
		System.out.println(pilaNombres.pop());
	}
}
