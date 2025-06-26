class ListaContigua{
    private:
        int n;
        int capacidad;
        int incremento;
        int *vector;
    public:
        /*
        	Constructor de la clase ListaContigua. Inicializa los atributos.
        	Parámetro: Incremento.
        	Precondición: Ninguna.
        	Complejidad Temporal: O(1)
        	Complejidad Espacial: O(1)
    	*/
        ListaContigua(int incremento);
        
        /*
        	Cambia el valor de un elemento en una posicion de una lista contigua.
        	Parámetro: posicion, nuevoValor.
        	Precondición: 0 <= posicion < n.
        	Complejidad Temporal: O(1)
        	Complejidad Espacial: O(1)
    	*/
        void setValor(int pos, int val);

        /*
        	Devuelve el valor de un elemento en una posicion de una lista contigua.
        	Parámetro: posicion.
        	Precondición: 0 <= posicion < n.
        	Complejidad Temporal: O(1)
        	Complejidad Espacial: O(1)
    	*/
        int getValor(int pos);

        /*
        	Devuelve el numero de elementos de una lista contigua.
        	Parámetro: Ninguno.
        	Precondición: Ninguna.
        	Complejidad Temporal: O(1)
        	Complejidad Espacial: O(1)
    	*/
        int getN();

        /*
        	Devuelve el tamaño de una lista contigua.
        	Parámetro: Ninguno.
        	Precondición: Ninguna.
        	Complejidad Temporal: O(1)
        	Complejidad Espacial: O(1)
    	*/
        int getCapacidad();

        /*
        	Inserta un nuevo elemento en una posicion de la lista contigua desplazando hacia la derecha el resto de elementos con memmove. 
        	Parámetro: posicion, nuevoValor.
        	Precondición: 0 <= posicion <= n.
        	Complejidad Temporal: O(memmove) = O(n)
        	Complejidad Espacial: O(capacidad+incremento)
    	*/
        void insertar(int pos, int val);

        /*
        	Elimina un elemento existente de una lista contigua. Desplaza los elementos que estaban a su izquierda hacia la derecha una posicion
        	Parámetro: posicion.
        	Precondición: 0 <= posicion < n.
        	Complejidad Temporal: O(memmove) = O(n)
        	Complejidad Espacial: O(capacidad-incremento)
    	*/
        void eliminar(int pos);

        /*
        	Concatena al final de la lista contigua la que le pasan por parametros.
        	Parámetro: ListaAConcatenar.
        	Precondición: Ninguna.
        	Complejidad Temporal: O(m) siendo m el numero de elementos de la lista pasada por parametros
        	Complejidad Espacial: O(m) siendo m el tamaño de la lista pasada por parametros
    	*/
        void concatenar(ListaContigua *lista);

        /*
        	Busca el valor de un elemento en una lista contigua. Devuelve la posición en la que se encuentra, -1 si no ha sido encontrado
        	Parámetro: elementoABuscar.
        	Precondición: Ninguna.
        	Complejidad Temporal: O(n)
        	Complejidad Espacial: O(1)
    	*/
        int buscar(int num);

        /*
        	Destructor de la clase ListaContigua. Libera la memoria utilizada.
        	Parámetro: Ninguno.
        	Precondición: Ninguna.
        	Complejidad Temporal: O(1)
        	Complejidad Espacial: O(1)
    	*/
        ~ListaContigua();
};