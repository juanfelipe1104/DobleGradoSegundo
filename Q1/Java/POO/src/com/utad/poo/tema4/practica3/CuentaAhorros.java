package com.utad.poo.tema4.practica3;

import com.utad.poo.tema3.practica1.Fecha;

public class CuentaAhorros extends CuentaPersonal {
	private Fecha fechaVencimiento;
	private Double interesMensual;
	public CuentaAhorros(Integer numeroCuenta, String nombreCliente, Double saldo, Fecha fechaVencimiento, Double interesMensual) {
		super(numeroCuenta, nombreCliente, saldo);
		this.fechaVencimiento = fechaVencimiento;
		this.interesMensual = interesMensual;
	}
	public void ingresarIntereses() {
		if(new Fecha().getDia().equals(1)) {
			super.depositar(super.saldo*this.interesMensual); 
		}
	}
	public void retirar(Double cantidad, Fecha fechaOperacion) {
		if(fechaOperacion.equals(this.fechaVencimiento)) {
			super.retirar(cantidad);
		}
		else {
			System.out.println("Solo se puede retirar el dia de vencimiento");
		}
	}
	public String toString() {
		return super.toString() + "CuentaAhorros [fechaVencimiento=" + this.fechaVencimiento + ", interesMensual=" + this.interesMensual + "]";
	}
}
