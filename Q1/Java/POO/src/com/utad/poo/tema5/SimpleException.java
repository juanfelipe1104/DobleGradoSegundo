package com.utad.poo.tema5;

public class SimpleException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7764596360911140385L;
	public SimpleException() {
		this("Fallo simple");
	}
	public SimpleException(String mensaje) {
		super(mensaje);
	}
	public static void method(String mensaje) throws SimpleException{
		System.out.println("Throw SimpleException from method()");
		throw new SimpleException(mensaje);
	}
	public static void main(String[] args) {
		try {
			SimpleException.method("Estoy fuera de servicio");
		}catch(SimpleException e){
			System.out.println("Hay un error " + e.getClass());
			System.out.println(e.getMessage());
		}
	}
}
