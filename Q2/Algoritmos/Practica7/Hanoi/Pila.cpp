#include "Pila.h"
#include <iostream>

Pila::Pila(std::string name){
  this->cima = nullptr;
  this->name = name;
}

std::string Pila::nombrePila(){
  return this->name;
}

void Pila::apilar(int num){
  Nodo *nodoAApilar = new Nodo(num);
  nodoAApilar->siguiente = this->cima;
  this->cima = nodoAApilar;
  std::cout << "Apilando disco " << num << " en poste " << this->name << std::endl;
}
  
int Pila::desapilar(){
  int num = 0;
  Nodo *nodoADesapilar = this->cima;
  this->cima = this->cima->siguiente;
  num = nodoADesapilar->valor;   
  std::cout<<"Desapilando disco " << num << " del poste " << this->name << std::endl;
  delete nodoADesapilar;
  return num;
}

bool Pila::estaVacia(){
  bool estaVacia = true;
  if(this->cima != nullptr){
    estaVacia = false; 
  }
  return estaVacia;
}


