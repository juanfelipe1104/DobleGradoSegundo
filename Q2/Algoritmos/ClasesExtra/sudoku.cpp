#include <iostream>

#define N 9

bool resolverSudoku(int sudoku[N][N]);
bool esValido(int sudoku[N][N], int fila, int col, int num);
void imprimirSudoku(int sudoku[N][N]);

bool esValido(int sudoku[N][N], int fila, int col, int num) {
    bool esValido = true; 
    // Verificar fila
    for (int x = 0; x < N && esValido; x++){
        if (sudoku[fila][x] == num){
            esValido = false;
        }
    }
    // Verificar columna
    for (int x = 0; x < N && esValido; x++){
        if (sudoku[x][col] == num){
            esValido = false;
        }
    }
    // Verificar bloque 3x3
    int filaInicio = fila - fila % 3, colInicio = col - col % 3;
    for (int i = 0; i < 3 && esValido; i++){
        for (int j = 0; j < 3 && esValido; j++){
            if (sudoku[i + filaInicio][j + colInicio] == num){
                esValido = false;
            }
        }
    }
    return esValido;
}

bool resolverSudoku(int sudoku[N][N]) {
    bool exito = false;
    int fila = -1, col = -1;
    bool vacio = false;
    // Buscamos la primera casilla vacía
    for (int i = 0; i < N && !vacio; i++) {
        for (int j = 0; j < N && !vacio; j++) {
            if (sudoku[i][j] == 0) {
                fila = i;
                col = j;
                vacio = true;
            }
        }
    }
    if (!vacio) {
        exito = true; // No hay casillas vacías, solución encontrada
    }
    else {
        for (int num = 1; num <= 9 && !exito; num++) {
            if (esValido(sudoku, fila, col, num)) {
                sudoku[fila][col] = num;
                exito = resolverSudoku(sudoku);
                if (!exito){
                    sudoku[fila][col] = 0;
                }
            }
        }
    }
    return exito;
}

void imprimirSudoku(int sudoku[N][N]) {
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            std::cout << sudoku[i][j] << " ";
        }
        std::cout << std::endl;
    }
}

int main() {
    int sudoku[N][N];
    for(int i = 0; i < N; i++){
        for(int j = 0; j < N; j++){
            std::cin >> sudoku[i][j];
        }
    }
    if (resolverSudoku(sudoku)) {
        std::cout << "Sudoku resuelto:" << std::endl;
        imprimirSudoku(sudoku);
    } else {
        std::cout << "No tiene solución." << std::endl;
    }

    return 0;
}