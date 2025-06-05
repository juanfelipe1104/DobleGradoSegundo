package com.utad.ds.strategy.medicine.solution2;

public class Oculist implements Doctor{
	private String name;
	public Oculist() {
		this("Doctor Wang");
	}
	public Oculist(String name) {
		this.name = name;;
	}
	@Override
	public void applyMedicalStrategy() {
		this.examine();
		this.sendDetailsToParents();
	}
	@Override
	public void examine() {
		System.out.println(this.name + " (oculist) examining children");
	}
	@Override
	public void sendDetailsToParents() {
		System.out.println(this.name + " (oculist) sending details to parents");
	}
}
