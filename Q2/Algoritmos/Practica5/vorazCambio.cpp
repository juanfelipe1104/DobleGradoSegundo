#include <iostream>

#define NUM_MONEDAS 8

const int VALOR_MONEDAS[NUM_MONEDAS] = {500, 200, 100, 50, 25, 10, 5, 1};

/*
    Realiza el calculo del cambio llamando a la función calcularNumeroDeMonedas por cada tipo de moneda y lo imprime.
    Parámetro: cambio.
	Retorno: Ninguno.
	Precondicion: cambio >= 0
    Complejidad Temporal: T(n) = n + 1 ; O(n) = n siendo n el numero de monedas posibles
    Complejidad Espacial: M(n) = n + 1 ; O(n) = n siendo n el numero de monedas posibles
*/
void calcularCambio(int cambio);

/*
    Realiza el calculo del numero de monedas posibles a devolver segun el cambio.
    Parámetro: Cambio como puntero para editarlo y entero Valor de la moneda.
	Retorno: El número de monedas posibles.
	Precondicion: cambio >= 0
    Complejidad Temporal: T(n) = 1 ; O(n) = 1
    Complejidad Espacial: M(n) = 1 ; O(n) = 1
*/
int calcularNumeroDeMonedas(int *cambio, int moneda);

int main(){
    int cambio = 0;
    while(cambio >= 0){
        std::cin >> cambio;
        if(cambio >= 0){
            calcularCambio(cambio);
        }
    }
    return 0;
}

void calcularCambio(int cambio){
    for(int i = 0; i < NUM_MONEDAS; i++){
        std::cout << calcularNumeroDeMonedas(&cambio, VALOR_MONEDAS[i]) << " ";
    }
    std::cout << std::endl;
}

int calcularNumeroDeMonedas(int *cambio, int moneda){
    int numeroDeMonedas = 0;
    numeroDeMonedas = (*cambio / moneda);
    *cambio = *cambio - (numeroDeMonedas * moneda);
    return numeroDeMonedas;
}