#include "ListaContigua.h"

class ColaPrioridad{
    private:
        ListaContigua vector;
        int n;
        void reestructurar(); 
    public:
        ColaPrioridad();
        void encolar(int num);
        int desencolar();
        bool estaVacia();
};