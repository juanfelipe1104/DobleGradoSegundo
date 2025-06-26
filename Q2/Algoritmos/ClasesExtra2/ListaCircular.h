#include "Nodo.h"
#include <iostream>

class ListaCircular{
	private:
		Nodo *lista;
		int n;
		Nodo *getNodo (int posicion);
	public:
		ListaCircular();
		void insertar (int posicion, std::string nuevoValor);
		void eliminar (int posicion);
		void girar (int p);
		void mostrarLista();
};







