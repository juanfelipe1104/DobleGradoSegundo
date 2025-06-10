package com.utad.ds.proyectoPersonal.abstractFactory;

import java.util.List;

import com.utad.ds.proyectoPersonal.abstractFactory.activity.Activity;
import com.utad.ds.proyectoPersonal.abstractFactory.transport.Transport;

public class PackageFactoryContext {
	private static PackageFactoryContext packageFactoryContext = new PackageFactoryContext(new EconomicPackageFactory());
	public static PackageFactoryContext getInstance() {
		return PackageFactoryContext.packageFactoryContext;
	}
	private AbstractPackageFactory factory;
	private PackageFactoryContext(AbstractPackageFactory factory) {
		this.factory = factory;
	}
	public Transport createTransport() {
		return this.factory.createTransport();
	}
    public List<Activity> createActivities(){
    	return this.factory.createActivities();
    }
	public void setFactory(AbstractPackageFactory factory) {
		this.factory = factory;
	}
}
