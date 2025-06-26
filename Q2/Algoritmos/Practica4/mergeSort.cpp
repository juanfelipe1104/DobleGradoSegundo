#include <iostream>

/*
    Ordena una lista separandola en mitades hasta llegar al caso base de que la lista sea de dimension 1. Usa la función merge() para combinar las sublistas
    Parámetro: La lista a ordenar y su tamaño.
    Retorno: Ninguno.
    Precondicion: Ninguna.
    Complejidad Temporal: T(1) = 1 ; T(n) = 2T(n/2) + n + 1 ; O(n) = nlog(n)
    Complejidad Espacial: M(1) = 1 ; M(n) = M(n/2) + n + 1 ; O(n) = n
*/
void mergeSort(int *x, int length);

/*
    Combina dos listas y las guarda en una nueva ordenando de menor a mayor.
    Parámetro: Primera sublista y su tamaño, segunda sublista y su tamaño, lista donde se guarda la combinación.
    Retorno: Ninguno.
    Precondicion: Ninguna.
    Complejidad Temporal: T(n) = n; O(n) = n
    Complejidad Espacial: M(n) = 1 ; O(n) = 1
*/
void merge(int *a, int aLength, int *b, int bLength, int *c);

int main(){
    int n;
    std::cin >> n;
    int *x = new int[n];
    for (int i = 0; i < n; i++){
        std::cin >> x[i];
    }
    mergeSort(x, n);
    delete [] x;
    return 0;
}

void mergeSort(int *x, int length){
    int temporal[length];
    if(length <= 1){
        return;
    }
    else{
        int middle = length / 2; 
        mergeSort(x, middle);
        mergeSort(x + middle, length-middle);
        merge(x, middle, x + middle, length-middle, temporal);
        for(int k = 0; k < length; k++){
            x[k] = temporal[k];
            std::cout << x[k] << " ";
        }
        std::cout << std::endl;
    }
}

void merge(int *a, int aLength, int *b, int bLength, int *c){
    int i = 0, j = 0, k = 0;
    while (i < aLength && j < bLength) {
        if (a[i] < b[j]){
            c[k++] = a[i++];
        }
        else{
            c[k++] = b[j++];
        }
    }
    while (i < aLength){
        c[k++] = a[i++];
    }
    while (j < bLength){
        c[k++] = b[j++];
    }
}