#include <iostream>

/*
    Ordena una lista extrayendo un elemento. Lo coloca a la derecha del número menor ya ordenado, desplazando así los mayores a la derecha.
    Parámetro: La lista a ordenar y su tamaño.
    Retorno: Ninguno.
    Precondicion: Ninguna.
    Complejidad Temporal: T(n) = ((n^2 + n)/2) + 1 ; O(n^2)
    Complejidad Espacial: O(1)
*/
void ordenarInsercion(int numeros[],int n);

int main(){
    int n;
    std::cin >> n;
    int *numeros = new int[n];
    for(int i=0;i<n;i++){
        std::cin >> numeros[i];
    }
    ordenarInsercion(numeros,n);
    delete numeros;
}

void ordenarInsercion(int numeros[],int n){
    int j = 0, key = 0;
    for(int i = 1; i < n; i++){
        key = numeros[i];
        j = i - 1;
        while(j >= 0 && numeros[j] > key){
            numeros[j+1] = numeros[j];
            j--;
        }
        numeros[j+1] = key;
        for(int k=0;k<n;k++){
            std::cout << numeros[k] << " ";
        }
	    std::cout << std::endl;
    }  
}