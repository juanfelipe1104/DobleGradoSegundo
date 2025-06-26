#include "Rectangulo.h"
#include <iostream>

void crearRectangulos();

int main(){
    Rectangulo rectangulo1(10,20);
    Rectangulo rectangulo2(20,30);
    std::cout << rectangulo1.area() << std::endl;
    std::cout << rectangulo2.area() << std::endl;
    return 0;
}

void crearRectangulos(){
    Rectangulo rectangulo1(10,20);
    Rectangulo rectangulo2(20,30); 
}