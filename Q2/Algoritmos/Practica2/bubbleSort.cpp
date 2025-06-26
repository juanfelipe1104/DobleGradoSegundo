#include <iostream>

/*
    Ordena una lista intercambiando uno a uno los elementos si no están ordenados.
    Parámetro: La lista a ordenar y su tamaño.
    Retorno: Ninguno.
    Precondicion: Ninguna.
    Complejidad Temporal: T(n) = ((n^2 + n)/2) + 1 ; O(n^2)
    Complejidad Espacial: M(n) = 1 ; O(1)
*/
void ordenarBurbuja(int numeros[],int n);

int main(){
    int n;
    std::cin>>n;
    int *numeros = new int[n];
    for(int i = 0; i < n; i++){
        std::cin >> numeros[i];
    }
    ordenarBurbuja(numeros,n);
    delete numeros;
}

void ordenarBurbuja(int numeros[],int n){
    int auxiliar = 0;
    for(int i = 1; i < n; i++){
        for(int j = 0; j < n - i; j++){
            if (numeros[j] > numeros[j+1]){
                auxiliar = numeros[j];
                numeros[j] = numeros[j+1];
                numeros[j+1] = auxiliar;
            }
        }
        for(int k = 0; k < n; k++){
            std::cout << numeros[k] << " ";
        }
	    std::cout << std::endl;
    }  
}