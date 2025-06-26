#include <iostream>

void buscarFormas(int n, int sumaActual, int* combinacion, int indice) {
    if (sumaActual == n) {
        for (int i = 0; i < indice; i++) {
            std::cout << combinacion[i] << " ";
        }
        std::cout << std::endl;
        return;
    }
    for (int i = 1; i < n; i++) {
        if (sumaActual + i <= n) {
            combinacion[indice] = i;
            buscarFormas(n, sumaActual + i, combinacion, indice + 1);
        }
    }
}

int main() {
    int n;
    std::cin >> n;
    int* combinacion = new int[n]; 
    buscarFormas(n, 0, combinacion, 0);
    delete[] combinacion;
    return 0;
}