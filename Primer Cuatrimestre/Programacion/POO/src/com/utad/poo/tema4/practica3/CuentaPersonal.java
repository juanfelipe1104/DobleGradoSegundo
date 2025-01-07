package com.utad.poo.tema4.practica3;

public class CuentaPersonal {
	public static final Double SALDO_DEFAULT = 0.0;
	protected Integer numeroCuenta;
	protected String nombreCliente;
	protected Double saldo;
	public CuentaPersonal(Integer numeroCuenta, String nombreCliente) {
		this(numeroCuenta, nombreCliente, CuentaPersonal.SALDO_DEFAULT);
	}
	public CuentaPersonal(Integer numeroCuenta, String nombreCliente, Double saldo) {
		this.numeroCuenta = numeroCuenta;
		this.nombreCliente = nombreCliente;
		this.saldo = saldo;
	}
	public void consultarDatos() {
		System.out.println(this.toString());
	}
	public void depositar(Double cantidad) {
		this.saldo += cantidad; 
	}
	public void retirar(Double cantidad) {
		if (this.saldo < cantidad) {
			System.out.println("No se pueden retirar: " + cantidad);
		}
		else {
			this.saldo -= cantidad;
		}
	}
	public boolean equals(Object object) {
		boolean iguales = false;
		if (object instanceof CuentaPersonal) {
			CuentaPersonal cuenta = (CuentaPersonal)object;
			iguales = this.numeroCuenta.equals(cuenta.numeroCuenta);
		}
		return iguales;
	}
	public Integer getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(Integer numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public String toString() {
		return "CuentaPersonal [numeroCuenta=" + this.numeroCuenta + ", nombreCliente=" + this.nombreCliente + ", saldo=" + this.saldo
				+ "]";
	}
}
