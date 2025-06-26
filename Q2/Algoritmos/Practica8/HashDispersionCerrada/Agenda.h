#include <iostream>

class Agenda{
    private:
        int capacidad;
        int n;
        std::string *nombres;
        long *telefonos;
        bool *vacias;
        bool *borradas;
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
    	    Busca el contacto en la tabla hash. Devuelve -1 si no lo encuentra
            Parámetro: telefono.
            Precondición: Ninguna.
            Complejidad Temporal: O(capacidad)
            Complejidad Espacial: O(1)
        */
        int buscarContacto(long telefono);
        
        /*
    	    Busca un espacio libre en la tabla hash
            Parámetro: telefono.
            Precondición: Ninguna.
            Complejidad Temporal: O(capacidad)
            Complejidad Espacial: O(1)
        */
        int buscarHueco(long telefono);
        
        /*
    	    Comprueba si la tabla hash está llena
            Parámetro: telefono.
            Precondición: Ninguna.
            Complejidad Temporal: O(1)
            Complejidad Espacial: O(1)
        */
        bool isLlena();
        
        /*
    	    Comprueba si existe el contacto
            Parámetro: telefono.
            Precondición: Ninguna.
            Complejidad Temporal: O(capacidad)
            Complejidad Espacial: O(1)
        */
        bool existeContacto(long telefono);
        
        /*
    	    Devuelve el nombre del contacto en función del teléfono en la tabla hash.
            Parámetro: telefono.
            Precondición: El contacto asociado al telefono debe existir.
            Complejidad Temporal: O(capacidad)
            Complejidad Espacial: O(1)
        */
        std::string getContacto(long telefono);
        
        /*
    	    Introduce un nuevo contacto a la tabla hash.
            Parámetro: telefono.
            Precondición: El contacto no debe existir y la tabla hash no puede estar llena.
            Complejidad Temporal: O(capacidad)
            Complejidad Espacial: O(1)
        */
        void introducirContacto(long telefono, std::string contacto);
        
        /*
    	    Elimina el contacto asociado al telefono de la tabla hash
            Parámetro: telefono.
            Precondición: El contacto debe existir.
            Complejidad Temporal: O(capacidad)
            Complejidad Espacial: O(1)
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