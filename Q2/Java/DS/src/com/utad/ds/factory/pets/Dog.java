package com.utad.ds.factory.pets;

public class Dog implements Animal {
	@Override
	public Integer getNumLegs() {
		return 4;
	}
	@Override
	public void noise() {
		System.out.println("Bark");
	}

}
