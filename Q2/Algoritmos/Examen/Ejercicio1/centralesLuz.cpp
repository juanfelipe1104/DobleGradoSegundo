#include <iostream>

#define N_TIPO_CENTRALES 5

const char tipo_centrales [N_TIPO_CENTRALES] = {'E','S','H','N','T'};

void centralesLuz(char *resultado, int indice, int N, int R, int numEnergiasRenovables);

bool esEnergiaRenovable(char energia);

int main(){
	int N = 0, R = 0;
	std::cin >> N;
	std::cin >> R;
	char *resultado = new char[N];
	centralesLuz(resultado, 0, N, R, 0);
	return 0;
}

void centralesLuz(char *resultado, int indice, int N, int R, int numEnergiasRenovables){
	if(indice == N){
		if(R == numEnergiasRenovables){
			for(int i = 0; i < N; i++){
				std::cout << resultado[i] << " ";
			}
			std::cout << std::endl;
		}
		return;
	}
	for(int i = 0; i < N_TIPO_CENTRALES; i++){
		resultado[indice] = tipo_centrales[i];
		if(esEnergiaRenovable(tipo_centrales[i])){
			centralesLuz(resultado, indice+1, N, R, numEnergiasRenovables+1);
		}
		else{
			centralesLuz(resultado, indice+1, N, R, numEnergiasRenovables);
		}
	}
}

bool esEnergiaRenovable(char energia){
	bool esEnergiaRenovable = false;
	switch(energia){
		case 'E':
		case 'S':
		case 'H':
			esEnergiaRenovable = true;
		break;
	}
	return esEnergiaRenovable;
}