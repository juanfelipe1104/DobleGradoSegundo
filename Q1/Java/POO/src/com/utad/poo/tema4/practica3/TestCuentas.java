package com.utad.poo.tema4.practica3;

import com.utad.poo.tema3.practica1.Fecha;

public class TestCuentas {
	public static void main(String[] args) {
		CuentaPersonal cuentaDePaco = new CuentaPersonal(1, "Paco", 10.0);
		CuentaPersonal cuentaDeJose = new CuentaAhorros(2, "Jose", 20.0, new Fecha(31,12,2022), 2.0);
		CuentaPersonal cuentaDePilar = new CuentaCheque(3, "Pilar", 30.0, 3.0, 0.05);
		RegistroCuentas registroDeCuentas = new RegistroCuentas();
		registroDeCuentas.add(cuentaDePaco);
		registroDeCuentas.add(cuentaDeJose);
		registroDeCuentas.add(cuentaDePilar);
		CuentaPersonal cuentaDeBusqueda = null;
		//Buscamos la cuenta de Jose cuyo número de cuenta es 2
		cuentaDeBusqueda = registroDeCuentas.get(2);
		System.out.println("Cuenta de "+
		cuentaDeBusqueda.getNombreCliente()+
		" antes de operar \n"+cuentaDeBusqueda);
		cuentaDeBusqueda.depositar(20.0);
		cuentaDeBusqueda.retirar(30.0); //+20-30
		System.out.println("Cuenta de "+
		cuentaDeBusqueda.getNombreCliente()+
		" después de operar \n"+cuentaDeBusqueda);
		//Buscamos la cuenta de Pilar cuyo número de cuenta es 3
		cuentaDeBusqueda = registroDeCuentas.get(3);
		System.out.println("Cuenta de "+
		cuentaDeBusqueda.getNombreCliente()+
		" antes de operar \n"+cuentaDeBusqueda);
		cuentaDeBusqueda.depositar(20.0);
		cuentaDeBusqueda.retirar(60.0);//30+20-60(-2.5)
		System.out.println("Cuenta de "+
		cuentaDeBusqueda.getNombreCliente()+
		" después de operar \n"+cuentaDeBusqueda);
	}
}
