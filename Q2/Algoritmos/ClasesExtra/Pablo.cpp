#include <iostream>

using namespace std;

int maxCoches(int numPilas, int vmin, int *v){
   int i = 0;
    int j = numPilas - 1;
    int coches = 0;

    while (i < j) {
        if (v[i] + v[j] >= vmin) {
            coches++;
            i++;
            j--;
        } else {
            i++;
        }
    }
    return coches;
}

void merge(int *a, int aLenght, int *b, int bLenght, int *c){
    int i = 0, j = 0, k = 0;

    while(i<aLenght && j<bLenght){
        if(a[i] < b[j]){
            c[k++] = a[i++];
        }else{
            c[k++] = b[j++];
        }
    }

    while(i<aLenght){
        c[k++] = a[i++];
    }
    while(j<bLenght){
        c[k++] = b[j++];
    }
}


void mergeSort(int *x, int lenght){
    int temporal[1000];

    int mitad = lenght/2;
    if(lenght <= 1){
        return;
    }
    mergeSort(x, mitad);
    mergeSort(x + mitad, lenght - mitad);
    merge(x, mitad, x + mitad, lenght - mitad, temporal);

    for(int i = 0;i<lenght;i++){
        x[i] = temporal[i];
    }
}



int main(){

    int numCasos = 0;
    int numPilas = 0;
    int vmin = 0;
    int v[100000];
    cin >> numCasos;

    for(int i = 0;i<numCasos;i++){
        cin >> numPilas >> vmin;
        for(int j = 0;j<numPilas;j++){
            cin >> v[j];
        }
    }
    mergeSort(v, numPilas);
    cout << maxCoches(numPilas, vmin, v);
}