class Nodo{
  public:
    int valor;
    Nodo *siguiente;
    Nodo(int v, Nodo *sig=nullptr){
      this->valor=v;
      this->siguiente=sig;
    }
};

