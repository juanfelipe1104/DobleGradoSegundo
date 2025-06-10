package com.utad.ds.template.medicine;

public class SpeechTerapist extends Doctor {
	public SpeechTerapist() {
		this("Doctor Fong");
	}
	public SpeechTerapist(String name) {
		super(name);
	}
	@Override
	public void examine() {
		System.out.println(super.name + " (speech terapist) examining children");
	}
	@Override
	public void sendDetailsToParents() {
		System.out.println(super.name + " (speech terapist) sending details to parents");
	}
	@Override
	public void sendInvoice() {
		System.out.println(super.name + " (speech terapist) sending invoice");
	}
}
