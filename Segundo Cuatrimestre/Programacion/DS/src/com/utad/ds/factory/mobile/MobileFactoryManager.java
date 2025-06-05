package com.utad.ds.factory.mobile;

public class MobileFactoryManager {
	private static MobileFactoryManager mobileFactoryManager = 
			new MobileFactoryManager(new EnglishFactory());
	private MobileFactory mobileFactory;
	public static MobileFactoryManager getInstance() {
		return MobileFactoryManager.mobileFactoryManager;
	}
	private MobileFactoryManager(MobileFactory mobileFactory) {
		this.mobileFactory = mobileFactory;
	}
	public MobileFactory getMobileFactory() {
		return mobileFactory;
	}
	public void setMobileFactory(MobileFactory mobileFactory) {
		this.mobileFactory = mobileFactory;
	}
	public Mobile createMobile(TypeMobile typeMobile) {
		return this.mobileFactory.createMobile(typeMobile); //Delegación por agregación
	}
}
