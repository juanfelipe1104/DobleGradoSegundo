package proyecto_final_diseño;

public class CartaCuracion extends CartasDecorator {
	public static final String DEFAULT_TIPO = "CURACION";
	public static final Integer DEFAULT_PRECIO = 1;
	public CartaCuracion(ICartas carta) {
		super(carta, CartaCuracion.DEFAULT_TIPO, CartaCuracion.DEFAULT_PRECIO);
	}
	@Override
	public void usarCarta(Personaje personaje) {
		System.out.println("HA DECIDIDO USAR: " + this.getDescripcion());
		personaje.setVida(personaje.getVida() + 1);
		System.out.println("CARTA USADA CON EXITO");
		super.carta.usarCarta(personaje);
	}
}