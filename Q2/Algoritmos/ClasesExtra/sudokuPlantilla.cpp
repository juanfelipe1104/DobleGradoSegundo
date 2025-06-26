#include <iostream>

#define N 9

bool resolverSudoku(int sudoku[N][N]);

bool resolverSudoku(int sudoku[N][N]) {
   
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