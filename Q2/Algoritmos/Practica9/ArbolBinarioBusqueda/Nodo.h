class Nodo{
    public:
        int contenido;
        Nodo *padre;
        Nodo *hijoIzquierdo;
        Nodo *hijoDerecho;
        Nodo(int contenido=0, Nodo* padre=nullptr){
            this->contenido = contenido;
            this->padre = nullptr;
            this->hijoIzquierdo = nullptr;
            this->hijoDerecho = nullptr;
        }
};