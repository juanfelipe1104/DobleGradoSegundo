package proyecto_final_diseño;

import java.util.ArrayList;
import java.util.List;

public abstract class Personaje implements IPersonaje {
	protected int Vida;
	protected int Dinero;
	protected String Nombre;
	protected int NumCartas;
	protected int Ataque;
	//protected StrategyAttackContext strategyAttackContext;
	//protected EfectosState EstadoActual;
	protected List<ICartas> MisCartas;
	//conteto del state
	//protected EfectosState Envenenado;
	//protected EfectosState Paralizado;
	protected boolean EscudoActivo;
	public Personaje( String Nombre) {
		this.Vida=10;
		this.Dinero=10;
		this.Nombre=Nombre;
		this.Ataque=1;
		this.NumCartas=3;
		/*
		this.EstadoActual =new EstadoNormal(this);
		Envenenado=new PoisonedState(this);
		this.Paralizado=new ParalyzedState(this);
		*/
		this.MisCartas=new ArrayList<>();
		this.EscudoActivo=false;
		
		
	}
	/*
	public void aplicarEfecto() {
		EstadoActual.Efectos();
	}

	public void quitarEfecto() {
		EstadoActual.QuitarEfectos();
	}
	
	// Getters y setters...
	
	public EfectosState getEstadoActual() {
		return EstadoActual;
	}
	*/
	
	//public List<CartaBase> getMisCartas() {
	//	return MisCartas;
	//}
	
	public void setMisCartas(List<ICartas> misCartas) {
		MisCartas = misCartas;
	}
	
	public boolean isEscudoActivo() {
		return EscudoActivo;
	}
	
	public void setEscudoActivo(boolean escudoActivo) {
		EscudoActivo = escudoActivo;
	}
	//public void setEstadoActual(EfectosState estado) {
		//this.EstadoActual = estado;
	//}
	
	
	public int getVida() {
		return Vida;
	}

	public void setVida(int vida) {
		Vida = vida;
	}

	public int getDinero() {
		return Dinero;
	}

	public void setDinero(int dinero) {
		Dinero = dinero;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getNumCartas() {
		return NumCartas;
	}

	public void setNumCartas(int numCartas) {
		NumCartas = numCartas;
	}

	public int getAtaque() {
		return Ataque;
	}

	public void setAtaque(int ataque) {
		Ataque = ataque;
	}
	/*
	public StrategyAttackContext getStrategyAttackContext() {
		return strategyAttackContext;
	}

	*/
	/**
	 * @param strategyAttackContext the strategyAttackContext to set
	 */
	/*
	public void setStrategyAttackContext(StrategyAttackContext strategyAttackContext) {
		this.strategyAttackContext = strategyAttackContext;
	}
	*/

	public void atacar(Personaje JugPrincipal, Personaje JugSec, int AtaqueMiJugador, int AtaqueBot) {
	    int GanadorTurno = AtaqueMiJugador - AtaqueBot;

	    if (GanadorTurno == 0) {
	        System.out.println("EMPATE");
	    } else if (GanadorTurno == -1 || GanadorTurno == 2) {
	        // Bot gana
	        System.out.println("EL BOT " + JugSec.getNombre() + " ATACA");
	        JugPrincipal.setVida(JugPrincipal.getVida() - JugSec.getAtaque());
	        System.out.println("VIDA RESTANTE DE " + JugPrincipal.getNombre() + ": " + JugPrincipal.getVida());
	    } else {
	        // Jugador gana
	        System.out.println("EL JUGADOR " + JugPrincipal.getNombre() + " ATACA");
	        JugSec.setVida(JugSec.getVida() - JugPrincipal.getAtaque());
	        System.out.println("VIDA RESTANTE DE " + JugSec.getNombre() + ": " + JugSec.getVida());
	    }
	    if(JugSec.getVida()<=0) {
	    	System.out.println("HA DERROTADO A " + JugSec.getNombre()+" \n ¡¡¡¡HA RECIBIDO 2 DE ORO!!!\n");
	    	JugPrincipal.setDinero(JugPrincipal.getDinero()+2);
	    	
	    }
	}
	public void MostrarCartas() 
	{
		for(int i=0;i<this.MisCartas.size();i++) {
			System.out.println(this.MisCartas.get(0).getDescripcion()+"\n");
		}
		
	}
	public void curarse() {}
	public void UsarCartas(int NumeroCartaUso) {
		if(this.MisCartas.get(NumeroCartaUso)!=null) {
			switch(this.MisCartas.get(NumeroCartaUso).getTipo()) {
			case "CURACION":	
							if(Vida>=10) { //PONER ALGO PARA QUE COJA LA VIDA MAXIMA DE CADA PERSONAJE
								System.out.println("FALLO AL USAR LA CARTA, VIDA AL MAXIMO \n");
								
							}
							else {
								this.MisCartas.get(NumeroCartaUso).usarCarta(this);
								MisCartas.remove(NumeroCartaUso);
							}
				
			case "ESCUDO": if(this.EscudoActivo==true) { //PONER ALGO PARA QUE COJA LA VIDA MAXIMA DE CADA PERSONAJE
								System.out.println("FALLO AL USAR LA CARTA, Escudo ya activo \n");
							
							}
						else {
								this.MisCartas.get(NumeroCartaUso).usarCarta(this);
								MisCartas.remove(NumeroCartaUso);
						}
			
			}
		}
		
	}
	public void Estado() {}

}
