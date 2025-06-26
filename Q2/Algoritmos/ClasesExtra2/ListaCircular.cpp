#include "ListaCircular.h"
#include <iostream>

#define assertdomjudge(x) if(!(x)){std::cout<<"ERROR"<<std::endl;exit(0);}

void ListaCircular::mostrarLista(){
    Nodo* current = lista;
    for (int i = 0; i < n; i++) {
        std::cout << "- " << current->elemento;
        if (current == lista){
            std::cout << " (actual)";
        }
        std::cout << std::endl;
        current = current->siguienteNodo;
    }
}