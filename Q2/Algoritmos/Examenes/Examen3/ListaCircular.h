#include "Nodo.h"

class ListaCircular{
    private:
        Nodo *lista;
        int n;
        Nodo *getNodo(int posicion);
    public:
        ListaCircular();
        int getValor(int posicion);
        int getN();
        void insertar(int nuevoElemento, int posicion);
        void eliminar(int posicion);
        void girar(int giro);
        ~ListaCircular();
};