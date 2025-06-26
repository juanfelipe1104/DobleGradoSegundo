#include "ListaCircular.h"

ListaCircular::ListaCircular(){
    this->lista = nullptr;
    this->n = 0;
}

Nodo * ListaCircular::getNodo(int posicion){
    Nodo *current = this->lista;
    for(int i = 0; i < posicion; i++){
        current = current->siguienteNodo;
    }
    return current;
}

int ListaCircular::getValor(int posicion){
    return this->getNodo(posicion)->elemento;
}

int ListaCircular::getN(){
    return this->n;
}

void ListaCircular::insertar(int nuevoElemento, int posicion){
    Nodo *nodoAInsertar = new Nodo{nuevoElemento, nullptr, nullptr};
    if(this->n == 0){
        this->lista = nodoAInsertar;
        this->lista->anteriorNodo = this->lista;
        this->lista->siguienteNodo = this->lista;
    }
    else if(posicion == 0){
        Nodo *anterior = this->lista->anteriorNodo;
        nodoAInsertar->anteriorNodo = anterior;
        nodoAInsertar->siguienteNodo = this->lista;
        anterior->siguienteNodo = nodoAInsertar;
        this->lista->anteriorNodo = nodoAInsertar;
        this->lista = nodoAInsertar;
    }
    else{
        Nodo *anterior = this->getNodo(posicion-1);
        Nodo *siguiente = anterior->siguienteNodo;
        nodoAInsertar->anteriorNodo = anterior;
        nodoAInsertar->siguienteNodo = siguiente;
        anterior->siguienteNodo = nodoAInsertar;
        siguiente->anteriorNodo = nodoAInsertar;
    }
    this->n++;
}

void ListaCircular::eliminar(int posicion){
    Nodo *nodoAEliminar = nullptr;
    if(this->n == 1){
        nodoAEliminar = this->lista;
        this->lista = nullptr;
    }
    else if(posicion == 0){
        nodoAEliminar = this->lista;
        Nodo* ultimo = this->lista->anteriorNodo;
        this->lista = this->lista->siguienteNodo;
        this->lista->anteriorNodo = ultimo;
        ultimo->siguienteNodo = this->lista;
    }
    else{
        Nodo *anterior = this->getNodo(posicion-1);
        nodoAEliminar = anterior->siguienteNodo;
        Nodo *siguiente = nodoAEliminar->siguienteNodo;
        siguiente->anteriorNodo = anterior;
        anterior->siguienteNodo = siguiente;
    }
    delete nodoAEliminar;
    this->n--;
}

void ListaCircular::girar(int giro){
    if(giro > 0){
        for(int i = 0; i < giro; i++){
            this->lista = this->lista->siguienteNodo;
        }
    }
    else{
        for(int i = 0; i < -giro; i++){
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