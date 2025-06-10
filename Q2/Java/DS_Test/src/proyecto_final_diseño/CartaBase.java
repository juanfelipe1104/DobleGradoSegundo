package proyecto_final_diseño;

public class CartaBase implements ICartas {
	public static final Integer DEFAULT_PRECIO = 2;
	private Integer precio;
	public CartaBase() {
		this(CartaBase.DEFAULT_PRECIO);
	}
	public CartaBase(Integer precio) {
		this.precio = precio;
	}
	@Override
	public Integer getPrecio() {
		return this.precio;
	}
	@Override
	public String getDescripcion() {
		return this.getTipo();
		
	}
	@Override
	public void usarCarta(Personaje personaje) {
		//Carta base, no hace nada
	}
	@Override
	public String getTipo() {
		return "CARTA BASE";
	}
}