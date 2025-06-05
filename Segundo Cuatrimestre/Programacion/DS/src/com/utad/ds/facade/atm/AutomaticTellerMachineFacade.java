package com.utad.ds.facade.atm;

public class AutomaticTellerMachineFacade implements AutomaticTellerMachineInterface {
	private Authentication authentication;
	private AutomaticTellerMachine automaticTellerMachine;
	private Account account;
	public AutomaticTellerMachineFacade(Authentication authentication, AutomaticTellerMachine automaticTellerMachine) {
		this.authentication = authentication;
		this.automaticTellerMachine = automaticTellerMachine;
	}
	@Override
	public void putPersonalData() {
		this.authentication.readCard();
		this.authentication.readKey();
		this.authentication.checkKey("key");
		this.account = this.authentication.getPersonalAccount();
	}
	@Override
	public void extractMoney() {
		Double amount = this.automaticTellerMachine.readAmount();
		this.automaticTellerMachine.hasAvailableMoney(amount);
		Double availableBalance = this.account.checkAvailableBalance();
		if(this.account.blockAccount()) {
			this.account.extractAmount(amount);
		}
		this.account.updateAccount();
		this.automaticTellerMachine.extractMoney(amount);
	}
}
