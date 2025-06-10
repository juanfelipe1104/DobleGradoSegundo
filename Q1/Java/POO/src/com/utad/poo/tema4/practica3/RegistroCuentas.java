package com.utad.poo.tema4.practica3;

import java.util.ArrayList;
import java.util.List;

public class RegistroCuentas {
	private List<CuentaPersonal> cuentas;
	public RegistroCuentas() {
		this.cuentas = new ArrayList<CuentaPersonal>();
	}
	public Boolean add(CuentaPersonal cuenta) {
		return this.cuentas.add(cuenta);
	}
	public Boolean remove(CuentaPersonal cuenta) {
		Boolean resultado = false;
		for (CuentaPersonal cuentaAuxiliar : this.cuentas) {
			if(cuentaAuxiliar.equals(cuenta)) {
				resultado = this.cuentas.remove(cuenta);
			}
		}
		return resultado;
	}
	public CuentaPersonal get(Integer index){
		CuentaPersonal cuenta = null;
		for (CuentaPersonal cuentaAuxiliar: this.cuentas) {
			if(cuentaAuxiliar.getNumeroCuenta().equals(index)) {
				cuenta = cuentaAuxiliar;
			}
		}
		return cuenta;
	}
}
