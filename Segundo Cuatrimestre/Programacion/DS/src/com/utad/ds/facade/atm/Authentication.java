package com.utad.ds.facade.atm;

public class Authentication {
	public boolean readCard(){
    	System.out.print("[Authentication] Reading card!!");
    	System.out.println("Done!");
    	return true;
    }
	public String  readKey(){
		System.out.print("[Authentication] Reading personal key!!");
    	System.out.println("Done!");
    	return "keyUser";
    }
	public boolean checkKey(String key){
    	System.out.print("[Authentication] System is checking personal key!!");
    	System.out.println("Done!");
    	return true;
    }
	public Account getPersonalAccount(){
    	System.out.print("[Authentication] Reading personal account!!");
    	System.out.println("Done!");
    	return new Account();
    }
	public void errorProcess(){}
}
