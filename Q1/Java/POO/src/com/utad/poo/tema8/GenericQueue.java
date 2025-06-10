package com.utad.poo.tema8;

public class GenericQueue<T> extends GenericLinkedList<T>{
	public GenericQueue() {
		super();
	}
	public void enqueue(T t) {
		super.addLast(t);
	}
	public T dequeue() {
		return super.removeFirst();
	}
	public String toString() {
		return super.toString();
	}
	public static void main(String[] args) {
		GenericQueue<String> colaNombres = new GenericQueue<String>();
		colaNombres.enqueue("Daniel");
		colaNombres.enqueue("Rafael");
		colaNombres.enqueue("Juan");
		System.out.println(colaNombres);
		System.out.println(colaNombres.dequeue());
		System.out.println(colaNombres.dequeue());
		System.out.println(colaNombres.dequeue());
	}
}
