package com.utad.ds.facade.atm;

import java.time.LocalDate;

public class AutomaticTellerMachine {
	public Double readAmount() {
		System.out.print("[Atm] Reading amount!! 1.000 €");
		System.out.println(" Done!");
		return 1000d;
	}
	public Boolean hasAvailableMoney(Double amount) {
		System.out.print("[Atm] checking available money in ATM!!");
		System.out.println(" Done!");
		return true;
	}
	public Double extractMoney(Double amount) {
		System.out.print("[Atm] Extracting money in process !! "+amount);
		System.out.println(" Done!");
		return amount;
	}
	public void printTicket() {
		LocalDate processDate = LocalDate.now();
    	System.out.println("Cajero Automatico 	ATM Number[U-TAD-ATM]");
    	System.out.println("Nº de Transaccion 	Transaction number");
    	System.out.println("Direccion 	Address");
    	System.out.println("Amount  1000€");
    	System.out.println("Fecha Date["+ processDate+"]");
	}
}
