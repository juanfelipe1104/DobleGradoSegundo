#include "SolucionParcial.h"

class Polinomio{
    private:
        int n;
        float *coeficientes;

        /*
    	    Devuelve un valor aleatorio de una normal estandar
            Parámetro: Ninguno.
            Precondición: Ninguna.
            Complejidad Temporal: O(n)
            Complejidad Espacial: O(1)
        */
        float obtenerAleatorioNormalEstandar();

        /*
    	    Implementa un algoritmo genetico para el calculo de la mejor solución de un polinomio.
            Parámetro: Solucion inicial.
            Precondición: Ninguna.
            Complejidad Temporal: ???
            Complejidad Espacial: ???
        */
        float obtenerRaizRecursivo(SolucionParcial solucionParcialInicial);
    public:
        /*
    	    Constructor de la clase Polinomio. Inicializa los atributos.
            Parámetro: Grado del polinomio, Coeficientes del polinomio.
            Precondición: Ninguna.
            Complejidad Temporal: O(n)
            Complejidad Espacial: O(n)
        */
        Polinomio(int n, float *coeficientes);

        /*
    	    Calcula el valor de la x pasada por parametro en el polinomio. Devuelve ese valor
            Parámetro: x a calcular.
            Precondición: Ninguna.
            Complejidad Temporal: O(n)
            Complejidad Espacial: O(1)
        */
        float evaluar(float x);

        /*
    	    Usa el metodo obtenerRaizRecursiva() partiendo como solución inicial x=0, p(0). Devuelve la mejor solución obtenida
            Parámetro: Ninguno.
            Precondición: Ninguna.
            Complejidad Temporal: ???
            Complejidad Espacial: ???
        */
        float obtenerRaiz();

        /*
    	    Destructor de la clase Polinomio. Libera la memoria.
            Parámetro: Ninguno.
            Precondición: Ninguna.
            Complejidad Temporal: O(1)
            Complejidad Espacial: O(1)
        */
        ~Polinomio();
};