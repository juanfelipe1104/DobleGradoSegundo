#include "Agenda.h"

#define assertdomjudge(x) if(!(x)){std::cout<<"ERROR"<<std::endl;exit(0);}

Agenda::Agenda(int capacidad){
    this->capacidad = capacidad;
    this->n = 0;
    this->tabla = new ListaEnlazada[this->capacidad];
}

int Agenda::obtenerPosicion(long telefono){
    return telefono % this->capacidad;
}

bool Agenda::existeContacto(long telefono){
    Contacto contactoABuscar = {telefono, ""};
    if(this->tabla[this->obtenerPosicion(telefono)].buscar(contactoABuscar) != -1){
        return true;
    }
    else{
        return false;
    }
}

std::string Agenda::getContacto(long telefono){
    assertdomjudge(this->existeContacto(telefono));
    Contacto contactoABuscar = {telefono, ""};
    int posicionContacto = this->tabla[this->obtenerPosicion(telefono)].buscar(contactoABuscar);
    Contacto contactoBuscado = this->tabla[this->obtenerPosicion(telefono)].getValor(posicionContacto);
    return contactoBuscado.nombre;
}

void Agenda::introducirContacto(long telefono, std::string nombre){
    Contacto nuevoContacto = {telefono, nombre};
    this->tabla[this->obtenerPosicion(telefono)].insertar(0, nuevoContacto);
    this->n++;
}

void Agenda::eliminarContacto(long telefono){
    assertdomjudge(this->existeContacto(telefono));
    Contacto contactoAEliminar = {telefono, ""};
    int posicionContacto = this->tabla[this->obtenerPosicion(telefono)].buscar(contactoAEliminar);
    this->tabla[this->obtenerPosicion(telefono)].eliminar(posicionContacto);
    this->n--;
}

void imprimirListaEnlazada(ListaEnlazada *lista) {
	assertdomjudge(lista != nullptr);

	// Imprimimos tama�o
	std::cout << "n=" << lista->getN() << "|ListaEnlazada=";

	// Si la lista est� vac�a, imprimimos algo especial
	if (lista->getN() == 0) std::cout << "vacia";

	// Si no est� vac�a, imprimimos los elementos separados por comas, siempre que no sea demasiado grande
	// Si es demasiado grande, imprimimos un mensaje especial
	else {
		if (lista->getN() > 20) std::cout << "demasiadosElementosParaMostrar";
		else {
			for (int i = 0; i < lista->getN(); i++) {
				Contacto elemento = lista->getValor(i); // Elemento a imprimir
				std::cout << "(" << elemento.telefono << "," << elemento.nombre << ")";
				if (i < lista->getN() - 1) std::cout << ","; // Imprimimos "," si no estamos al final
			}
		}
	}
	std::cout << std::endl;
}

void Agenda::imprimir() {
	for (int i=0; i < this->capacidad; i++) {
		std::cout << "Posicion " << i << ": ";
		imprimirListaEnlazada(&this->tabla[i]);
	}
}

Agenda::~Agenda(){
    delete [] this->tabla;
}