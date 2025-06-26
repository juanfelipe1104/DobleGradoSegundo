#include <iostream>

int cochesMaximos(int voltajes[], int voltaje, int pilas);

int main(){
    int n = 0;
    int pilas = 0;
    int voltaje = 0;
    std::cin >> n;
    for(int i = 0; i < n; i++){
        std::cin >> pilas;
        std::cin >> voltaje;
        int voltajes[pilas];
        for(int j = 0; j < pilas; j++){
            std::cin >> voltajes[j];
        }
        std::cout << cochesMaximos(voltajes, voltaje, pilas) << std::endl; 
    }
}

int cochesMaximos(int voltajes[], int voltaje, int pilas){
    int coches = 0;
    for(int i = 0; i < pilas; i++){
        for(int j = i+1; j < pilas; j++){
            if((voltajes[i] + voltajes[j]) >= voltaje){
                coches++;
                voltajes[i] = 0;
                voltajes[j] = 0;
            }
        }
    }
    return coches;
}