#include "ListaEnlazada.h"
#include <iostream>
#define assertdomjudge(x) if(!(x)){std::cout<<"ERROR"<<std::endl;exit(0);}

Nodo* ListaEnlazada::getNodo(int posicion){
    assertdomjudge(posicion < n && posicion >= 0);
    Nodo *current = this->lista;
    for(int i = 0; i < posicion; i++){
        current = current->siguienteNodo;
    }
    return current;
}

ListaEnlazada::ListaEnlazada(){
    this->n=0;
    this->lista = nullptr;
}

Contacto ListaEnlazada::getValor(int posicion){
    assertdomjudge(posicion < n && posicion >= 0);
    return this->getNodo(posicion)->elemento;
}

void ListaEnlazada::setValor(int posicion, Contacto nuevoValor){
    assertdomjudge(posicion < n && posicion >= 0);
    this->getNodo(posicion)->elemento = nuevoValor;
}

int ListaEnlazada::getN(){
    return this->n;
}

void ListaEnlazada::insertar (int posicion, Contacto nuevoValor){
    assertdomjudge(posicion >= 0 && posicion <= this->n );
    Nodo* nodoAInsertar = new Nodo{nuevoValor, nullptr};
    if(posicion == 0){
        nodoAInsertar->siguienteNodo = this->lista;
        this->lista = nodoAInsertar;
    }
    else{
        Nodo *anterior = this->getNodo(posicion - 1);
        nodoAInsertar->siguienteNodo = anterior->siguienteNodo;
        anterior->siguienteNodo = nodoAInsertar;
    }
    this->n++;
}

void ListaEnlazada::eliminar (int posicion){
    assertdomjudge(posicion < n && posicion >= 0);
    Nodo* nodoAEliminar = nullptr;
    if(posicion == 0){
        nodoAEliminar = this->lista;
        this->lista = this->lista->siguienteNodo;
    }
    else{
        Nodo* anterior = this->getNodo(posicion-1);
        nodoAEliminar = anterior->siguienteNodo;
        anterior->siguienteNodo = nodoAEliminar->siguienteNodo;
    }
    delete nodoAEliminar;
    this->n--;
}

void ListaEnlazada::concatenar(ListaEnlazada *listaAConcatenar){
    if(this->lista == nullptr){
        this->lista = listaAConcatenar->lista;
    }
    else{
        this->getNodo(this->n-1)->siguienteNodo = listaAConcatenar->lista;
    }
    this->n += listaAConcatenar->n;
}

int ListaEnlazada::buscar(Contacto elementoABuscar){
    Nodo* nodoABuscar = this->lista;
    bool encontrado = false;
    int posicion = -1;
    for(int i = 0; i < this->n && !encontrado; i++){
        if(nodoABuscar->elemento.telefono == elementoABuscar.telefono){
            posicion = i;
            encontrado = true;
        }
        nodoABuscar = nodoABuscar->siguienteNodo;
    }
    return posicion;
}

ListaEnlazada::~ListaEnlazada(){
    Nodo *current = this->lista;
    while(current != nullptr){
        Nodo *auxiliar = current;
        current = current->siguienteNodo;
        delete auxiliar;
    }
    this->lista = nullptr;
    this->n = 0;
}