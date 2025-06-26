#include "ListaEnlazada.h"
#include <iostream>

Nodo *ListaEnlazada::getNodo (int posicion) {
	Nodo *nodoActual = this->lista;
	for(int i = 0; i < posicion; i++){
		nodoActual = nodoActual->siguienteNodo;
	}
	return nodoActual;
}

ListaEnlazada::ListaEnlazada() {
	this->lista = nullptr;
	this->n = 0;
}

Licencia ListaEnlazada::getValor(int posicion) {
	return this->getNodo(posicion)->elemento;
}

void ListaEnlazada::setValor(int posicion, Licencia nuevoValor) {
	this->getNodo(posicion)->elemento = nuevoValor;
}

int ListaEnlazada::getN() {
	return this->n;
}

void ListaEnlazada::insertar (int posicion, Licencia nuevoValor) {
	Nodo *nodoAInsertar = new Nodo{nuevoValor, nullptr};
	if(posicion == 0){
		nodoAInsertar->siguienteNodo = this->lista;
		this->lista = nodoAInsertar;
	}
	else{
		Nodo *anterior = this->getNodo(posicion-1);
		Nodo *siguiente = anterior->siguienteNodo;
		anterior->siguienteNodo = nodoAInsertar;
		nodoAInsertar->siguienteNodo = siguiente;
	}
	this->n++;
}


void ListaEnlazada::eliminar (int posicion) {
	Nodo *nodoAEliminar = nullptr;
	if(posicion == 0){
		nodoAEliminar = this->lista;
		this->lista = this->lista->siguienteNodo;
	}
	else{
		Nodo *anterior = this->getNodo(posicion-1);
		nodoAEliminar = anterior->siguienteNodo;
		Nodo *siguiente = nodoAEliminar->siguienteNodo;
		anterior->siguienteNodo = siguiente;
	}
	this->n--;
}

int ListaEnlazada::buscar(Licencia elementoABuscar) {
	int posicionEncontrada = -1;
	bool encontrado = false;
	Nodo *nodoActual = this->lista;
	for(int i = 0; i < this->n && !encontrado; i++){
		if(nodoActual->elemento.codigo == elementoABuscar.codigo){
			posicionEncontrada = i;
			encontrado = true;
		}
	}
	return posicionEncontrada;
}

void ListaEnlazada::imprimir(){
	std::cout << "n=" << this->n << " | contenido=";
	Nodo *nodoActual = this->lista;
	for(int i = 0; i < this->n; i++){
		std::cout << "(" << nodoActual->elemento.codigo << ", " << nodoActual->elemento.herramienta << ") ";
		nodoActual = nodoActual->siguienteNodo;
	} 
	std::cout << std::endl;
}

ListaEnlazada::~ListaEnlazada() {
	while(this->n > 0){
		this->eliminar(0);
	}
}



