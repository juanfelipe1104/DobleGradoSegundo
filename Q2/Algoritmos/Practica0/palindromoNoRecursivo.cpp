#include <iostream>

bool esPalindromo(std::string text);

int main(){
    std::string textLine;
    std::cin >> textLine;
    bool comparacion = esPalindromo(textLine);
    if(comparacion){
        std::cout << 1 <<std::endl;
    }
    else{
        std::cout << 0 <<std::endl;
    }
}

bool esPalindromo(std::string text){
    int i = 0, j = text.length() - 1;
    bool resultado = false;
    while((i < j)&&(resultado = text[i++] == text[j--]));
    return resultado;
}