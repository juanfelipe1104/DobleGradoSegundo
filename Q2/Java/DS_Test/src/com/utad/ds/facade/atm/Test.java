package com.utad.ds.facade.atm;

public class Test {
	public static void main(String[] args) {
		Authentication authentication = new Authentication();
		AutomaticTellerMachine automaticTellerMachine = new AutomaticTellerMachine();
		AutomaticTellerMachineInterface automaticTellerMachineFacade = new AutomaticTellerMachineFacade(authentication, automaticTellerMachine);
		automaticTellerMachineFacade.putPersonalData();
		automaticTellerMachineFacade.extractMoney();
	}
}
