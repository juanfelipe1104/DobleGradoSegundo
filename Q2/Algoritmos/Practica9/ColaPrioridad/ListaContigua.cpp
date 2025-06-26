#include "ListaContigua.h"
#include <iostream>
#include <cstring>
#define assertdomjudge(x) if(!(x)){std::cout<<"ERROR"<<std::endl;exit(0);}

ListaContigua::ListaContigua(){
    this->n = 0;
    this->capacidad = 0;
    this->incremento = 2;
    this->vector = nullptr;
}

void ListaContigua::setValor(int pos, int val){
    assertdomjudge((pos < n) && (pos >= 0));
    this->vector[pos] = val;
}

int ListaContigua::getValor(int pos){
    assertdomjudge((pos < n) && (pos >= 0));
    return this->vector[pos];
}

int ListaContigua::getN(){
    return this->n;
}

int ListaContigua::getCapacidad(){
    return this->capacidad;
}

void ListaContigua::insertar(int pos, int val){
    assertdomjudge(pos >= 0 && pos <= this->n );
    this->n++;
    if(this->n > this->capacidad){
        this->capacidad += this->incremento;
        this->vector = (int*)realloc(this->vector, (this->capacidad)*sizeof(int));
    }
    std::memmove(this->vector+pos+1, this->vector+pos, (this->n-pos-1)*sizeof(int));
    this->vector[pos] = val;
}

void ListaContigua::eliminar(int pos){
    assertdomjudge((pos < this->n) && (pos >= 0));
    this->n--;
    std::memmove(this->vector+pos, this->vector+pos+1, (this->n-pos)*sizeof(int));
    if(this->n <= (this->capacidad-2*this->incremento)){
        this->capacidad -= this->incremento;
        this->vector = (int*)realloc(this->vector, (this->capacidad)*sizeof(int));
    }
}

void ListaContigua::concatenar(ListaContigua *lista){
    this->capacidad += lista->capacidad;
    this->vector = (int*)realloc(this->vector, (this->capacidad)*sizeof(int));
    for(int i = 0; i < lista->n; i++){
        this->vector[this->n + i] = lista->vector[i];
    }
    this->n += lista->n;
}

int ListaContigua::buscar(int val){
    int posicion = -1;
    bool encontrado = false;
    for(int i = 0; i < this->n && !encontrado; i++){
        if(this->vector[i] == val){
           posicion = i; 
        }
    }
    return posicion;
}

ListaContigua::~ListaContigua(){
    delete [] this->vector;
}