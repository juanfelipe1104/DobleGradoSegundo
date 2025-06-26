#include <iostream>
#include "ListaCircular.h"

int quienCuenta(ListaCircular &listaCircular, int saltos);

int main(){
    int numNinos = 0, saltos = 0;
    do{
        std::cin >> numNinos;
        std::cin >> saltos;
        if(numNinos > 0 && saltos > 0){
            ListaCircular listaCircular;
            for(int i = 0; i < numNinos; i++){
                listaCircular.insertar(i+1, i);
            }
            std::cout << quienCuenta(listaCircular, saltos) << std::endl;
        }
    }while(numNinos > 0 && saltos > 0);
    return 0;
}

int quienCuenta(ListaCircular &listaCircular, int saltos){
    while(listaCircular.getN() > 1){
        listaCircular.girar(saltos);
        listaCircular.eliminar(0);
    }
    return listaCircular.getValor(0);
}