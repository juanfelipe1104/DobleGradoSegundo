#include "ColaPrioridad.h"

ColaPrioridad::ColaPrioridad(){
    this->vector;
}

void ColaPrioridad::reestructurar(){
    ListaContigua monticuloTemporal;
    for(int i = 0; i < this->n; i++){
        monticuloTemporal.insertar(i, this->vector.getValor(i));
    }
    for(int i = 0; i < this->n; i++){
        int indiceMenor = 0;
        for(int j = 0; j < monticuloTemporal.getN(); j++){
            if(monticuloTemporal.getValor(j) < monticuloTemporal.getValor(indiceMenor)){
                indiceMenor = j;
            }
        }
        this->vector.setValor(i, monticuloTemporal.getValor(indiceMenor));
        monticuloTemporal.eliminar(indiceMenor);
    }
}

void ColaPrioridad::encolar(int num){
    this->vector.insertar(this->n, num);
    this->n++;
    this->reestructurar();
}

int ColaPrioridad::desencolar(){
    int valor = this->vector.getValor(0);
    this->vector.eliminar(0);
    this->n--;
    return valor;
}

bool ColaPrioridad::estaVacia(){
    if(this->n <= 0){
        return true;
    }
    else{
        return false;
    }
}