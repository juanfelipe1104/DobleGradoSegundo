#include <iostream>
#include <math.h>

void eurocopaRound(char *x, int length, int round);
void chooseWinner(char *a, char *b, int round, char *c);

int main(){
    int n;
    std::cin >> n;
    char *equipos = new char[n+1];
    for(int i = 0;i <n; i++){
        equipos[i]='A'+i;
    }
    equipos[n]=0;
    eurocopaRound(equipos,n,0); 
}

void eurocopaRound(char *x, int length, int round){
    char temporal[length];
    if(length <= 1){
        return;
    }
    else{
        int middle = length/2;
        eurocopaRound(x, middle, round+1);
        eurocopaRound(x+middle, length-middle, round+1);
        chooseWinner(x, x+middle, round, temporal);
        x[0] = temporal[0];
    }
}

void chooseWinner(char *a, char *b, int round, char *c){
    if((round % 2) == 0){
        c[0] = a[0];
    }
    else{
        c[0] = b[0];
    }
    std::cout << "Ronda " << round << " Ganador " << c[0] << std::endl;
}