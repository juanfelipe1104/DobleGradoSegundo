#include "ListaCircular.h"

int main() {
    ListaCircular playlist;
    playlist.insertar(0, "Bohemian Rhapsody");
    playlist.insertar(1, "Imagine");
    playlist.insertar(2, "Hotel California");
    playlist.insertar(3, "Smells Like Teen Spirit");

    int opcion;
    std::string nueva;
    do {
        std::cout << "\nLista de Reproducción:\n";
        playlist.mostrarLista();

        std::cout << "\nOpciones:\n";
        std::cout << "1. Siguiente canción\n";
        std::cout << "2. Canción anterior\n";
        std::cout << "3. Agregar nueva canción después de la actual\n";
        std::cout << "4. Eliminar canción actual\n";
        std::cout << "0. Salir\n";
        std::cout << "Elegir opción: ";
        std::cin >> opcion;
        switch(opcion){
            case 1:
            playlist.girar(1);
            break;
            case 2:
            playlist.girar(-1);
            break;
            case 3:
                std::cout << "Nombre de la canción: ";
                std::getline(std::cin, nueva);
                playlist.insertar(1, nueva);
            break;
            case 4:
                playlist.eliminar(0);
            break;
            default:
        }
    } while (opcion != 0);

    return 0;
}