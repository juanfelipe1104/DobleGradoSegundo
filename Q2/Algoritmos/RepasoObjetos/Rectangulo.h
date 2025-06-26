class Rectangulo{
    private:
        int ancho;
        int alto;
        int *datos;
    public:
        Rectangulo(int ancho=5, int alto=10);
        Rectangulo operator * (int k);
        int area();
        int perimetro();
        ~Rectangulo();
};