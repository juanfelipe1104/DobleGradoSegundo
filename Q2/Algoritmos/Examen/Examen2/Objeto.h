class Objeto{
    public:
        double valor;
        int peso;
        double proporcion;
        Objeto(){
            this->valor = 0;
            this->peso = 0;
            this->proporcion = 0;
        }
        Objeto(int peso, int valor){
            this->valor = valor;
            this->peso = peso;
            this->proporcion = this->valor / this->peso;
        }
};