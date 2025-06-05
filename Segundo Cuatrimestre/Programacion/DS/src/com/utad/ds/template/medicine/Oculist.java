package com.utad.ds.template.medicine;

public class Oculist extends Doctor{
	public Oculist() {
		this("Doctor Wang");
	}
	public Oculist(String name) {
		super(name);
	}
	@Override
	public void examine() {
		System.out.println(super.name + " (oculist) examining children");
	}
	@Override
	public void sendDetailsToParents() {
		System.out.println(super.name + " (oculist) sending details to parents");
	}
	@Override
	public void sendInvoice() {
		System.out.println(super.name + " (oculist) sending invoice");
	}
}
