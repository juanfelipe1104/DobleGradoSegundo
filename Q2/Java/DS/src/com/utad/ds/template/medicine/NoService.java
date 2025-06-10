package com.utad.ds.template.medicine;

public class NoService extends Doctor {
	public NoService() {
		super("N/A");
	}
	@Override
	public void examine() {
		System.out.println("No service");
	}

	@Override
	public void sendDetailsToParents() {
		System.out.println("No service");
	}
	@Override
	public void sendInvoice() {
		System.out.println("No service");
	}

}
