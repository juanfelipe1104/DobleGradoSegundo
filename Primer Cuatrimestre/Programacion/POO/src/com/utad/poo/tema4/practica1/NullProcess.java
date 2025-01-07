package com.utad.poo.tema4.practica1;

public class NullProcess extends Process{
	public static final Integer NULL_PRIORITY = 0;
	public NullProcess() {
		super("Null Process", NullProcess.NULL_PRIORITY);
	}
	public String toString() {
		return "NullProcess [pid=" + super.pid + ", priority=" + super.priority + ", name=" + super.name + "]";
	}
}
