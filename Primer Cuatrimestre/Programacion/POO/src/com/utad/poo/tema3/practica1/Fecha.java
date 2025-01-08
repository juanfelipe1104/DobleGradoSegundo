package com.utad.poo.tema3.practica1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

public class Fecha implements Comparable<Fecha>{
	public static final String [] NOMBRES_DIAS = {"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
	public static final String [] NOMBRES_MESES = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
	public static final Integer[] NUMERO_DIAS_MESES = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static final Integer[] MODULO_MESES = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
	public static final Integer[] MODULO_MESES_BISIESTO = {0, 3, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6};
	public static final Integer FECHA_ANTERIOR = -1, FECHA_POSTERIOR = 1, FECHA_IGUAL = 0;
	private String nombreDia, nombreMes;
	private Integer dia, mes, anio;
	public Fecha() {
		this(Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
	}
	public Fecha(Integer dia) {
		this(dia, Calendar.getInstance().get(Calendar.MONTH)+1);
	}
	public Fecha(Integer dia, Integer mes) {
		this(dia, mes, Calendar.getInstance().get(Calendar.YEAR));
	}
	public Fecha(Integer dia, Integer mes, Integer anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
		this.nombreDia = Fecha.NOMBRES_DIAS[this.diaSemana()];
		this.nombreMes = Fecha.NOMBRES_MESES[this.mes-1];
	}
	//Algoritmo buscado para calcular que dia de la semana es ya que todos los meses no inician en Lunes
	private Integer diaSemana() {
		Integer resultado = 0;
		if (this.esBisiesto()) {
			resultado = ((this.anio - 1)%7) + (((this.anio - 1)/4 - (3*((this.anio - 1)/100 + 1)/4)%7) + Fecha.MODULO_MESES_BISIESTO[this.mes -1] + this.dia%7)%7;
		}
		else {
			resultado = ((this.anio - 1)%7) + (((this.anio - 1)/4 - (3*((this.anio - 1)/100 + 1)/4)%7) + Fecha.MODULO_MESES[this.mes -1] + this.dia%7)%7;
		}
		return resultado;
	}
	private Boolean esBisiesto() {
		Boolean resultado = false;
		if ((this.anio % 4 == 0) && (this.anio % 100 != 0) || (this.anio % 400 == 0)) {
			resultado = true;
		}
		return resultado;
	}
	public Integer diasMes() {
		return this.diasMes(this.mes);
	}
	public Integer diasMes(Integer mes) {
		Integer diasMes = 0;
		if (this.esBisiesto() && (mes == 2)) {
			diasMes = Fecha.NUMERO_DIAS_MESES[mes-1] + 1;
		}
		else {
			diasMes = Fecha.NUMERO_DIAS_MESES[mes-1];
		}
		return diasMes;
	}
	public int compareTo(Fecha otraFecha) {
		int resultado = 0;
		if (this.anio < otraFecha.anio) {
			resultado = Fecha.FECHA_POSTERIOR;
		}
		else if (this.anio.equals(otraFecha.anio)) {
			if (this.mes < otraFecha.mes) {
				resultado = Fecha.FECHA_POSTERIOR;
			}
			else if (this.mes.equals(otraFecha.mes)) {
				if (this.dia < otraFecha.dia) {
					resultado = Fecha.FECHA_POSTERIOR;
				}
				else if (this.dia.equals(otraFecha.dia)) {
					resultado = Fecha.FECHA_IGUAL;
				}
				else {
					resultado = Fecha.FECHA_ANTERIOR;
				}
			}
			else {
				resultado = Fecha.FECHA_ANTERIOR;
			}
		}
		else {
			resultado = Fecha.FECHA_ANTERIOR;
		}
		return resultado;
	}
	public Boolean esAnterior(Fecha fecha) {
		Boolean resultado = false;
		if (this.compareTo(fecha) == Fecha.FECHA_ANTERIOR) {
			resultado = true;
		}
		return resultado;
	}
	public Boolean esPosterior(Fecha fecha) {
		Boolean resultado = false;
		if (this.compareTo(fecha) == Fecha.FECHA_POSTERIOR) {
			resultado = true;
		}
		return resultado;
	}
	public boolean equals(Object obj) {
		boolean resultado = false;
		if (obj instanceof Fecha) {
			Fecha fecha = (Fecha)obj;
			if (compareTo(fecha) == Fecha.FECHA_IGUAL) {
				resultado = true;
			}
		}
		return resultado;
	}
	public String toString() {
		return this.nombreDia + ", " + this.dia + " de " + this.nombreMes + " del " + this.anio;
	}
	public String getNombreDia() {
		return this.nombreDia;
	}
	public void setNombreDia(String nombreDia) {
		this.nombreDia = nombreDia;
	}
	public String getNombreMes() {
		return this.nombreMes;
	}
	public void setNombreMes(String nombreMes) {
		this.nombreMes = nombreMes;
	}
	public Integer getDia() {
		return this.dia;
	}
	public void setDia(Integer dia) {
		this.dia = dia;
	}
	public Integer getMes() {
		return this.mes;
	}
	public void setMes(Integer mes) {
		this.mes = mes;
	}
	public Integer getAnio() {
		return this.anio;
	}
	public void setAnio(Integer anio) {
		this.anio = anio;
	}
	public static void main(String[] args) {
		Fecha today = new Fecha();
		Fecha dia7 = new Fecha(7);
		Fecha octubre10 = new Fecha(10,10);
		Fecha octubre10Del2003 = new Fecha(10,10,2003);
		List<Fecha> fechas = new ArrayList<Fecha>();
		System.out.println(today + " cuyo mes tiene " + today.diasMes() + " dias");
		System.out.println(dia7);
		System.out.println(octubre10);
		System.out.println(octubre10Del2003);
		if (dia7.esAnterior(octubre10)) {
			System.out.println("La fecha " + dia7 + " es anterior a " + octubre10);
		}
		fechas.add(dia7);
		fechas.add(octubre10);
		fechas.add(octubre10Del2003);
		System.out.println("Fechas desordenadas: " + fechas);
		Collections.sort(fechas);
		System.out.println("Fechas ordenadas: " + fechas);
	}
}