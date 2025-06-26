#include "ListaEnlazada.h"

class Agenda{
    private:
        int capacidad;
        int n;
        ListaEnlazada *tabla;
    public:
        /*
    	    Constructor de la clase Agenda. Inicializa los atributos.
            Parámetro: capacidad de la tabla hash.
            Precondición: Ninguna.
            Complejidad Temporal: O(1)
            Complejidad Espacial: O(capacidad)
        */
        Agenda(int capacidad);

        /*
    	    Implementa la función hash, realiza el modulo entre el telefono y la capacidad; devolviendo el indice.
            Parámetro: telefono.
            Precondición: Ninguna.
            Complejidad Temporal: O(1)
            Complejidad Espacial: O(1)
        */
        int obtenerPosicion(long telefono);

        /*
    	    Comprueba si existe el contacto en la tabla hash.
            Parámetro: telefono.
            Precondición: Ninguna.
            Complejidad Temporal: O(1)
            Complejidad Espacial: O(n)
        */
        bool existeContacto(long telefono);

        /*
    	    Busca el contacto en la  tabla hash y devuelve su nombre.
            Parámetro: telefono.
            Precondición: El contacto debe existir.
            Complejidad Temporal: O(1)
            Complejidad Espacial: O(n)
        */
        std::string getContacto(long telefono);

        /*
    	    Introduce un nuevo contacto en la tabla hash.
            Parámetro: telefono, nombre.
            Precondición: El contacto no debe existir.
            Complejidad Temporal: O(1)
            Complejidad Espacial: O(1)
        */
        void introducirContacto(long telefono, std::string nombre);

        /*
    	    Elimina el contacto asociado a un número de telefono en la tabla hash.
            Parámetro: telefono.
            Precondición: El contacto debe existir.
            Complejidad Temporal: O(1)
            Complejidad Espacial: O(n)
        */
        void eliminarContacto(long telefono);
        
        void imprimir();

        /*
    	    Destructor de la clase Agenda. Libera la memoria reservada.
            Parámetro: Ninguno.
            Precondición: Ninguna.
            Complejidad Temporal: O(1)
            Complejidad Espacial: O(1)
        */
        ~Agenda();
};