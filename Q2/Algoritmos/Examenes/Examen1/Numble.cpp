#include <iostream>

#define TAM 4

void numble(int numeros[], int x, int indice, int *resultado);
int sumaTotal(int *numeros);

int main(){
    int *numeros = new int[TAM];
    int *resultado = new int[TAM];
    int x = 0;
    for(int i = 0; i < TAM; i++){
        std::cin >> numeros[i];
    }
    std::cin >> x;
    numble(numeros, x, 0, resultado);
    return 0;
}

void numble(int numeros[], int x, int indice, int *resultado){
    if(indice == 4){
        if(x == sumaTotal(resultado)){
            for(int i = 0; i < TAM; i++){
                std::cout << resultado[i] << " ";
            }
            std::cout << std::endl;
        }
        return;
    }
    if(numeros[indice] != -1){
        resultado[indice] = numeros[indice];
        numble(numeros, x, indice+1, resultado);
    }
    else{
        for(int i = 0; i <= 9; i++){
            resultado[indice] = i;
            numble(numeros, x, indice+1, resultado);
        }
    }
}

int sumaTotal(int *numeros){
    int suma = 0;
    for(int i = 0; i < TAM; i++){
        suma += numeros[i];
    }
    return suma;
}