#include "ABB.h"
#include <iostream>

#define assertdomjudge(x) if(!(x)){std::cout<<"ERROR"<<std::endl;exit(0);}

ABB::ABB() {
  this->raiz = nullptr;
  this->n = 0;
}

void ABB::imprimir(){
    if(raiz==NULL){
        std::cout<<"VACIO"<<std::endl;
    }
    else{
        this->imprimirRecorrido(raiz); 
    }   
}

void ABB::imprimirRecorrido(Nodo *raizSubarbol){
    std::cout<<raizSubarbol->contenido<<std::endl;
    if(raizSubarbol->hijoIzquierdo != nullptr){
        std::cout<<"I";
        this->imprimirRecorrido(raizSubarbol->hijoIzquierdo);
        std::cout<<std::endl;
    }
    if(raizSubarbol->hijoDerecho != nullptr){
        std::cout<<"D";
        this->imprimirRecorrido(raizSubarbol->hijoDerecho);
        std::cout<<std::endl;
    }
}

void ABB::leerArbol(){
    raiz = this->leerSubarbol(nullptr);
}

Nodo * ABB::leerSubarbol(Nodo *padre){
    int contenido;
    std::cin>>contenido;
    if(contenido>=0){
        Nodo *arbol=new Nodo;
        arbol->contenido = contenido;
        arbol->hijoIzquierdo = this->leerSubarbol(arbol);
        arbol->hijoDerecho = this->leerSubarbol(arbol);
        arbol->padre=padre;
        return arbol;
    }
    else{
      return nullptr;
    }
}

void ABB::insertar (int nuevoElemento) {
    assertdomjudge(this->buscar(nuevoElemento) == nullptr);
    Nodo* nuevoNodo = new Nodo(nuevoElemento, nullptr);
    if (this->raiz == nullptr) {
        this->raiz = nuevoNodo;
    }
    else {
        Nodo* nodoPadre = this->buscarHueco(raiz, nuevoElemento);
        nuevoNodo->padre = nodoPadre;
        if (nuevoElemento < nodoPadre->contenido) {
            nodoPadre->hijoIzquierdo = nuevoNodo;
        }
        else {
            nodoPadre->hijoDerecho = nuevoNodo;
        }
    }
    this->n++;
}

Nodo* ABB::buscarHueco(Nodo *raizSubarbol, int elementoAInsertar) {
    if (elementoAInsertar < raizSubarbol->contenido) {
        if (raizSubarbol->hijoIzquierdo == nullptr) {
            return raizSubarbol;
        }
        else {
            return this->buscarHueco(raizSubarbol->hijoIzquierdo, elementoAInsertar);
        }
    }
    else {
        if (raizSubarbol->hijoDerecho == nullptr) {
            return raizSubarbol;
        }
        else {
            return this->buscarHueco(raizSubarbol->hijoDerecho, elementoAInsertar);
        }
    }
}

Nodo *ABB::buscarMaximo (Nodo *raizSubarbol){
    if (raizSubarbol->hijoDerecho != nullptr) {
        return this->buscarMaximo(raizSubarbol->hijoDerecho);
    }
    else {
        return raizSubarbol;
    }
}

Nodo *ABB::buscarMinimo (Nodo *raizSubarbol){
    if (raizSubarbol->hijoIzquierdo != nullptr) {
        return this->buscarMinimo(raizSubarbol->hijoIzquierdo);
    }
    else {
        return raizSubarbol;
    }
}

int ABB::alturaNodo(Nodo *raizSubarbol) {
    if (raizSubarbol == nullptr) {
        return -1;
    }

    int alturaIzquierda = alturaNodo(raizSubarbol->hijoIzquierdo);
    int alturaDerecha = alturaNodo(raizSubarbol->hijoDerecho);
  
    if (alturaIzquierda > alturaDerecha) {
        return 1 + alturaIzquierda;
    }
    else {
        return 1 + alturaDerecha;
    }
}

void ABB::eliminarNodo (Nodo *nodoParaEliminar) {
    Nodo* nodoReemplazo = nullptr;

    if (nodoParaEliminar->hijoIzquierdo == nullptr && nodoParaEliminar ->hijoDerecho == nullptr) {
        Nodo* nodoPadre = nodoParaEliminar->padre;
        if (nodoParaEliminar == this->raiz) {
            this->raiz = nullptr;
        }
        else if (nodoPadre->hijoIzquierdo == nodoParaEliminar){
            nodoPadre->hijoIzquierdo = nullptr;
        }
        else if (nodoPadre->hijoDerecho == nodoParaEliminar) {
            nodoPadre->hijoDerecho = nullptr;
        }
        delete nodoParaEliminar;
        return;
    }

    else if (nodoParaEliminar->hijoIzquierdo != nullptr && nodoParaEliminar->hijoDerecho == nullptr) {
        nodoReemplazo = this->buscarMaximo(nodoParaEliminar->hijoIzquierdo);
    }

    else if (nodoParaEliminar->hijoIzquierdo == nullptr && nodoParaEliminar->hijoDerecho != nullptr) {
        nodoReemplazo = this->buscarMinimo(nodoParaEliminar->hijoDerecho);
    }

    else {
        int alturaIzquierda = this->alturaNodo(nodoParaEliminar->hijoIzquierdo);
        int alturaDerecha = this->alturaNodo(nodoParaEliminar->hijoDerecho);
        if (alturaIzquierda >= alturaDerecha) {
            nodoReemplazo = this->buscarMaximo(nodoParaEliminar->hijoIzquierdo);
        } else {
            nodoReemplazo = this->buscarMinimo(nodoParaEliminar->hijoDerecho);
        }
    }
    nodoParaEliminar->contenido = nodoReemplazo->contenido;
    this->eliminarNodo(nodoReemplazo);
}

Nodo *ABB::buscar(int elementoABuscar) {
    Nodo* nodoABuscar = this->buscarRecursivo(this->raiz, elementoABuscar);
    return nodoABuscar;
}

Nodo *ABB::buscarRecursivo (Nodo *raizSubarbol, int elementoABuscar) {
    if (raizSubarbol == nullptr) {
        return nullptr;
    }
    if (raizSubarbol->contenido == elementoABuscar) {
        return raizSubarbol;
    }
    else if (elementoABuscar > raizSubarbol->contenido) {
        return this->buscarRecursivo(raizSubarbol->hijoDerecho, elementoABuscar);
    }
    else {
        return this->buscarRecursivo(raizSubarbol->hijoIzquierdo, elementoABuscar);
    }
}

void ABB::eliminar(int elementoAEliminar) {
    Nodo* nodoAEliminar = this->buscar(elementoAEliminar);
    assertdomjudge(nodoAEliminar != nullptr);
    this->eliminarNodo(nodoAEliminar);
    this->n--;  
}

bool ABB::esABB() {
    return this->esSubABB(this->raiz);
}

bool ABB::esSubABB(Nodo *raizSubarbol) {
    if (raizSubarbol == nullptr) {
        return true;
    }

    if (raizSubarbol->hijoIzquierdo != nullptr && raizSubarbol->contenido < this->buscarMaximo(raizSubarbol->hijoIzquierdo)->contenido) {
        return false;
    }

    if (raizSubarbol->hijoDerecho != nullptr && raizSubarbol->contenido > this->buscarMinimo(raizSubarbol->hijoDerecho)->contenido) {
        return false;
    }

    return this->esSubABB(raizSubarbol->hijoIzquierdo) && this->esSubABB(raizSubarbol->hijoDerecho);
}

bool ABB::esAVL() {
    return this->esABB() && this->esSubAVL(this->raiz);
}

bool ABB::esSubAVL(Nodo *raizSubarbol) {

    if (raizSubarbol == nullptr) {
        return true;
    }

    int alturaIzq = this->alturaNodo(raizSubarbol->hijoIzquierdo);
    int alturaDer = this->alturaNodo(raizSubarbol->hijoDerecho);

    return abs(alturaIzq-alturaDer) <= 1 && this->esSubAVL(raizSubarbol->hijoIzquierdo) && this->esSubAVL(raizSubarbol->hijoDerecho);
}

void ABB::eliminarSubarbol (Nodo *raizSubarbol) {
    if (raizSubarbol != nullptr) {
        this->eliminarSubarbol(raizSubarbol->hijoIzquierdo);
        this->eliminarSubarbol(raizSubarbol->hijoDerecho);
        delete raizSubarbol;
    }
}

ABB::~ABB(){
    this->eliminarSubarbol(this->raiz);
}