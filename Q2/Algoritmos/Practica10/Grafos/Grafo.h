#ifndef GRAFO_H
#define GRAFO_H

#include "ListaEnlazada.h"
#include "Cola.h"

class Grafo {
    private:
        ListaEnlazada *grafo;
        int *color;
        bool *visitado;
        int V; //Número de vertices
    public:
        /*
    	    Constructor de la clase Grafo. Inicializa los atributos.
            Parámetro: Número de vertices.
            Precondición: Ninguna.
            Complejidad Temporal: O(n) (Inicializar a -1 el color)
            Complejidad Espacial: O(n)
        */
        Grafo(int numVertices);

        /*
    	    Agrega las aristas a cada vertice.
            Parámetro: vertice1, vertice2. (Extremos de cada arista)
            Precondición: u != v. (No hay bucles en el grafo)
            Complejidad Temporal: O(1)
            Complejidad Espacial: O(1)
        */
        void agregarArista(int u, int v);

        /*
    	    Implementa el algoritmo BFS para saber si el grafo es coloreable o no
            Parámetro: Ninguno.
            Precondición: Ninguna.
            Complejidad Temporal: O(n*m) siendo n en el número de vertices y m la capacidad de la Cola auxiliar
            Complejidad Espacial: O(1)
        */
        bool esRojiBlanco();
};

#endif
