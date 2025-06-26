#include "Nodo.h"

class ListaEnlazada{
	private:
		Nodo *lista;
		int n;

		/*
        	Busca un nodo en una posicion de una lista enlazada.
        	Parámetro: posicion.
        	Precondición: 0 <= posicion < n.
        	Complejidad Temporal: O(posicion)
        	Complejidad Espacial: O(1)
    	*/
		Nodo * getNodo (int posicion);
	public:
		/*
        	Constructor de la clase ListaEnlazada. Inicializa los atributos.
        	Parámetro: Ninguno.
        	Precondición: Ninguna.
        	Complejidad Temporal: O(1)
        	Complejidad Espacial: O(1)
    	*/
		ListaEnlazada();

		/*
        	Devuelve el valor de un nodo en una posicion de una lista enlazada.
        	Parámetro: posicion.
        	Precondición: 0 <= posicion < n.
        	Complejidad Temporal: O(posicion)
        	Complejidad Espacial: O(1)
    	*/
		int getValor(int posicion);

		/*
        	Cambia el valor de un nodo en una posicion de una lista enlazada.
        	Parámetro: posicion, nuevoValor.
        	Precondición: 0 <= posicion < n.
        	Complejidad Temporal: O(posicion)
        	Complejidad Espacial: O(1)
    	*/
		void setValor(int posicion, int nuevoValor);

		/*
        	Devuelve el numero de nodos de una lista enlazada.
        	Parámetro: Ninguno.
        	Precondición: Ninguna.
        	Complejidad Temporal: O(1)
        	Complejidad Espacial: O(1)
    	*/
		int getN(); 

		/*
        	Inserta un nuevo nodo en una posicion de la lista enlazada. 
        	Parámetro: posicion, nuevoValor.
        	Precondición: 0 <= posicion <= n.
        	Complejidad Temporal: O(n)
        	Complejidad Espacial: O(1)
    	*/
		void insertar (int posicion, int nuevoValor);

		/*
        	Elimina un nodo existente de una lista enlazada
        	Parámetro: posicion.
        	Precondición: 0 <= posicion < n.
        	Complejidad Temporal: O(posicion)
        	Complejidad Espacial: O(1)
    	*/
		void eliminar (int posicion);

		/*
        	Concatena al final de la lista enlazada la que le pasan por parametros.
        	Parámetro: ListaAConcatenar.
        	Precondición: Ninguna.
        	Complejidad Temporal: O(n) 
        	Complejidad Espacial: O(1)
    	*/
		void concatenar(ListaEnlazada *listaAConcatenar);

		/*
        	Busca el valor de un nodo en una lista enlazada. Devuelve la posición en la que se encuentra, -1 si no ha sido encontrado
        	Parámetro: elementoABuscar.
        	Precondición: Ninguna.
        	Complejidad Temporal: O(n)
        	Complejidad Espacial: O(1)
    	*/
		int buscar(int elementoABuscar);

		/*
        	Destructor de la clase ListaEnlazada. Libera la memoria utilizada.
        	Parámetro: Ninguno.
        	Precondición: Ninguna.
        	Complejidad Temporal: O(n)
        	Complejidad Espacial: O(1)
    	*/
		~ListaEnlazada();
};







