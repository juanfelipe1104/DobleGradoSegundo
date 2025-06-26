#include <iostream>
#include <cmath>

#define N 4 // Cambia N si deseas probar otro número de reinas

int soluciones = 0;

bool esValido(int tablero[N], int fila, int col) {
    for (int i = 0; i < fila; i++) {
        if (tablero[i] == col || std::abs(tablero[i] - col) == std::abs(i - fila)) {
            return false;
        }
    }
    return true;
}

void imprimirTablero(int tablero[N]) {
    std::cout << "Solución " << ++soluciones << ":\n";
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            if (tablero[i] == j)
                std::cout << "Q ";
            else
                std::cout << ". ";
        }
        std::cout << std::endl;
    }
    std::cout << std::endl;
}

void resolverNReinas(int tablero[N], int fila) {
    if (fila == N) {
        imprimirTablero(tablero);
        return;
    }

    for (int col = 0; col < N; col++) {
        if (esValido(tablero, fila, col)) {
            tablero[fila] = col;
            resolverNReinas(tablero, fila + 1);
            tablero[fila] = -1; // backtrack
        }
    }
}

int main() {
    int tablero[N];
    for (int i = 0; i < N; i++) {
        tablero[i] = -1;
    }

    resolverNReinas(tablero, 0);

    std::cout << "Total de soluciones: " << soluciones << std::endl;

    return 0;
}