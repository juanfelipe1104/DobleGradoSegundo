package com.utad.ds.template.medicine;

public abstract class Doctor implements MedicalStrategy{
	protected String name;
	public Doctor(String name) {
		this.name = name;
	}
	public final void applyMedicalStrategy() {
		this.examine();
		System.out.println("First operation finished");
		this.sendDetailsToParents();
		System.out.println("Second operation finished");
		this.sendInvoice();
		System.out.println("Third operation finished");
	}
	public abstract void examine();
	public abstract void sendDetailsToParents();
	public abstract void sendInvoice();
}
