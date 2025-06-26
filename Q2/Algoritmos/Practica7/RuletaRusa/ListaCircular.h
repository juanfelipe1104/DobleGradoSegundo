#include "Nodo.h"
#include <iostream>

class ListaCircular{
	private:
		Nodo *lista;
		int n;
		Nodo *getNodo (int posicion);

	public:
		/*
    		Constructor de la clase ListaCircular. Inicializa los atributos.
      		Parámetro: Ninguno.
      		Precondición: Ninguna.
      		Complejidad Temporal: O(1)
      		Complejidad Espacial: O(1)
    	*/
		ListaCircular();

		/*
        	Devuelve el valor de un nodo en una posicion de una lista circular.
        	Parámetro: posicion.
        	Precondición: 0 <= posicion < n.
        	Complejidad Temporal: O(posicion)
        	Complejidad Espacial: O(1)
    	*/
		std::string getValor(int posicion);

		/*
        	Cambia el valor de un nodo en una posicion de una lista circular.
        	Parámetro: posicion, nuevoValor.
        	Precondición: 0 <= posicion < n.
        	Complejidad Temporal: O(posicion)
        	Complejidad Espacial: O(1)
    	*/
		void setValor(int posicion, std::string nuevoValor);

		/*
        	Devuelve el numero de nodos de una lista circular.
        	Parámetro: Ninguno.
        	Precondición: Ninguna.
        	Complejidad Temporal: O(1)
        	Complejidad Espacial: O(1)
    	*/
		int getN(); 

		/*
        	Inserta un nuevo nodo en una posicion de la lista circular. 
        	Parámetro: posicion, nuevoValor.
        	Precondición: 0 <= posicion <= n.
        	Complejidad Temporal: O(n)
        	Complejidad Espacial: O(1)
    	*/
		void insertar (int posicion, std::string nuevoValor);

		/*
        	Elimina un nodo existente de una lista circular
        	Parámetro: posicion.
        	Precondición: 0 <= posicion < n.
        	Complejidad Temporal: O(posicion)
        	Complejidad Espacial: O(1)
    	*/
		void eliminar (int posicion);

		/*
        	Gira la lista circular hacia la izquierda si p es negativo y hacia la derecha si p es positivo
        	Parámetro: posicion.
        	Precondición: Ninguna.
        	Complejidad Temporal: O(posicion)
        	Complejidad Espacial: O(1)
    	*/
		void girar (int p);

		/*
        	Destructor de la clase ListaCircular. Libera la memoria utilizada.
        	Parámetro: Ninguno.
        	Precondición: Ninguna.
        	Complejidad Temporal: O(n)
        	Complejidad Espacial: O(1)
    	*/
		~ListaCircular();
};







