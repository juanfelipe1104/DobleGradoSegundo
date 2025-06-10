package com.utad.poo.tema4.practica3;

import com.utad.poo.tema3.practica1.Fecha;

public class CuentaCheque extends CuentaPersonal {
	public static final Double COMISION_USO_DEFAULT = 0.5;
	public static final Double COMISION_SALDO_INSUFICIENTE_DEFAULT = 0.05;
	private Boolean numerosRojos;
	private Double comisionUsoChequera;
	private Double comisionSaldoInsuficiente;
	public CuentaCheque(Integer numeroCuenta, String nombreCliente) {
		this(numeroCuenta, nombreCliente, CuentaPersonal.SALDO_DEFAULT, CuentaCheque.COMISION_USO_DEFAULT, CuentaCheque.COMISION_SALDO_INSUFICIENTE_DEFAULT);
	}
	public CuentaCheque(Integer numeroCuenta, String nombreCliente, Double saldo, Double comisionUsoChequera, Double comisionSaldoInsuficiente) {
		super(numeroCuenta, nombreCliente, saldo);
		this.comisionUsoChequera = comisionUsoChequera;
		this.comisionSaldoInsuficiente = comisionSaldoInsuficiente;
		this.numerosRojos = super.saldo < 0;
	}
	public void comisionChequera() {
		if(new Fecha().getDia().equals(1)) {
			super.saldo -= (super.saldo * this.comisionUsoChequera);
		}
	}
	public void retirar(Double cantidad) {
		if (super.saldo < cantidad) {
			super.saldo -= (super.saldo * this.comisionSaldoInsuficiente);
			this.numerosRojos = true;
		}
		super.saldo -= cantidad;
	}
	public void depositar(Double cantidad) {
		super.depositar(cantidad);
		this.numerosRojos = super.saldo < 0;
	}
	public Boolean getNumerosRojos() {
		return this.numerosRojos;
	}
	public void setNumerosRojos(Boolean numerosRojos) {
		this.numerosRojos = numerosRojos;
	}
	public Double getComisionUsoChequera() {
		return this.comisionUsoChequera;
	}
	public void setComisionUsoChequera(Double comisionUsoChequera) {
		this.comisionUsoChequera = comisionUsoChequera;
	}
	public Double getComisionSaldoInsuficiente() {
		return this.comisionSaldoInsuficiente;
	}
	public void setComisionSaldoInsuficiente(Double comisionSaldoInsuficiente) {
		this.comisionSaldoInsuficiente = comisionSaldoInsuficiente;
	}
	public String toString() {
		return super.toString() + "CuentaCheque [numerosRojos=" + this.numerosRojos + ", comisionUsoChequera=" + this.comisionUsoChequera
				+ ", comisionSaldoInsuficiente=" + this.comisionSaldoInsuficiente + "]";
	}
	
}
