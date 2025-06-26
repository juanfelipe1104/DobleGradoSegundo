#include <iostream>

#define TAM 10

const int dx[] = {-1, 0, 1, 0};
const int dy[] = {0, 1, 0, -1};

/*
    Imprime el laberinto.
    Parámetro: laberinto.
	Retorno: Ninguno.
	Precondicion: Ninguna
    Complejidad Temporal: T(n) = n_filas * n_columnas + 1 ; O(n) = n_filas * n_columnas
    Complejidad Espacial: M(n) = 1; O(n) = 1
*/
void imprimirLaberinto(char **laberinto);

/*
    Implementa un algoritmo de backtracking donde el exito es haber encontrado el tesoro 'T'. Los obstaculos se representan con '*' y posiciones libres con '.'
    Parámetro: laberinto, posicionX del jugador, posicionY del jugador.
	Retorno: booleano que indica si hubo exito o no.
	Precondicion: Ninguna
    Complejidad Temporal: T(n) = ??? ; O(n) = ???
    Complejidad Espacial: M(n) = ??? ; O(n) = ???
*/
bool buscarTesoro(char **laberinto, int x, int y);

int main(){
    int sol_x = 0, sol_y = 0;
    char **laberinto = nullptr;
    laberinto = new char*[TAM];
    for(int i = 0; i < TAM; i++){
        laberinto[i] = new char[TAM];
        for(int j = 0; j < TAM; j++){
            std::cin >> laberinto[i][j];
        }
    }
    laberinto[sol_x][sol_y] = 'X';
    if(!buscarTesoro(laberinto, sol_x, sol_y)){
        std::cout<<"INALCANZABLE"<<std::endl;
    }
    for(int i = 0; i < TAM; i++){
        delete [] laberinto[i];
    }
    delete [] laberinto;
}

void imprimirLaberinto(char **laberinto){
    for(int i = 0; i < TAM; i++){
        for(int j = 0; j < TAM; j++){
            std::cout << laberinto[i][j];
        }
        std::cout<<std::endl;
    }
}

bool buscarTesoro(char **laberinto, int x, int y){
    bool exito = false;
    int k = -1;
    do {
        k++;
        int u = x + dx[k];
        int v = y + dy[k];
        if((0 <= u) && (u < TAM) && (0 <= v) && (v < TAM)){
            if((laberinto[u][v] == '.') || (laberinto[u][v] == 'T')){
                if (laberinto[u][v] != 'T'){
                    laberinto[u][v] = 'X';
                    exito = buscarTesoro(laberinto, u, v);
                    if(!exito){
                        laberinto[u][v] = '.';
                    }
                }
                else {
                    exito = true;
                    imprimirLaberinto(laberinto);
                    std::cout << "ENCONTRADO " << u << " " << v << std::endl;
                }
            }
        }
    }while(!(exito) && k < 3);
    return exito;
}