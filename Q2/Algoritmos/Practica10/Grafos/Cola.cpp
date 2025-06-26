#include "Cola.h"

Cola::Cola(){
    this->final = nullptr;
    this->principio = nullptr;
}

void Cola::encolar(int num){
    Nodo* nodoAEncolar = new Nodo(num, nullptr);
    if(this->principio == nullptr){
        this->principio = nodoAEncolar;
        this->final = nodoAEncolar;
    }
    else{
        this->final->siguiente = nodoAEncolar;
        this->final = nodoAEncolar;
    }
}

int Cola::desencolar(){
    Nodo* nodoADesencolar = this->principio;
    int num = this->principio->elemento;
    this->principio = this->principio->siguiente;
    delete nodoADesencolar;
    return num;
}

bool Cola::estaVacia(){
    bool estaVacia = true;
    if(this->principio != nullptr){
        estaVacia = false;
    }
    return estaVacia;
}