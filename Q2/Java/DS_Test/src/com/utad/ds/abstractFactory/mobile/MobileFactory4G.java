package com.utad.ds.abstractFactory.mobile;

public class MobileFactory4G implements AbstractMobileFactory {
	@Override
	public Mobile createIphone() {
		return this.createIphone(Language.ENGLISH.getIsoCode());
	}
	@Override
	public Mobile createIphone(String language) {
		return new Iphone4G(language);
	}
	@Override
	public Mobile createSamsung() {
		return this.createSamsung(Language.ENGLISH.getIsoCode());
	}
	@Override
	public Mobile createSamsung(String language) {
		return new Samsung4G(language);
	}

	@Override
	public Mobile createMotorola() {
		return this.createMotorola(Language.ENGLISH.getIsoCode());
	}

	@Override
	public Mobile createMotorola(String language) {
		return new Motorola4G(language);
	}

}
