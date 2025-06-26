class Nodo{
  public:
    int valor;
    Nodo *siguiente;
    Nodo(int valor, Nodo *siguiente=nullptr){
      this->valor = valor;
      this->siguiente = siguiente;
    }
};