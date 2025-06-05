package proyecto_final_diseño;

public abstract class CartasDecorator implements ICartasDecorator {
	protected String tipo;
	protected ICartas carta; //pregunrar a juan porque este tipo
	protected Integer precio;
	public CartasDecorator(ICartas carta, String tipo, Integer precio) {
		this.tipo = tipo;
		this.carta = carta;
		this.precio = precio;
	}
	public ICartas getCarta() {
		return this.carta;
	}
	@Override
	public Integer getPrecio() {
		return this.carta.getPrecio() + this.precio;
	}
	@Override
	public String getDescripcion() {
		return this.carta.getDescripcion() + " con " + this.getTipo();
	}
	@Override
	public String getTipo() {
		return this.tipo;
	}

}