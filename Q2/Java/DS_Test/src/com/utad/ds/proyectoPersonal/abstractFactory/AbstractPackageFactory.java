package com.utad.ds.proyectoPersonal.abstractFactory;

import java.util.List;

import com.utad.ds.proyectoPersonal.abstractFactory.activity.Activity;
import com.utad.ds.proyectoPersonal.abstractFactory.transport.Transport;

public interface AbstractPackageFactory {
	public abstract Transport createTransport();
    public abstract List<Activity> createActivities();
}
