package com.utad.ds.strategy.medicine.solution1;

public class SpeechTerapist implements Doctor {
	private String name;
	public SpeechTerapist() {
		this("Doctor Fong");
	}
	public SpeechTerapist(String name) {
		this.name = name;
	}
	@Override
	public void examine() {
		System.out.println(this.name + " (speech terapist) examining children");
	}
	@Override
	public void sendDetailsToParents() {
		System.out.println(this.name + " (speech terapist) sending details to parents");
	}
}
