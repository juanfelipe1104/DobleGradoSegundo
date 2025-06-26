#include "Rectangulo.h"

Rectangulo::Rectangulo(int ancho, int alto){
    this->ancho = ancho;
    this->alto = alto;
    this->datos = new int[1024*1024*64];
}
Rectangulo Rectangulo::operator * (int k){
    Rectangulo r3;
    r3.alto = this->alto * k;
    r3.ancho = this->ancho * k;
    return r3;
}
int Rectangulo::area(){
    return this->ancho * this->alto;
}
int Rectangulo::perimetro(){
    return 2 * (this->alto + this->ancho); 
}
Rectangulo::~Rectangulo(){
    delete [] datos;
}