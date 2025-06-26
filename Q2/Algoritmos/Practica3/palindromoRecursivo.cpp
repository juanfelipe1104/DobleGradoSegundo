#include <iostream>

/*
    Comprueba si una palabra es palindromo recursivamente.
	Parámetro: String text.
	Retorno: booleano indicando si es o no palindromo.
	Precondicion: Ninguna.
	Complejidad Temporal: T(1) = 1; T(n) = T(n-2) + 1 ; O(n)
	Complejidad Espacial: M(n) = M(n-2) ; O(n)
*/
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
    if(text.length() <= 1){
        return true;
    }
    else if(text[0] != text[text.length()-1]){
        return false;
    }
    else{
        return esPalindromo(text.substr(1, text.length()-2));
    }
}