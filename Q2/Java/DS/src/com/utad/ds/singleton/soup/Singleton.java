package com.utad.ds.singleton.soup;

public class Singleton {
	private static Singleton singleton = new Singleton();
	public static Singleton getInstance() {
		return Singleton.singleton;
	}
	private Singleton() {
		
	}
	public void ready() {
		System.out.println("Soup is ready!");
	}
}
