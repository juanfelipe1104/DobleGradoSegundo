package proyecto_final_diseño;

public interface IPersonaje {
	public abstract void atacar(Personaje jugPrincipal, Personaje jugSec, int AtaqueMiJugador, int AtaqueBot);
	public abstract void curarse();
	public abstract void usarCarta(int NumeroCartaUso);
	public abstract void mostrarCartas();
}
