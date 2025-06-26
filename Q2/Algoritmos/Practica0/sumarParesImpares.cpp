#include <iostream>

int sumarParesImpares(int numero);

int main (){
    int numero = 0;
    std::cin >> numero;
    std::cout << sumarParesImpares(numero) << std::endl;
    return 0;
}

int sumarParesImpares(int numero){
    int suma = 0;
    while (numero > 0){
        suma += numero;
        numero -= 2;
    }
    return suma;
}