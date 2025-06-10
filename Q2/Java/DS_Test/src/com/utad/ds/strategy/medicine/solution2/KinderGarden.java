package com.utad.ds.strategy.medicine.solution2;

public class KinderGarden {
	private MedicalStrategy doctor;
	public KinderGarden() {
		this(new Oculist()); 
	}
	public KinderGarden(MedicalStrategy doctor) {
		this.doctor = doctor;
	}
	public void setDoctor(MedicalStrategy doctor) {
		this.doctor = doctor;
	}
	public void applyMedicalStrategy() {
		this.doctor.applyMedicalStrategy(); //Delegación por agregación
	}
}
