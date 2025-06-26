#include "Grafo.h"
#include <iostream>
#define assertdomjudge(x) if(!(x)){std::cout<<"ERROR"<<std::endl;exit(0);}

Grafo::Grafo(int numVertices) {
    this->V = numVertices;
    this->grafo = new ListaEnlazada[this->V];
    this->visitado = new bool[this->V];
    this->color = new int[this->V];
    for (int i = 0; i < this->V; ++i) {
        this->visitado[i] = false;
        this->color[i] = -1;
    }
}

void Grafo::agregarArista(int u, int v) {
    assertdomjudge(u != v);
    this->grafo[u].insertar(0, v);
    this->grafo[v].insertar(0, u);
}

bool Grafo::esRojiBlanco() {
    for (int i = 0; i < this->V; i++){
        this->visitado[i] = false;
    }
    for (int inicio = 0; inicio < this->V; inicio++) {
        if (!this->visitado[inicio]) {
            Cola cola;
            cola.encolar(inicio);
            this->color[inicio] = 0;
            this->visitado[inicio] = true;
            while (!cola.estaVacia()) {
                int actual = cola.desencolar();
                for (int i = 0; i < this->grafo[actual].getN(); i++) {
                    int vecino = this->grafo[actual].getValor(i);
                    if (!this->visitado[vecino]) {
                        this->color[vecino] = 1 - this->color[actual];
                        this->visitado[vecino] = true;
                        cola.encolar(vecino);
                    }
                    else if (this->color[vecino] == this->color[actual]) {
                        return false;
                    }
                }
            }
        }
    }
    return true;
}