#include <iostream>
#include "Agenda.h"

#define assertdomjudge(x) if(!(x)){std::cout<<"ERROR"<<std::endl;exit(0);}

Agenda::Agenda(int capacidad){
    this->capacidad = capacidad;
    this->nombres = new std::string[this->capacidad];
    this->telefonos = new long[this->capacidad];
    this->ocupadas = new bool[this->capacidad];
    for(int i = 0; i < this->capacidad; i++){
        this->ocupadas[i] = false;
    }
}

int Agenda::obtenerPosicion(long telefono){
    return telefono % this->capacidad;
}

bool Agenda::existeContacto(long telefono){
    return this->ocupadas[this->obtenerPosicion(telefono)] && this->telefonos[this->obtenerPosicion(telefono)] == telefono;
}

std::string Agenda::getContacto(long telefono){
    assertdomjudge(this->existeContacto(telefono));
    return this->nombres[this->obtenerPosicion(telefono)];
}

void Agenda::introducirContacto(long telefono, std::string contacto){
    assertdomjudge(!this->ocupadas[this->obtenerPosicion(telefono)]);
    int posicion = this->obtenerPosicion(telefono);
    this->telefonos[posicion] = telefono;
    this->nombres[posicion] = contacto;
    this->ocupadas[posicion] = true;
}

void Agenda::eliminarContacto(long telefono){
    assertdomjudge(this->existeContacto(telefono));
    this->ocupadas[this->obtenerPosicion(telefono)] = false;
}

void Agenda::imprimir() {
	for (int i = 0; i < this->capacidad; i++){
        std::cout << "Posicion " << i << " | Ocupada: " << this->ocupadas[i] << " | Telefono: " << this->telefonos[i] << " | Nombre: " << this->nombres[i] << std::endl;
    }
}

Agenda::~Agenda(){
    delete [] this->nombres;
    delete [] this->telefonos;
    delete [] this->ocupadas;
}