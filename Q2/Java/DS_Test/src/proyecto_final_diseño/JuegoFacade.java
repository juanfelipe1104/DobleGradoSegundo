package proyecto_final_diseño;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class JuegoFacade { //El Facade no implementa la lógica interna de las acciones (como atacar, curar o usar cartas), 
							//solo las organiza y llama a quien debe hacerlo. La lógica real debe estar en clases separadas especializadas.
	//private StrategyAttackContext strategyAttackContext;
	private Personaje miPersonaje;
	private Personaje enemigoBot;
	private List<Personaje> ListaBots;
	int vidadelosbots;
	int ataqueBot;
	int numeroenemigos;
	String NombreBot;
	Scanner lector;
	//FabricaPersonajeBot fabrica;
	int bucle;
	int bucle2;
	int contadordeenemigos;
	public JuegoFacade() {
		//this.strategyAttackContext = new StrategyAttackContext(new AtaquePiedra());
		this.miPersonaje = null;
		this.enemigoBot = null;
		ListaBots=new ArrayList<>();
		 vidadelosbots=0;
		 ataqueBot=0;
		numeroenemigos=0;
		 NombreBot=null;
		  lector =new Scanner(System.in);
		   //fabrica=new FabricaPersonajeBot();
		   int bucle=0;
			int bucle2=0;
			int contadordeenemigos=0;
	}
	
	public void GameController() { //forma de atacar
		
		Integer eleccionJugador = 0, ataqueBot = 0;
		Random random = new Random(); //el enemigo puede atacar random, logica de como se decide quien gana en personaje ataqacar
		int miAtaque=0;
		System.out.println("ELIJA QUE SACAR 1:PIEDRA 2:PAPEL 3:TIJERAS");
		eleccionJugador = lector.nextInt();
		ataqueBot = random.nextInt(3)+1;
		switch(miAtaque) {
		 	case 1:
			 	//this.strategyAttackContext.setStrategyAttack(new AtaquePiedra());   //si eliges uno pones la estrategia de piedra y te devuelve el numero que corresponde a piedra                           
			break;	
		 	case 2:
			 	//this.strategyAttackContext.setStrategyAttack(new AtaquePapel());
			break;
		 	case 3:
				//this.strategyAttackContext.setStrategyAttack(new AtaqueTijeras());         
			break;
			default:
			break;
		}
		//miAtaque = strategyAttackContext.atacar(); //el strategy te devuelve un numero en funcion de que elegiste y lo guardas
		//this.miPersonaje.atacar(this.miPersonaje, this.enemigoBot, miAtaque, ataqueBot); //mandas a la logica de atacar tu decision y la del bot que es random	
	}
	public void Menu(){
		Personaje miPersonaje=inicio(); //llamamos al inicio que nos devuelve a nuestro personaje su tipo y atributos
		
		System.out.println( "Elija la deificultad d elos enemigos\n 1:FACIL\n 2:MEDIA \n 3: Dificil\n"); //creador de enemigos
		vidadelosbots=lector.nextInt();
		switch(vidadelosbots) {
			case 1: 
					vidadelosbots=5;
					ataqueBot=1;
					break;
			case 2:
					vidadelosbots=7;
					ataqueBot=1;
					break;
			case 3:
					vidadelosbots=10;
					ataqueBot=2;
					break;
			default: 
					break; //Añadir algo
		}
		System.out.println( "Elija el numero de enemigos\n");
		numeroenemigos=lector.nextInt();
		for(int i=0 ;i<numeroenemigos;i++) {
			NombreBot="ENEMIGO"+(i+1);
			//Personaje ENEMIGO=fabrica.CrearPersonaje(NombreBot,vidadelosbots,ataqueBot);
			//ListaBots.add(ENEMIGO);
			
		}
		//fin de creador de enemigos
		
		int decision=0;
		System.out.println("QUE QUIERE HACER\n 1:ATACAR\n 2:MOSTRAR SUS CARTAS \n 3:COMPAR CARTAS\n 4:VER SUS ESTADISTICAS");
		decision=lector.nextInt();
		
		do { //bucle de partida solo acaba cuando tu vida lega a 0, acabas con todos tus enemigos
			do{
			Partida();//bucle interno que llama a partida, que es la partida contra cada enemigo por separado
		}while(miPersonaje.getVida()>0 ||ListaBots.get(contadordeenemigos).getVida()>0); //acaba cuando tu vida llega a 0 o la de tu enemigo llega a 0
		ListaBots.remove(contadordeenemigos);	
		}while(bucle!=1 || miPersonaje.getVida()==0 || ListaBots.size()<=0);
		
	}
	

public static Personaje inicio() { //el inicio del juego, nombre a personaje etc
	int tipo=0;
	String Nombre;
	Scanner lector=new Scanner(System.in);
	//FabricaPersonajes fabrica2=null;
	Personaje MiPersonaje=null;
	while(tipo<1 || tipo>4) {
		System.out.println("BIENVENIDO A LA PARTIDA DE PIEDRA PAPEL O TIJERAS \n, PRIMERO DEBEMOS DECIDIR QUE TIPO DE PERSONAJE USARAS\n 1:AS \n 2:TANQUE \n 3:CARTAS 4:\n");
		
		
		tipo=lector.nextInt();
		lector.nextLine();
	}
	System.out.println("INTRODUZCA EL NOMBRE DE SU PERSONAJE");
	Nombre=lector.nextLine();
	switch(tipo){
		case 1: 
			//fabrica2= new FabricaPersonajeAs();
			//MiPersonaje=fabrica2.CrearPersonaje(Nombre);
			break;

		case 2:break;
			

		case 3:break;
		
	
		case 4:
			break;
			

}
   return MiPersonaje;
}

public  void Partida() { //menu de decision de atacar, mostrar cartas comprar cartas usar cartas etc
	int decision=0;
	System.out.println("QUE QUIERE HACER\n 1:ATACAR\n 2:MOSTRAR SUS CARTAS \n 3:COMPAR CARTAS\n 4:VER SUS ESTADISTICAS \n 5:USAR CARTAS\n");
	decision=lector.nextInt();
	switch(decision) {
 	case 1: GameController(); //ver como atacas y como ataca tu enemigo y se juega la ronda
 			
	 	                             
	break;	
 	case 2: miPersonaje.MostrarCartas();;
 			break;
 	case 3: System.out.println("QUE CARTA DESEA COMPRAR\n 1:CURACION, 2 ESCUDO");
 			decision=lector.nextInt();
			switch(decision) {
				case 1: ICartas Cartacuracion = new CartaBase();
						Cartacuracion = new CartaCuracion(Cartacuracion);
						System.out.println("El precio es " + Cartacuracion.getPrecio());
						break;
				case 2: ICartas CartaEscudo=new CartaBase();
						//CartaEscudo=new CartaEscudo(CartaEscudo);
						break;
			}
		
			       
			break;
 	case 4:System.out.println("VIDA:" + miPersonaje.getVida()+"\n");
 			System.out.println("DINERO:" + miPersonaje.getDinero()+"\n");
 			System.out.println("ATAQUE:" + miPersonaje.getAtaque()+"\n");
 			
 	
 	case 5: System.out.println("QUE NUMERO DE CARTA DESEA USAR\n" );
			decision=lector.nextInt();
			miPersonaje.UsarCartas(decision);
	default:
	break;
}
	

}
public static void main(String[] args) {
	JuegoFacade juegoFacade = new JuegoFacade();
	juegoFacade.Partida();
}
}