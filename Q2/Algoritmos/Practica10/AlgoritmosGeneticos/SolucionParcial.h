#include <iostream>
#include <iomanip>

class SolucionParcial{
    public:
        float x;
        float y;
        SolucionParcial(float x, float y){
            this->x = x;
            this->y = y;
        }
        void imprimir(){
            std::cout << std::setprecision(5) << "(" << this->x << "," << this->y << ")" << std::endl;
        }
};