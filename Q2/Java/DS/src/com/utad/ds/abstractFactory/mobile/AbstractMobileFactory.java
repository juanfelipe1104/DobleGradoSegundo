package com.utad.ds.abstractFactory.mobile;

public interface AbstractMobileFactory {
	public abstract Mobile createIphone();
	public abstract Mobile createIphone(String language);
	public abstract Mobile createSamsung();
	public abstract Mobile createSamsung(String language);
	public abstract Mobile createMotorola();
	public abstract Mobile createMotorola(String language);
}
