#include <iostream>
#define assertdomjudge(x) if(!(x)){std::cout<<"ERROR"<<std::endl;exit(0);}
#define TAM_MAX 10

/*
    Crea el triangulo de pascal con la dimensión pasada por parametro.
    Parámetro: Tamaño del triangulo.
    Retorno: Una matriz de enteros que representa el triangulo de Pascal.
    Precondicion: Ninguna.
*/
int **crearTriangulo(int tam);
/*
    Realiza el calculo del numero combinatorio accediendo al triangulo de Pascal.
    Parámetro: Enteros n, r (numeros a calcular sus combinaciones).
	Retorno: El número de combinaciones de los numeros pasados por parametro.
	Precondicion: n >= 0, r >= 0, n >= r
    Complejidad Temporal: T(n) = 1 ; O(n) = 1
    Complejidad Espacial: M(n) = 1 ; O(n) = 1
*/
int calcularNumeroCombinatorio(int n, int r, int **triangulo);

int main(){
    int **triangulo = crearTriangulo(TAM_MAX);
    int n = 0, r = 0;
    while(n != -1){
        std::cin >> n;
        std::cin >> r;
        if(n != -1){
            std::cout << calcularNumeroCombinatorio(n, r, triangulo) << std::endl;
        }
    }
    delete [] triangulo;
    return 0;
}

int **crearTriangulo(int tam){
    int **triangulo = nullptr;
    triangulo = new int*[tam];
    for(int i = 0; i < tam; i++){
        triangulo[i] = new int[i+1];
        for(int j = 0; j <= i; j++){
            if((j!=0) && (j!=i)){
                triangulo[i][j] = triangulo[i-1][j-1] + triangulo[i-1][j]; 
            }
            else{
                triangulo[i][j] = 1;
            }
        }
    }
    return triangulo;
}

int calcularNumeroCombinatorio(int n, int r, int **triangulo){
    assertdomjudge((r <= n) && (n >= 0) && (r >= 0));
    return triangulo[n][r];
}