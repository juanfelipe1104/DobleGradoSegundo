#include <iostream>
#include "Grafo.h"

int main() {
    bool salir = false;
    while (!salir) {
        int V = 0, A = 0;
        std::cin >> V;
        if (V <= 0){
            salir = true;
        }
        else{
            Grafo grafo(V);
            std::cin >> A;
            for (int i = 0; i < A; i++) {
                int u = 0, v = 0;
                std::cin >> u >> v;
                grafo.agregarArista(u, v);
            }
            if (grafo.esRojiBlanco()){
                std::cout << "SI" << std::endl;
            }
            else{
                std::cout << "NO" << std::endl;
            }
        }
        
    }
    return 0;
}
