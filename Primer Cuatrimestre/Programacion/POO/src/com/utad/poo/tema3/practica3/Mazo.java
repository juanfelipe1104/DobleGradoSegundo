package com.utad.poo.tema3.practica3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mazo {
	public static final Integer MAX_CARTAS = 40;
	private Integer posicionActual;
	private List<Carta> cartas;
	public Mazo() {
		this.cartas = new ArrayList<Carta>();
		this.crearPalo(Palo.OROS);
		this.crearPalo(Palo.ESPADAS);
		this.crearPalo(Palo.COPAS);
		this.crearPalo(Palo.BASTOS);
		this.posicionActual = 0;
	}
	private void crearPalo(Palo palo) {
		for (int i = Carta.MIN_CARTA_NUM; i <= Carta.MAX_CARTA_NUM; i++) {
			this.cartas.add(new Carta(i, palo));
		}
		for (int i = Carta.MIN_CARTA_FIG; i <= Carta.MAX_CARTA_FIG; i++) {
			this.cartas.add(new Carta(i, palo));
		}
	}
	public void barajar() {
		for (int i = 0; i < this.cartas.size(); i++) {
			this.cartas.get(i).setPosicionEnMazo(Carta.DEFAULT_POS);
		}
		for (int i = 0; i < this.cartas.size(); i++) {
			this.cartas.get(i).setPosicionEnMazo(this.asignarPosicion());
		}
		Collections.sort(this.cartas);
		this.posicionActual = 0;
	}
	private Integer asignarPosicion() {
		Integer posicion = 0;
		do {
			posicion = (int)(Math.random() * this.cartas.size());
		}while(this.posicionOcupada(posicion));
		return posicion;
	}
	private Boolean posicionOcupada(Integer posicion) {
		Boolean resultado = false;
		for (int i = 0; (i < this.cartas.size()) && (!resultado); i++) {
			if (this.cartas.get(i).getPosicionEnMazo().equals(posicion)) {
				resultado = true;
			}
		}
		return resultado;
	}
	public Integer cartasDisponibles() {
		return this.cartas.size() - this.posicionActual;
	}
	public Carta siguienteCarta() {
		Carta siguiente = null;
		siguiente = this.cartas.get(this.posicionActual);
		return siguiente;
	}
	public List<Carta> darCartas(Integer numCartas){
		List<Carta> cartasSolicitadas = null;
		if (this.cartasDisponibles() >= numCartas) {
			cartasSolicitadas = new ArrayList<Carta>();
			for (int i = 0; i < numCartas; i++) {
				cartasSolicitadas.add(this.cartas.get(i+this.posicionActual));
			}
			this.posicionActual += numCartas;
		}
		return cartasSolicitadas;
	}
	public void cartasMonton() {
		for (int i = 0; i < this.posicionActual; i++) {
			System.out.println(this.cartas.get(i));
		}
	}
	public void mostrarBaraja() {
		for (int i = this.posicionActual; i < this.cartas.size(); i++) {
			System.out.println(this.cartas.get(i));
		}
	}
	public String toString() {
		return "Mazo [posicionActual=" + this.posicionActual + ", cartas=" + this.cartas + "]";
	}
	public Integer getPosicionActual() {
		return this.posicionActual;
	}
	public void setPosicionActual(Integer posicionActual) {
		this.posicionActual = posicionActual;
	}
	public List<Carta> getCartas() {
		return this.cartas;
	}
	public void setCartas(List<Carta> cartas) {
		this.cartas = cartas;
	}
}
