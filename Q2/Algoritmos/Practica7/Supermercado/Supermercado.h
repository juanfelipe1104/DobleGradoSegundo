#include "Cola.h"

class Supermercado{
  private:
    Cola *cajas;
    int n_cajas;
  public:
    /*
    	Constructor de la clase Supermercado. Inicializa los atributos.
      Parámetro: numero de cajas.
      Precondición: Ninguna.
      Complejidad Temporal: O(1)
      Complejidad Espacial: O(n)
    */
    Supermercado(int n);
    
    /*
      Encola a un usuario con un id en una caja.
      Parámetro: numero de la caja, id del usuario.
      Precondición: n < n_cajas.
      Complejidad Temporal: O(1)
      Complejidad Espacial: O(1)
    */
    void nuevoUsuario(int n,int id);

    /*
      Desencola a todos los usuarios de una caja y los reparte en las demas cajas disponibles.
      Parámetro: numero de la caja.
      Precondición: n < n_cajas.
      Complejidad Temporal: O(n)
      Complejidad Espacial: O(1)
    */
    void cerrarCaja(int n);

    /*
      Desencola al primer usuario en una caja. Devuelve el id de ese usuario
      Parámetro: numero de la caja.
      Precondición: n < n_cajas.
      Complejidad Temporal: O(1)
      Complejidad Espacial: O(1)
    */
    int atenderUsuario(int n);

    /*
      Comprueba si la caja esta vacia. Devuelve un booleano
      Parámetro: numero de la caja.
      Precondición: n < n_cajas.
      Complejidad Temporal: O(1)
      Complejidad Espacial: O(1)
    */
    bool cajaVacia(int n);
};
