package com.utad.ds.singleton.soup;

public class QuickSoup {
	public static QuickSoup getInstance() {
		return new QuickSoup();
	}
	private QuickSoup() {
		
	}
	public void ready() {
		System.out.println("Soup is ready!");
	}
}
