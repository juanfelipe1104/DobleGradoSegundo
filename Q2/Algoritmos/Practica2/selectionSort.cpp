#include<iostream>

/*
    Ordena una lista buscando el mínimo y lo intercambia con el primer elemento no ordenado.
    Parámetro: La lista a ordenar y su tamaño.
    Retorno: Ninguno.
    Precondicion: Ninguna.
    Complejidad Temporal: T(n) = ((n^2 + 3n)/2) + 1 ; O(n^2)
    Complejidad Espacial: O(1)
*/
void ordenarSeleccion(int numeros[],int n);

int main(){
    int n;
    std::cin >> n;
    int *numeros = new int[n];
    for(int i = 0; i < n; i++){
        std::cin >> numeros[i];
    }    
    ordenarSeleccion(numeros,n);
    delete numeros;
}

void ordenarSeleccion(int numeros[],int n){
    int minimo = 0, auxiliar = 0;
    for(int i = 0; i < n; i++){
        minimo = i;
        for (int j = i+1; j < n; j++){
            if(numeros[j] < numeros[minimo]){
                minimo = j;
            }
        }
        auxiliar = numeros[i];
        numeros[i] = numeros[minimo];
        numeros[minimo] = auxiliar;
        for(int k=0;k<n;k++){
            std::cout<<numeros[k]<<" ";
        }
        std::cout<<std::endl;
    }  
}