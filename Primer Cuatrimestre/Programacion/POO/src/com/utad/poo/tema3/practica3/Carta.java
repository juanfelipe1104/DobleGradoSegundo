package com.utad.poo.tema3.practica3;

import java.util.List;

public class Carta implements Comparable<Carta>{
	public static final Integer MIN_CARTA_NUM = 1;
	public static final Integer MAX_CARTA_NUM = 7;
	public static final Integer MIN_CARTA_FIG = 10;
	public static final Integer MAX_CARTA_FIG = 12;
	public static final Integer DEFAULT_POS = -1;
	private Integer numeroCarta;
	private Palo palo; 
	private Integer posicionEnMazo;
	public static Integer cartaMasAlta(List<Carta> cartas) {
		Integer indiceCartaMasAlta = 0;
		for (int i = 0; i < cartas.size(); i++) {
			if (cartas.get(i).getNumeroCarta() > cartas.get(indiceCartaMasAlta).getNumeroCarta()) {
				indiceCartaMasAlta = i;
			}
		}
		return indiceCartaMasAlta;
	}
	public Carta(Integer numeroCarta, Palo palo) {
		this(numeroCarta, palo, Carta.DEFAULT_POS);
	}
	public Carta(Integer numeroCarta, Palo palo, Integer posicionEnMazo) {
		this.numeroCarta = numeroCarta;
		this.palo = palo;
		this.posicionEnMazo = posicionEnMazo;
	}
	public int compareTo(Carta carta) {
		return this.posicionEnMazo.compareTo(carta.posicionEnMazo);
	}
	public Integer getNumeroCarta() {
		return this.numeroCarta;
	}
	public void setNumeroCarta(Integer numeroCarta) {
		this.numeroCarta = numeroCarta;
	}
	public Palo getPalo() {
		return this.palo;
	}
	public void setPalo(Palo palo) {
		this.palo = palo;
	}
	public Integer getPosicionEnMazo() {
		return this.posicionEnMazo;
	}
	public void setPosicionEnMazo(Integer posicionEnMazo) {
		this.posicionEnMazo = posicionEnMazo;
	}
	public String toString() {
		return "Carta [numeroCarta=" + this.numeroCarta + ", palo=" + this.palo + ", posicionEnMazo=" + this.posicionEnMazo + "]";
	}
}