#ifndef NODO_H
#define NODO_H

class Nodo{
  public:
    int elemento;
    Nodo *siguiente;
    Nodo(int v, Nodo *sig=nullptr){
      this->elemento=v;
      this->siguiente=sig;
    }
};

#endif