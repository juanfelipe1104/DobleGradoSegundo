package com.utad.ds.strategy.medicine.solution1;

public class KinderGarden {
	private Doctor doctor;
	public KinderGarden() {
		this(new Oculist()); 
	}
	public KinderGarden(Doctor doctor) {
		this.doctor = doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public void examine() {
		this.doctor.examine(); //Delegación por agregación
	}
	public void sendDetailsToParents() {
		this.doctor.sendDetailsToParents(); //Delegación por agregación
	}
}
