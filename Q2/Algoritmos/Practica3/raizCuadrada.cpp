#include <iostream>
#define assertdomjudge(x) if(!(x)){std::cout<<"ERROR"<<std::endl;exit(0);}

/*
    Calcula el valor aproximado de la raiz cuadrada recursivamente hallando el punto medio.
	Parámetro: float numero, float error, float minimo, float maximo. Numero a calcular su raiz con un margen de error. Recibe los minimos y maximos para acortar el punto medio
	Retorno: Valor aproximado de la raiz cuadrada del numero pasado por parametro.
	Precondicion: numero >= 0, error >= 0.
*/
float calcularRaizCuadrada(float numero, float error, float minimo, float maximo);

int main(){
    float numero = 0, error = 0;
    std::cin >> numero;
    std::cin >> error;
    std::cout << calcularRaizCuadrada(numero, error, 0, numero) << std::endl;
}

float calcularRaizCuadrada(float numero, float error, float minimo, float maximo){
    assertdomjudge((numero >= 0) && (error >= 0));
    float puntoMedio = (minimo + maximo) / 2;
    float cuadrado = puntoMedio * puntoMedio;
    if((numero >= (cuadrado-error)) && (numero <= (cuadrado+error))){
        return puntoMedio;
    }
    else if(numero < (cuadrado-error)){
        std::cout << puntoMedio << std::endl;
        return calcularRaizCuadrada(numero, error, minimo, puntoMedio);
    }
    else{
        std::cout << puntoMedio << std::endl;
        return calcularRaizCuadrada(numero, error, puntoMedio, maximo);
    }
}