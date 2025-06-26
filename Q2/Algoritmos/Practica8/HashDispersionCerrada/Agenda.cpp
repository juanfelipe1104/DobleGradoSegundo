#include <iostream>
#include "Agenda.h"

#define assertdomjudge(x) if(!(x)){std::cout<<"ERROR"<<std::endl;exit(0);}

Agenda::Agenda(int capacidad){
    this->capacidad = capacidad;
    this->n = 0;
    this->nombres = new std::string[this->capacidad];
    this->telefonos = new long[this->capacidad];
    this->vacias = new bool[this->capacidad];
    this->borradas = new bool[this->capacidad];
    for(int i = 0; i < this->capacidad; i++){
        this->vacias[i] = true;
        this->borradas[i] = false;
    }
}

int Agenda::obtenerPosicion(long telefono){
    return telefono % this->capacidad;
}

int Agenda::buscarContacto(long telefono){
    int posiblePosicion = this->obtenerPosicion(telefono);
    bool encontrado = false;
    for(int i = posiblePosicion; i < this->capacidad && !encontrado; i++){
        if(this->telefonos[i] == telefono && !this->borradas[i]){
            posiblePosicion = i;
            encontrado = true;
        }
    }
    for(int i = 0; i < posiblePosicion && !encontrado; i++){
        if(this->telefonos[i] == telefono && !this->borradas[i]){
            posiblePosicion = i;
            encontrado = true;
        }
    }
    if(!encontrado){
        posiblePosicion = -1;
    }
    return posiblePosicion;
}

int Agenda::buscarHueco(long telefono){
    assertdomjudge(!this->isLlena());
    int posiblePosicion = this->obtenerPosicion(telefono);
    bool encontrado = false;
    for(int i = posiblePosicion; i < this->capacidad && !encontrado; i++){
        if(this->vacias[i]){
            posiblePosicion = i;
            encontrado = true;
        }
    }
    for(int i = 0; i < posiblePosicion && !encontrado; i++){
        if(this->vacias[i]){
            posiblePosicion = i;
            encontrado = true;
        }
    }
    return posiblePosicion;
}
bool Agenda::isLlena(){
    return this->capacidad == this->n;
}

bool Agenda::existeContacto(long telefono){
    if(this->buscarContacto(telefono) != -1){
        return true;
    }
    else{
        return false;
    }
}

std::string Agenda::getContacto(long telefono){
    assertdomjudge(this->existeContacto(telefono));
    return this->nombres[this->buscarContacto(telefono)];
}

void Agenda::introducirContacto(long telefono, std::string contacto){
    assertdomjudge(!this->isLlena());
    int posicion = this->buscarHueco(telefono);
    this->telefonos[posicion] = telefono;
    this->nombres[posicion] = contacto;
    this->vacias[posicion] = false;
    this->borradas[posicion] = false;
    this->n++;
}

void Agenda::eliminarContacto(long telefono){
    assertdomjudge(this->existeContacto(telefono));
    int posicion = this->buscarContacto(telefono);
    this->vacias[posicion] = true;
    this->borradas[posicion] = true;
    this->n--;
}

void Agenda::imprimir() {
	for (int i=0; i<capacidad; i++) 
		std::cout << "Posicion " << i << " | Vacia: " << vacias[i] << " | Borrada: " << borradas[i] << " | Telefono: " << telefonos[i] << " | Nombre: " << nombres[i] << std::endl;
}

Agenda::~Agenda(){
    delete [] nombres;
    delete [] telefonos;
    delete [] vacias;
    delete [] borradas;
}