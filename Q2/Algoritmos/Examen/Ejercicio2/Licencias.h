#pragma once
#include <iostream>
#include "ListaEnlazada.h"

class Licencias{
	private:
		int capacidad; 
		int n; 
		ListaEnlazada *tabla; 
	public:
		Licencias(int capacidad);
		int obtenerPosicion (long codigo);
		void insertarLicencia (long codigo, std::string herramienta);
		void eliminarLicencia (long codigo);
		void imprimir();
};

