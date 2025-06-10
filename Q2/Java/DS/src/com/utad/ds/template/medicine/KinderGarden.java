package com.utad.ds.template.medicine;

public class KinderGarden {
	private MedicalStrategy doctor;
	public KinderGarden() {
		this(new NoService()); 
	}
	public KinderGarden(Doctor doctor) {
		this.doctor = doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public void applyMedicalStrategy() {
		this.doctor.applyMedicalStrategy(); //Delegación por agregación
	}
}
