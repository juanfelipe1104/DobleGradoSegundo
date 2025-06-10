package com.utad.ds.proyectoFinal.common;

//Excepcion por si hay una incongruencia con las acciones
public class ActionException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	public ActionException(String message){
		this.message = message;
	}
	public String getMessage() { return this.message; }
}
