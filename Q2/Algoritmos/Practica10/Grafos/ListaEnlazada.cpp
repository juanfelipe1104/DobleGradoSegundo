#include "ListaEnlazada.h"
#include <iostream>
#define assertdomjudge(x) if(!(x)){std::cout<<"ERROR"<<std::endl;exit(0);}

Nodo* ListaEnlazada::getNodo(int posicion){
    assertdomjudge(posicion < n && posicion >= 0);
    Nodo *current = this->lista;
    for(int i = 0; i < posicion; i++){
        current = current->siguiente;
    }
    return current;
}

ListaEnlazada::ListaEnlazada(){
    this->n=0;
    this->lista = nullptr;
}

int ListaEnlazada::getValor(int posicion){
    assertdomjudge(posicion < n && posicion >= 0);
    return this->getNodo(posicion)->elemento;
}

void ListaEnlazada::setValor(int posicion, int nuevoValor){
    assertdomjudge(posicion < n && posicion >= 0);
    this->getNodo(posicion)->elemento = nuevoValor;
}

int ListaEnlazada::getN(){
    return this->n;
}

void ListaEnlazada::insertar (int posicion, int nuevoValor){
    assertdomjudge(posicion >= 0 && posicion <= this->n );
    Nodo* nodoAInsertar = new Nodo{nuevoValor, nullptr};
    if(posicion == 0){
        nodoAInsertar->siguiente = this->lista;
        this->lista = nodoAInsertar;
    }
    else{
        Nodo *anterior = this->getNodo(posicion - 1);
        nodoAInsertar->siguiente = anterior->siguiente;
        anterior->siguiente = nodoAInsertar;
    }
    this->n++;
}

void ListaEnlazada::eliminar (int posicion){
    assertdomjudge(posicion < n && posicion >= 0);
    Nodo* nodoAEliminar = nullptr;
    if(posicion == 0){
        nodoAEliminar = this->lista;
        this->lista = this->lista->siguiente;
    }
    else{
        Nodo* anterior = this->getNodo(posicion-1);
        nodoAEliminar = anterior->siguiente;
        anterior->siguiente = nodoAEliminar->siguiente;
    }
    delete nodoAEliminar;
    this->n--;
}

void ListaEnlazada::concatenar(ListaEnlazada *listaAConcatenar){
    if(this->lista == nullptr){
        this->lista = listaAConcatenar->lista;
    }
    else{
        this->getNodo(this->n-1)->siguiente = listaAConcatenar->lista;
    }
    this->n += listaAConcatenar->n;
}

int ListaEnlazada::buscar(int elementoABuscar){
    Nodo* nodoABuscar = this->lista;
    bool encontrado = false;
    int posicion = -1;
    for(int i = 0; i < this->n; i++){
        if(nodoABuscar->elemento == elementoABuscar){
            posicion = i;
            encontrado = true;
        }
        nodoABuscar = nodoABuscar->siguiente;
    }
    return posicion;
}

ListaEnlazada::~ListaEnlazada(){
    Nodo *current = this->lista;
    while(current != nullptr){
        Nodo *auxiliar = current;
        current = current->siguiente;
        delete auxiliar;
    }
    this->lista = nullptr;
    this->n = 0;
}