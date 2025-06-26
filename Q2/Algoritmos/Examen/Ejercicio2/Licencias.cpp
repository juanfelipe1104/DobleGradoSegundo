#include "Licencias.h"
#include "ListaEnlazada.h"
#include <iostream>

Licencias::Licencias(int capacidad) {
	this->capacidad = capacidad;
	this->n = 0;
	this->tabla = new ListaEnlazada[this->capacidad];
}

int Licencias::obtenerPosicion (long codigo) {
	return codigo % this->capacidad;
}

void Licencias::insertarLicencia (long codigo, std::string herramienta) {
	Licencia licencia = {codigo, herramienta};
	int posicionEnTabla = this->obtenerPosicion(codigo);
	this->tabla[posicionEnTabla].insertar(0, licencia);
}

void Licencias::eliminarLicencia (long codigo) {
	Licencia licencia = {codigo, ""};
	int posicionEnTabla = this->obtenerPosicion(codigo);
	int posicionEnLista = this->tabla[posicionEnTabla].buscar(licencia);
	this->tabla[posicionEnTabla].eliminar(posicionEnLista);
}

void Licencias::imprimir() {
	std::cout << std::endl;
	for (int i=0; i < this->capacidad; i++) {
		std::cout << "P" << i << ": ";
		this->tabla[i].imprimir();
	}
}
