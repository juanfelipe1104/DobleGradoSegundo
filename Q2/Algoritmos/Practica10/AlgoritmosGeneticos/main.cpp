#include <iostream>
#include "Polinomio.h"
#include <cstring>
#include <cassert>
#include <cstdlib>
#include <cmath>
#include <ctime>

int main()
{
  int grado; // Grado del polinomio
  int semilla; //Semilla aleatoria
  float *coeficientes = NULL; // Array de coeficientes
  
  std::cin>>semilla;
  srand(semilla); // Inicializamos motor de numeros aleatorios
  
  // Pedimos el grado 
  std::cin >> grado;
  
  // Pedimos y guardamos los coeficientes
  coeficientes = new float[grado+1];
  for (int i=0; i<=grado; i++) std::cin >> coeficientes[i];
  std::cout << std::endl;
  
  // Creamos el polinomio y hacemos 5 veces la b�squeda de ra�z
  Polinomio p(grado, coeficientes);
  for (int i=0; i<5; i++) {
	std::cout <<"Iteracion "<<i<<std::endl;
	float raiz = p.obtenerRaiz();
	std::cout <<" Raiz " << raiz << std::endl;
  }
  return 0;
}
