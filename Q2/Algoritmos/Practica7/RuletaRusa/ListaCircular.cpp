#include "ListaCircular.h"
#include <iostream>

#define assertdomjudge(x) if(!(x)){std::cout<<"ERROR"<<std::endl;exit(0);}

Nodo* ListaCircular::getNodo(int posicion){
    assertdomjudge(posicion < n && posicion >= 0);
    Nodo *current = this->lista;
    if(posicion < n/2){
        for(int i = 0; i < posicion; i++){
            current = current->siguienteNodo;
        }
    }
    else{
        for(int i = 0; i < n-posicion; i++){
            current = current->anteriorNodo;
        }
    }
    
    return current;
}

ListaCircular::ListaCircular(){
    this->n = 0;
    this->lista = nullptr;
}

std::string ListaCircular::getValor(int posicion){
    assertdomjudge(posicion < n && posicion >= 0);
    return this->getNodo(posicion)->elemento;
}

void ListaCircular::setValor(int posicion, std::string nuevoValor){
    assertdomjudge(posicion < n && posicion >= 0);
    this->getNodo(posicion)->elemento = nuevoValor;
}

int ListaCircular::getN(){
    return this->n;
}

void ListaCircular::insertar(int posicion, std::string nuevoValor) {
    assertdomjudge(posicion >= 0 && posicion <= this->n);
    Nodo* nodoAInsertar = new Nodo{nuevoValor, nullptr, nullptr};
    if (this->n == 0) {
        // Si la lista está vacía, el nuevo nodo se apunta a sí mismo
        this->lista = nodoAInsertar;
        nodoAInsertar->siguienteNodo = nodoAInsertar;
        nodoAInsertar->anteriorNodo = nodoAInsertar;
    }
    else if (posicion == 0) {
        // Insertar al inicio
        Nodo* ultimo = this->lista->anteriorNodo;
        nodoAInsertar->siguienteNodo = this->lista;
        nodoAInsertar->anteriorNodo = ultimo;
        this->lista->anteriorNodo = nodoAInsertar;
        ultimo->siguienteNodo = nodoAInsertar;
        this->lista = nodoAInsertar;
    }
    else {
        // Insertar en una posición distinta de cero
        Nodo* anterior = this->getNodo(posicion - 1);
        Nodo* siguiente = anterior->siguienteNodo;
        nodoAInsertar->siguienteNodo = siguiente;
        nodoAInsertar->anteriorNodo = anterior;
        anterior->siguienteNodo = nodoAInsertar;
        siguiente->anteriorNodo = nodoAInsertar;
    }
    this->n++;
}

void ListaCircular::eliminar(int posicion) {
    assertdomjudge(posicion < n && posicion >= 0);
    Nodo* nodoAEliminar = nullptr;
    if (n == 1) {
        // Caso especial: Solo hay un nodo en la lista
        nodoAEliminar = this->lista;
        this->lista = nullptr;
    } 
    else if (posicion == 0) {
        // Eliminar el primer nodo
        nodoAEliminar = this->lista;
        Nodo* ultimo = this->lista->anteriorNodo;
        this->lista = this->lista->siguienteNodo;
        this->lista->anteriorNodo = ultimo;
        ultimo->siguienteNodo = this->lista;
    } 
    else {
        // Eliminar en cualquier otra posición
        Nodo* anterior = this->getNodo(posicion - 1);
        nodoAEliminar = anterior->siguienteNodo;
        Nodo* siguiente = nodoAEliminar->siguienteNodo;
        anterior->siguienteNodo = siguiente;
        siguiente->anteriorNodo = anterior;
    }

    delete nodoAEliminar;
    this->n--;
}

void ListaCircular::girar(int p){
    if(p > 0){
        for(int i = 0; i < p; i++){
            this->lista = this->lista->siguienteNodo;
        }
    }
    else{
        for(int i = 0; i < -p; i++){
            this->lista = this->lista->anteriorNodo;
        }
    }
}

ListaCircular::~ListaCircular(){
    // Pasamos de lista circular a lista doblemente enlazada
    this->lista->anteriorNodo->siguienteNodo = nullptr;
    while (this->n > 0) {
        this->eliminar(0);
    }
    this->lista = nullptr;
    this->n = 0;
}