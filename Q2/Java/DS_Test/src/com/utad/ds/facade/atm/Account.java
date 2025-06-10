package com.utad.ds.facade.atm;

public class Account {
	public double checkAvailableBalance(){
    	System.out.print("[Account] Checking available balance in personal account!!");
    	System.out.println(" Done!");
    	return 1000.0;
    }
	public boolean blockAccount(){
      	System.out.print("[Account]Blocking account!!");
      	System.out.println(" Done!");
      	return true;
    }
	public boolean unblockAccount(){
    	System.out.print("[Account]Unblocking account!!");
    	System.out.println(" Done!");
    	return true;
    }
	public void extractAmount(double amount){
    	System.out.print("[Account] Extract amount !! "+amount);
    	System.out.println(" Done!");	
    }

    public boolean updateAccount(){
     	System.out.print("[Account] Updating account!! ");
    	return true;
    }

    public void errorProcess(){}
}
