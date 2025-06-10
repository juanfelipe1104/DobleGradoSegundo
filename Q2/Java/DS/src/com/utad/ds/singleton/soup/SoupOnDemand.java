package com.utad.ds.singleton.soup;

import java.util.Objects;

public class SoupOnDemand {
	private static SoupOnDemand soupOnDemand;
	public static synchronized SoupOnDemand getInstance() {
		if(Objects.isNull(SoupOnDemand.soupOnDemand)) {
			SoupOnDemand.soupOnDemand = new SoupOnDemand();
		}
		return SoupOnDemand.soupOnDemand;
	}
	private SoupOnDemand() {
		
	}
	public void ready() {
		System.out.println("Soup is ready!");
	}
	public static void main(String[] args) {
		QuickSoup quickSoup = QuickSoup.getInstance();
		SoupOnDemand soupOnDemand = SoupOnDemand.getInstance();
		Singleton singleSoup = Singleton.getInstance(); 
		quickSoup.ready();
		soupOnDemand.ready();
		singleSoup.ready();
	}
}
