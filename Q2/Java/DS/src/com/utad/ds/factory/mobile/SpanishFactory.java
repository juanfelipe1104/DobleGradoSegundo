package com.utad.ds.factory.mobile;

public class SpanishFactory implements MobileFactory {
	@Override
	public Mobile createMobile(TypeMobile typeMobile) {
		if(typeMobile.equals(TypeMobile.IPHONE)) {
			return new Iphone("es");
		}
		else {
			return new SamsungMobile("es");
		}
	}
}
