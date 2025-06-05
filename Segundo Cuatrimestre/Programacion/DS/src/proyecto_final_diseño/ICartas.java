package proyecto_final_diseño;

public interface ICartas {
    public abstract void usarCarta(Personaje personaje);
    public abstract String getDescripcion();
    public abstract Integer getPrecio();
    public abstract String getTipo();
}