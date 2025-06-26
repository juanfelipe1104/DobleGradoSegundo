#include "Matriz.h"
#include <iostream>

int main(){
  	Matriz *temp=NULL;
	Matriz *copia=NULL;
  	Matriz a,b,c;
  	int n_filas;
  	int n_columnas;
  	double scalar;
  	long semilla;
  	char operacion;
  	do{
    	std::cout<<"Elige operacion:"<<std::endl;
      	std::cin>>operacion;
      	switch(operacion){
			case 'N':
	  			std::cout<<"Creando nueva matriz"<<std::endl;
	  			std::cout<<"Introduzca numero filas y columnas ";
	  			std::cin>>n_filas;
	  			std::cin>>n_columnas;
	  			temp=new Matriz(n_filas,n_columnas);
	  			temp->rellenarManual();
	  		break;
			case 'R':
	  			std::cout<<"Creando nueva matriz aleatoria"<<std::endl;
	  			std::cout<<"Introduzca numero filas y columnas ";
	  			std::cin>>n_filas;
	  			std::cin>>n_columnas;
	  			temp=new Matriz(n_filas,n_columnas);
	  			std::cout<<"Semilla aleatoria: ";
	  			std::cin>>semilla;
	  			temp->rellenarAleatorio(semilla);
	  		break;
			case 'A':
	  			a=*temp;
	  			std::cout<<"Asignando A"<<std::endl;
	  		break;
			case 'B':
	  			b=*temp;
	  			std::cout<<"Asignando B"<<std::endl;
	  		break;
			case 'C':
	  			c= *temp;
	  			std::cout<<"Asignando C"<<std::endl;
	  		break;
			case 'D':
				std::cout<<"Determinante de A: ";
				std::cout<<a.calcularDeterminante();
				std::cout<<std::endl;
	  		break;
			case '+':
	  			c=a+b;
	  			std::cout<<"C=A+B"<<std::endl;
	  		break;
			case '-':
	  			c=a-b;
	  			std::cout<<"C=A-B"<<std::endl;
	  		break;
			case '*':
	  			std::cin>>scalar;
	  			c=a*scalar;
	  			std::cout<<"C=A*val"<<std::endl;
	  		break;
			case 'X':
	  			c=a*b;
	  			std::cout<<"C=AxB"<<std::endl;
	  		break;
			case 'I':
	  			std::cout<<"Imprimir C"<<std::endl;
	  			c.mostrarMatriz();
	  		break;
			case '>':
	  			std::cout<<"Maximo de A: ";
	  			std::cout<<a.obtenerMaximo();
	  			std::cout<<std::endl;
	  		break;
			case '<':
	  			std::cout<<"Minimo de A: ";
	  			std::cout<<a.obtenerMinimo();
	  			std::cout<<std::endl;
	  		break;
			case 'S':
	  			std::cout<<"A es simetrica ";
	  			std::cout<<a.esSimetrica();
	  			std::cout<<std::endl;
	  		break;
			case 'T':
	  			std::cout<<"C=At"<<std::endl;
	  			c=a.calcularTraspuesta();
	  		break;
			case 'F':
	  			std::cout<<"FIN"<<std::endl;
	  		break;
			case 'H':
				double det = a.calcularDeterminante();
				std::cout << det << std::endl;
			break;
		}
    }while(operacion!='F');
  	return 0;
}
