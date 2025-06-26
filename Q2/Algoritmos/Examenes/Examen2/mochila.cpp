#include <iostream>
#include "Objeto.h"

int mochilaVoraz(Objeto *objetos, int pesoMaximo, int numObjetos);
void bubbleSort(Objeto *objetos, int numObjetos);

int main(){
    int pesoMaximo = 0, numObjetos = 0;
    std::cin >> pesoMaximo;
    std::cin >> numObjetos;
    Objeto *objetos = new Objeto[numObjetos];
    for(int i = 0; i < numObjetos; i++){
        int peso = 0, valor = 0;
        std::cin >> peso;
        std::cin >> valor;
        objetos[i] = Objeto(peso, valor);
    }
    std::cout << mochilaVoraz(objetos, pesoMaximo, numObjetos) << std::endl;
}

int mochilaVoraz(Objeto *objetos, int pesoMaximo, int numObjetos){
    int objetosEnMochila = 0, pesoActualMochila = 0;
    bubbleSort(objetos, numObjetos);
    for(int i = 0; i < numObjetos; i++){
        if((pesoActualMochila + objetos[i].peso)  <= pesoMaximo){
            pesoActualMochila += objetos[i].peso;
            objetosEnMochila++;
            std::cout << objetos[i].peso << " " << objetos[i].valor << std::endl;
        }
    }
    return objetosEnMochila;
}

void bubbleSort(Objeto *objetos, int numObjetos){
    for(int i = 1; i < numObjetos; i++){
        for(int j = 0; j < numObjetos-i; j++){
            if(objetos[j].proporcion < objetos[j+1].proporcion){
                Objeto auxiliar = objetos[j];
                objetos[j] = objetos[j+1];
                objetos[j+1] = auxiliar;
            }
        }
    }
}