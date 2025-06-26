#include "Nodo.h" 
 
class Cola{
  private:
    Nodo* principio;
    Nodo* final;
  public:
    /*
    	Constructor de la clase Cola. Inicializa los atributos.
      Parámetro: Ninguno.
      Precondición: Ninguna.
      Complejidad Temporal: O(1)
      Complejidad Espacial: O(1)
    */
    Cola();

    /*
      El nuevo elemento a encolar pasa a ser el final.
      Parámetro: el número del nuevo nodo a apilar.
      Precondición: Ninguna.
      Complejidad Temporal: O(1)
      Complejidad Espacial: O(1)
    */
    void encolar(int num);

    /*
      Elimina el primer elemento y el siguiente pasa a ser el primero.
      Parámetro: Ninguno.
      Precondición: Ninguna.
      Complejidad Temporal: O(1)
      Complejidad Espacial: O(1)
    */
    int desencolar();

    /*
      Comprueba si la cola esta vacía. Devuelve un booleano
      Parámetro: Ninguno.
      Precondición: Ninguna.
      Complejidad Temporal: O(1)
      Complejidad Espacial: O(1)
    */
    bool estaVacia();  
};

  
