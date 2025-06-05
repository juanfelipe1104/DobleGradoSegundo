package com.utad.ds.decorator.kindergarden;

import com.utad.ds.observer.pushpull.library.Book;
import com.utad.ds.observer.pushpull.library.BookState;

public class KinderGardenTest {
	public static void main(String[] args) {
		KinderGarden kinderGarden = new KinderGarden();
		Book book = new Book("Design patterns", "Gang of four", BookState.GOOD);
		KinderGardenBaby ines = new KinderGardenBaby("Ines", 1);
		KinderGardenBaby kike = new KinderGardenBaby("Enrique", "Kike", 2);
		kinderGarden.add(ines);
		kinderGarden.add(kike);
		kinderGarden.checkBabies();
		ines.setBaseComponent(new CertificateRewardComponent(ines.getBaseComponent()));
		kinderGarden.checkBabies();
		ines.setBaseComponent(new WeeklyRewardComponent(ines.getBaseComponent(), book));
		kinderGarden.checkBabies();
		if(ines.getBaseComponent() instanceof WeeklyRewardComponent) {
			System.out.println(ines + " tiene el libro : " + ((WeeklyRewardComponent)ines.getBaseComponent()).getBook().getName());
		}
	}
}
