#include "Contacto.h"

// Estructura que representa un nodo de una lista enlazada
struct Nodo{
	Contacto elemento; // El elemento que guarda el nodo
	Nodo *siguienteNodo; // Puntero al siguiente nodo de la lista enlazada
};