class Matriz{
    private:
        int numeroFilas;
        int numeroColumnas;
        double **matriz;
    public:
        /*
            Constructor de la clase Matriz. Reserva memoria para el atributo matriz.
            Parámetro: número de filas y número de columnas.
            Precondición: Ninguna.
            Complejidad Temporal: O(numeroFilas)
            Complejidad Espacial: O(numeroFilas*numeroColumnas)
        */
        Matriz(int numeroFilas=0, int numeroColumnas=0);
        
        /*
            Destructor de la clase Matriz. Libera memoria reservada en el objeto.
            Parámetro: Ninguno.
            Precondición: Ninguna.
            Complejidad Temporal: O(numeroFilas)
            Complejidad Espacial: O(1)
        */
        ~Matriz();

        /*
            Realiza la asignación entre dos objetos de la clase Matriz. Crea una nueva matriz con el resultado.
	        Parámetro: La matriz que se va a asignar.
	        Retorno: Una nueva matriz con la matriz pasada como parámetro.
	        Precondicion: Ninguna.
	        Complejidad Temporal: O(n_filas*n_columnas)
	        Complejidad Espacial: O(n_filas*n_columnas)
        */
        Matriz& operator = (Matriz matriz);

        /*
            Realiza la suma entre dos objetos de la clase Matriz. Crea una nueva matriz con el resultado
            Párametro: La matriz a sumar.
            Retorno: Una nueva matriz con la suma de la matriz pasada como parámetro y la matriz objeto.
            Precondición: La matriz pasada como párametro tiene que tener la misma dimensión que la matriz objeto. Ambas no tienen que estar vacías
            Complejidad Temporal: O(numeroFilas*numeroColumnas)
            Complejidad Espacial: O(numeroFilas*numeroColumnas)
        */
        Matriz operator + (Matriz &matriz);

        /*
            Realiza la resta entre dos objetos de la clase Matriz. Crea una nueva matriz con el resultado
            Párametro: La matriz a restar.
            Retorno: Una nueva matriz con la resta de la matriz pasada como parámetro y la matriz objeto.
            Precondición: La matriz pasada como párametro tiene que tener la misma dimensión que la matriz objeto. Ambas no tienen que estar vacías
            Complejidad Temporal: O(numeroFilas*numeroColumnas)
            Complejidad Espacial: O(numeroFilas*numeroColumnas)
        */
        Matriz operator - (Matriz &matriz);

        /*
            Realiza la multiplicacion entre un objeto de la clase Matriz y un escalar. Crea una nueva matriz con el resultado
            Párametro: El escalar a multiplicar.
            Retorno: Una nueva matriz con el producto del escalar pasado como parámetro con la matriz objeto
            Precondición: La matriz no debe estar vacía.
            Complejidad Temporal: O(numeroFilas*numeroColumnas)
            Complejidad Espacial: O(numeroFilas*numeroColumnas)
        */
        Matriz operator * (int k);

        /*
            Realiza la multiplicacion entre dos objetos de la clase Matriz. Crea una nueva matriz con el resultado
            Párametro: La matriz a multiplicar.
            Retorno: Una nueva matriz con el producto de la matriz pasada como parámetro con la matriz objeto
            Precondición: El número de filas de la matriz pasada como parámetro tiene que ser igual. Ambas no tienen que estar vacías.
            Complejidad Temporal: O(numeroFilas1*numeroColumnas2*numeroFilas2)
            Complejidad Espacial: O(numeroFilas*numeroColumnas)
        */
        Matriz operator * (Matriz &matriz);

        /*
            Realiza el calculo de la matriz traspuesta de la matriz objeto. Crea una nueva matriz con el resultado
            Párametro: Ninguno.
            Retorno: Una nueva matriz con la traspuesta de la matriz objeto.
            Precondición: La matriz no debe estar vacía. 
            Complejidad Temporal: O(numeroFilas*numeroColumnas)
            Complejidad Espacial: O(numeroFilas*numeroColumnas)
        */       
        Matriz calcularTraspuesta();

        /*
            Calcula el determinante de una matriz recursivamente.
	        Parámetro: Ninguno.
	        Retorno: Valor del determinante.
	        Precondicion: La matriz debe ser cuadrada.
	        Complejidad Temporal: O(n!) (Aproximado)
	        Complejidad Espacial: O(n!) (Aproximado)
        */
        double calcularDeterminante();

        /*
            Comprueba si la matriz objeto es simetrica. Crea un booleano 
            Párametro: Ninguno.
            Retorno: Un booleano 
            Precondición: La matriz no debe estar vacía. 
            Complejidad Temporal: O(numeroFilas*numeroColumnas)
            Complejidad Espacial: O(1)
        */
        bool esSimetrica();

        /*
            Busca el máximo de la matriz objeto. Crea un double 
            Párametro: Ninguno.
            Retorno: Un double. 
            Precondición: La matriz no debe estar vacía. 
            Complejidad Temporal: O(numeroFilas*numeroColumnas)
            Complejidad Espacial: O(1)
        */
        double obtenerMaximo();

        /*
            Busca el mínimo de la matriz objeto. Crea un double 
            Párametro: Ninguno.
            Retorno: Un double. 
            Precondición: La matriz no debe estar vacía. 
            Complejidad Temporal: O(numeroFilas*numeroColumnas)
            Complejidad Espacial: O(1)
        */
        double obtenerMinimo();

        /* 
            Permite rellenar todos los elementos de la matriz del objeto actual preguntando al usuario 
	        Parámetro: Ninguno
	        Retorno: Ninguno
	        Precondicion: La matriz no debe estar vacía
	        Complejidad Temporal: O(n_filas*n_columnas)
	        Complejidad Espacial: O(1)
        */
        void rellenarManual();

        /* 
            Permite rellenar todos los elementos de la matriz del objeto actual de forma aleatoria 
	        Parámetro: semilla que se utiliza para el generador aleatorio
	        Retorno: Ninguno
	        Precondicion: La matriz no debe estar vacía
	        Complejidad Temporal: O(n_filas*n_columnas)
	        Complejidad Espacial: O(1)
        */
        void rellenarAleatorio(long seed);

        /* 
            Imprime por pantalla todos los elementos de la matriz del objeto actual  
	        Parámetro: Ninguno
	        Retorno: Ninguno
	        Precondicion: La matriz no debe estar vacía
	        Complejidad Temporal: O(n_filas*n_columnas)
	        Complejidad Espacial: O(1)
        */
        void mostrarMatriz();
};