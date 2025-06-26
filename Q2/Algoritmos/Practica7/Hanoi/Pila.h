#include "Nodo.h"
#include <iostream>

class Pila{
  private:
    Nodo *cima;
    std::string name;
  public:
    /*
    	Constructor de la clase Pila. Inicializa los atributos.
      Parámetro: nombre de la pila.
      Precondición: Ninguna.
      Complejidad Temporal: O(1)
      Complejidad Espacial: O(1)
    */
    Pila(std::string name);
    
    /*
      Devuelve el nombre de la Pila.
      Parámetro: Ninguno.
      Precondición: Ninguna.
      Complejidad Temporal: O(1)
      Complejidad Espacial: O(1)
    */
    std::string nombrePila();
    
    /*
      El nuevo elemento a apilar pasa a ser la cima.
      Parámetro: el número del nuevo nodo a apilar.
      Precondición: Ninguna.
      Complejidad Temporal: O(1)
      Complejidad Espacial: O(1)
    */
    void apilar(int num); 
    
    /*
      Elimina el elemento de la cima y el siguiente pasa a ser la cima.
      Parámetro: Ninguno.
      Precondición: Ninguna.
      Complejidad Temporal: O(1)
      Complejidad Espacial: O(1)
    */
    int desapilar();
    
    /*
      Comprueba si la pila esta vacía. Devuelve un booleano
      Parámetro: Ninguno.
      Precondición: Ninguna.
      Complejidad Temporal: O(1)
      Complejidad Espacial: O(1)
    */
    bool estaVacia();
};

  
