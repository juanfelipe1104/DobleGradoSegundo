#include <iostream>
#include "Pila.h"
#define assertdomjudge(x) if(!(x)){std::cout<<"ERROR"<<std::endl;exit(0);}

/*
	Realiza el algoritmo de la torre de Hanoi usando la funcion mover().
	Parámetro: n, Pila origen, Pila temporal, Pila destino.
	Precondición: n > 0.
	Complejidad Temporal: T(n) = 2T(n-1) ; T(1) = 1
	Complejidad Espacial: M(n) = 2M(n-1) ; M(1) = 1
*/
void Hanoi(int n, Pila *origen, Pila *temporal, Pila *destino);

/*
  Desapila el disco del origen y lo apila en el destino.
	Parámetro: Pila origen, Pila destino.
	Precondición: origen != null.
	Complejidad Temporal: T(n) = 1
	Complejidad Espacial: M(n) = 1
*/
void mover(Pila *origen, Pila *destino);

int main(){  
  Pila *A=new Pila("A");
  Pila *B=new Pila("B");
  Pila *C=new Pila("C");
  int n;
  std::cin>>n;
  assertdomjudge(n > 0);
  for(int i=n;i>0;i--){
    A->apilar(i);
  }
  Hanoi(n,A,B,C);
  for(int i=0;i<n;i++){
    C->desapilar();
  }
  return 0;
}

void Hanoi(int n, Pila *origen, Pila *temporal, Pila *destino) {
  if(n > 0){
    Hanoi(n-1, origen, destino, temporal);
    mover(origen, destino);
    Hanoi(n-1, temporal, origen, destino);
  }
}

void mover(Pila *origen, Pila *destino){
  assertdomjudge(origen != nullptr);
  int disco = origen->desapilar();
  destino->apilar(disco);
}