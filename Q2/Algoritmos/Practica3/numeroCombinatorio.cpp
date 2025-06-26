#include <iostream>
#define assertdomjudge(x) if(!(x)){std::cout<<"ERROR"<<std::endl;exit(0);}

/*
    Realiza el calculo del numero combinatorio usando la función calcularFactorial().
	Parámetro: Enteros n, r (numeros a calcular sus combinaciones).
	Retorno: El número de combinaciones de los numeros pasados por parametro.
	Precondicion: n >= 0, r >= 0, n >= r.
	Complejidad Temporal: T_2(n,r) = (T_1(n) / (T_1(n) * T_1(n-r))) + 1 ; O(n)
	Complejidad Espacial: M_2(n) = (M_1(n) / (M_1(n) * M_1(n-r))) + 1 ; O(n)
*/
int calcularNumeroCombinatorio(int n, int r);

/*
    Realiza el calculo del numero facotrial recursivamente.
	Parámetro: Entero n (numero a calcular su factorial).
	Retorno: El número factorial del numero pasado por parametro.
	Precondicion: n >= 0.
	Complejidad Temporal: T_1(0) = T_(1) = 1 ; T_1(n) = n*T_1(n-1) + 1 ; O(n)
	Complejidad Espacial: M_1(n) = n*M_1(n-1) + 1 ; O(n)
*/
int calcularFactorial(int n);

int main(){
    int n = 0, r = 0;
    while(n != -1){
        std::cin >> n;
        std::cin >> r;
        if(n != -1){
            std::cout << calcularNumeroCombinatorio(n, r) << std::endl;
        }
    }
    return 0;
}

int calcularNumeroCombinatorio(int n, int r){
    assertdomjudge((r <= n) && (n >= 0) && (r >= 0));
    int numeroCombinatorio = 0;
    return calcularFactorial(n) / (calcularFactorial(r)*calcularFactorial(n-r));
}

int calcularFactorial(int n){
    if (n < 2){
        return 1;
    }
    else{
        return n * calcularFactorial(n-1);
    }
}