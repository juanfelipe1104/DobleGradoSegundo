#include "Polinomio.h"
#include <cmath>

Polinomio::Polinomio(int n, float *coeficientes){
    this->n = n;
    this->coeficientes = new float[this->n+1];
    for(int i = 0; i <= this->n; i++){
        this->coeficientes[i] = coeficientes[i];
    }
}

float Polinomio::obtenerAleatorioNormalEstandar(){
    float suma = 0;
    for(int i = 0; i < 12; i++){
        suma += (rand()/(float)RAND_MAX);
    }
    suma -= 6;
    return suma;
}

float Polinomio::obtenerRaizRecursivo(SolucionParcial padre){
    std::cout << "Seleccionada" << std::endl;
    padre.imprimir();
    std::cout << "Mutaciones" << std::endl;
    SolucionParcial hijo = padre;
    for(int i = 0; i < 10; i++){
        float mutacion = this->obtenerAleatorioNormalEstandar();
        float xHijo = padre.x + mutacion;
        float yHijo = this->evaluar(xHijo);
        SolucionParcial hijoAuxiliar(xHijo, yHijo);
        hijoAuxiliar.imprimir();
        if(std::abs(hijoAuxiliar.y) < std::abs(hijo.y)){
            hijo = hijoAuxiliar;
        }
    }
    if(std::abs(hijo.y) < std::abs(padre.y)){
        return this->obtenerRaizRecursivo(hijo);
    }
    return padre.x;
}

float Polinomio::evaluar(float x){
    float evaluacion = 0;
    for(int i = 0; i <= this->n; i++){
        evaluacion += this->coeficientes[i] * (pow(x,i));
    }
    return evaluacion;
}

float Polinomio::obtenerRaiz(){
    return this->obtenerRaizRecursivo(SolucionParcial(0, this->evaluar(0)));
}

Polinomio::~Polinomio(){
    this->n = 0;
    delete [] this->coeficientes; 
}