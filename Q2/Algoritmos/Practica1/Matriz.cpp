#include "Matriz.h"
#include <iostream>
#include <math.h>
#define assertdomjudge(x) if(!(x)){std::cout<<"ERROR"<<std::endl;exit(0);}

Matriz::Matriz(int numeroFilas, int numeroColumnas){
    this->numeroFilas = numeroFilas;
    this->numeroColumnas = numeroColumnas;
    this->matriz = nullptr;
    this->matriz = new double*[this->numeroFilas];
    for (int i = 0; i < this->numeroFilas; i++){
        this->matriz[i] = new double[this->numeroColumnas];
    }
}

Matriz Matriz::operator + (Matriz &matriz){
    assertdomjudge((this->numeroColumnas == matriz.numeroColumnas) && (this->numeroFilas == matriz.numeroFilas));
    Matriz matrizResultado(this->numeroFilas, this->numeroColumnas);
    for(int i = 0; i < this->numeroFilas; i++){
        for (int j = 0; j < this->numeroColumnas; j++){
            matrizResultado.matriz[i][j] = this->matriz[i][j] + matriz.matriz[i][j];
        }
    }
    return matrizResultado;
}
Matriz Matriz::operator - (Matriz &matriz){
    assertdomjudge((this->numeroColumnas == matriz.numeroColumnas) && (this->numeroFilas == matriz.numeroFilas));
    Matriz matrizResultado(this->numeroFilas, this->numeroColumnas);
    for(int i = 0; i < this->numeroFilas; i++){
        for (int j = 0; j < this->numeroColumnas; j++){
            matrizResultado.matriz[i][j] = this->matriz[i][j] - matriz.matriz[i][j];
        }
    }
    return matrizResultado;
}
Matriz Matriz::operator * (int k){
    Matriz matrizResultado(this->numeroFilas, this->numeroColumnas);
    for(int i = 0; i < this->numeroFilas; i++){
        for(int j = 0; j < this->numeroColumnas; j++){
            matrizResultado.matriz[i][j] = this->matriz[i][j] * k;
        }
    }
    return matrizResultado;
}
Matriz Matriz::operator * (Matriz &matriz){
    assertdomjudge((this->numeroColumnas == matriz.numeroFilas));
    Matriz matrizResultado(this->numeroFilas, matriz.numeroColumnas);
    for(int i = 0; i < this->numeroFilas; i++){
        for (int j = 0; j < matriz.numeroColumnas; j++){
            for(int k = 0; k < matriz.numeroFilas; k++){
                matrizResultado.matriz[i][j] += this->matriz[i][k] * matriz.matriz[k][j]; 
            }
        }
    }
    return matrizResultado;
}
double Matriz::calcularDeterminante(){
    assertdomjudge((this->numeroColumnas == this->numeroFilas));
    if((this->numeroColumnas == 1) && (this->numeroFilas == 1)){
        return this->matriz[0][0];
    }
    else if ((this->numeroColumnas == 2) && (this->numeroFilas == 2)){
        return ((this->matriz[0][0] * this->matriz[1][1]) - (this->matriz[0][1] * this->matriz[1][0]));
    }
    else{
        double determinante = 0;
        for(int columna = 0; columna < this->numeroColumnas; columna++){
            Matriz adjunto(this->numeroFilas - 1, this->numeroColumnas - 1);
            for(int i = 1; i < this->numeroColumnas; i++){
                int subcolumna = 0;
                for(int j = 0; j < this->numeroColumnas; j++){
                    if(j != columna){
                        adjunto.matriz[i-1][subcolumna] = this->matriz[i][j];
                        subcolumna++;
                    }
                }
            }
            double signo = 1 - 2 * (columna % 2);
            determinante += signo * this->matriz[0][columna] * adjunto.calcularDeterminante();
        }
        return determinante;
    }
}
Matriz Matriz::calcularTraspuesta(){
    Matriz matrizTraspuesta(this->numeroColumnas, this->numeroFilas);
    for(int i = 0; i < matrizTraspuesta.numeroFilas; i++){
        for(int j = 0; j < matrizTraspuesta.numeroColumnas; j++){
            matrizTraspuesta.matriz[i][j] = this->matriz[j][i];
        }
    }
    return matrizTraspuesta;
}
bool Matriz::esSimetrica(){
    bool esSimetrica = true;
    if(this->numeroFilas == this->numeroColumnas){
        for(int i = 0; (i < this->numeroFilas) && (esSimetrica); i++){
            for(int j = 0; (j < i) && (esSimetrica); j++){
                esSimetrica = (this->matriz[i][j] == this->matriz[j][i]);
            }   
        }
    }
    else{
        esSimetrica = false;
    }
    return esSimetrica;
}
double Matriz::obtenerMaximo(){
    double elemento = this->matriz[0][0];
    for (int i = 0; i < this->numeroFilas; i++){
        for (int j = 0; j < this->numeroColumnas; j++){
            if(this->matriz[i][j] > elemento){
                elemento = matriz[i][j];
            }
        }
    }
    return elemento;
}
double Matriz::obtenerMinimo(){
    double elemento = this->matriz[0][0];
    for (int i = 0; i < this->numeroFilas; i++){
        for (int j = 0; j < this->numeroColumnas; j++){
            if(this->matriz[i][j] < elemento){
                elemento = matriz[i][j];
            }
        }
    }
    return elemento;
}

Matriz& Matriz::operator = (Matriz matriz){
    if(this->matriz != nullptr){
        for (int i = 0; i < this->numeroFilas; i++){
            delete this->matriz[i];
        }
        delete this->matriz;
        this->matriz = nullptr;
    }
    this->numeroFilas = matriz.numeroFilas;
    this->numeroColumnas = matriz.numeroColumnas;
    this->matriz = nullptr;
    if((this->numeroFilas > 0) && (this->numeroColumnas > 0)){
        this->matriz = new double*[this->numeroFilas];
        for (int i = 0; i < this->numeroFilas; i++){
	        this->matriz[i] = new double[this->numeroColumnas];  
	        for(int j=0; j < this->numeroColumnas; j++){
                this->matriz[i][j] = matriz.matriz[i][j];
            }
	    }
    }
    return (*this); 
}

void Matriz::rellenarManual(){
    double elemento = 0;
    for (int i = 0; i < this->numeroFilas; i++){
        std::cout << "Fila " << i << std::endl;
        for (int j = 0; j < this->numeroColumnas; j++){
	        std::cout << "Elemento " << j  << std::endl;
	        std::cin >> elemento;
	        this->matriz[i][j] = elemento;
        }
        std::cout << std::endl;
    }
}

void Matriz::rellenarAleatorio(long seed){
    srand(seed);
    for (int i = 0; i < this->numeroFilas; i++){
        for (int j = 0; j < this->numeroColumnas; j++){
            this->matriz[i][j]=rand();
        }
    } 
}

void Matriz::mostrarMatriz(){
    for (int i = 0; i < this->numeroFilas; i++){
	    for (int j = 0; j < this->numeroColumnas; j++){
            std::cout << matriz[i][j] << " ";    
        }
        std::cout << std::endl;   
    }
}

Matriz::~Matriz(){
    for(int i = 0; i < this->numeroFilas; i++){
        delete [] this->matriz[i];
    }
    delete this->matriz;
    this->matriz = nullptr;
}