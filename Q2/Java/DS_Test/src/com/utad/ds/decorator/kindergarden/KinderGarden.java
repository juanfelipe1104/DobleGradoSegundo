package com.utad.ds.decorator.kindergarden;

import java.util.ArrayList;
import java.util.List;

public class KinderGarden {
	private List<KinderGardenBaby> babies;
	public KinderGarden() {
		this.babies = new ArrayList<KinderGardenBaby>();
	}
	public void add(KinderGardenBaby baby) {
		this.babies.add(baby);
	}
	public void checkBabies() {
		System.out.println("===Pasamos lista===");
		for(KinderGardenBaby baby : this.babies) {
			System.out.println(baby.getDescription());
		}
	}
}
