#include "Supermercado.h"

Supermercado::Supermercado(int n){
    this->n_cajas = n;
    this->cajas = new Cola[this->n_cajas];
}

void Supermercado::nuevoUsuario(int n, int id){
    this->cajas[n].encolar(id);
}

void Supermercado::cerrarCaja(int n){
    while(!this->cajas[n].estaVacia()){
        for(int i = 0; i < this->n_cajas; i++){
            if(!this->cajas[i].estaVacia() && i != n){
                this->cajas[i].encolar(this->cajas[n].desencolar());
            }
        }
    }
}

int Supermercado::atenderUsuario(int n){
    return this->cajas[n].desencolar();
}

bool Supermercado::cajaVacia(int n){
    return this->cajas[n].estaVacia();
}