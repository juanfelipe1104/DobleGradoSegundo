package com.utad.ds.strategy.medicine.solution2;

public class TestKinderGarden {
	public static void main(String[] args) {
		KinderGarden kindergarden = new KinderGarden();
		//Day 15th
		System.out.println("Day 15th");
		kindergarden.setDoctor(new Oculist());
		kindergarden.applyMedicalStrategy();
		//Day 28th
		System.out.println("Day 28th");
		kindergarden.setDoctor(new SpeechTerapist());
		kindergarden.applyMedicalStrategy();
	}
}
