#include <iostream>

int sumarPrimerosNumeros(int numero);

int main(){
    int numero = 0;
    std::cin >> numero;
    std::cout << sumarPrimerosNumeros(numero) << std::endl;
}

int sumarPrimerosNumeros(int numero){
    int resultado = 0;
    for (int i = 1; i <= numero; i++){
        resultado += i;
    }
    return resultado;
}