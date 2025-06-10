package com.utad.ds.strategy.medicine.solution2;

public interface Doctor extends MedicalStrategy{
	public abstract void applyMedicalStrategy();
	public abstract void examine();
	public abstract void sendDetailsToParents();
}
