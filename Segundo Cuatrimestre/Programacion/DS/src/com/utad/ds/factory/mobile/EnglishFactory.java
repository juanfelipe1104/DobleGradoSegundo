package com.utad.ds.factory.mobile;

public class EnglishFactory implements MobileFactory {
	@Override
	public Mobile createMobile(TypeMobile typeMobile) {
		if(typeMobile.equals(TypeMobile.IPHONE)) {
			return new Iphone("en");
		}
		else {
			return new SamsungMobile("en");
		}
	}
}
