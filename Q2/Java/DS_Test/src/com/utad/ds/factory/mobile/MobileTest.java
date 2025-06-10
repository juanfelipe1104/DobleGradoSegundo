package com.utad.ds.factory.mobile;

public class MobileTest {
	public static void main(String[] args) {
		Mobile phone = MobileFactoryManager.getInstance().createMobile(TypeMobile.SAMSUNG);
		System.out.println(phone.getBrand() + " with language " + phone.getLanguage());
	}
}
