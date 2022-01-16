package Vista;

import modelo.Personaje;

public class Vista {
	/*
	 * M�todo que devuelve por pantalla un mensaje de bienvenida
	 */
	public static void bienvenida() {
		System.out.println("Bienvenido a TOTAL EXTERMINATION, un juego que consiste en hacer pelear a una serie de personajes, hasta que uno de ellos resulte vencedor.");
		System.out.println("");
	}
	
	/*
	 * M�todo que devuelve por pantalla las opciones del men�
	 */
	public static void muestraMenu() {
		System.out.println("A continuaci�n se muestran todas las opciones disponibles en el juego: ");
		System.out.println("0. Salir del juego");
		System.out.println("1. Mostrar instrucciones");
		System.out.println("2. Mostrar personajes disponibles");
		System.out.println("3. Mostrar estad�sticas");
		System.out.println("4. Elegir personaje");
		System.out.println("5. Lucha de personajes");
		System.out.println("----------------------------------------------------------------------------------------------------");
	}
	
	/*
	 * M�todo que devuelve por pantalla un mensaje al salir del programa
	 */
	public static void mensaje1() {
		System.out.println("Gracias por utilizar el programa.");
	}
	
	/*
	 * M�todo que devuelve por pantalla las instrucciones del juego
	 */
	public static void muestraInstrucciones() {
		System.out.println("El juego consiste en hacer luchar una serie de personajes. Estos personajes van a estar formados por guerreros o magos. A la hora de atacar, "
				+ "\nsi el personae elegido es un guerrero, se sumar� las estad�sticas de ataque y ataque especial, y si se est� defendiendo y el personaje es un "
				+ "\nmago, la defensa total estar� formada por la defensa y la defensa especial. El juego terminar� cuando uno de los dos jugadores se haya "
				+ "\nquedado sin vida.");
		System.out.println("----------------------------------------------------------------------------------------------------");
	}
	
	/*
	 * M�todo que devuelve por pantalla a los personajes con sus respectivas posiciones
	 */
	public static void muestraPersonajes() {
		System.out.println("0. Mago 1");
		System.out.println("1. Guerrero 1");
		System.out.println("2. Mago 2");
		System.out.println("3. Guerrero 2");
		System.out.println("4. Mago 3");
		System.out.println("5. Guerrero 3");
		System.out.println("6. Mago 4");
		System.out.println("7. Guerrero 4");
		System.out.println("8. Mago 5");
		System.out.println("9. Guerrero 5");
		System.out.println("----------------------------------------------------------------------------------------------------");
	}
	
	/*
	 * M�todo que devuelve por pantalla a los personajes con sus respectivas estad�sticas
	 */
	public static void muestraEstadisticas(Personaje[] personajes) {
		for(int i=0; i<personajes.length; i++) {
			System.out.println(personajes[i]);
		}
	}
	
	/*
	 * M�todo que devuelve por pantalla un mensaje cuando ya se ha seleccionado un personaje
	 */
	public static void mensaje2() {
		System.out.println("Personaje ya elegido.");
	}
	
	/*
	 * M�todo que devuelve por pantalla el versus entre personajes
	 */
	public static void lucha(Personaje p, Personaje p1) {
		System.out.println("");
		System.out.println("El personaje " +p.getNombre()+ " se va a enfrentar contra " +p1.getNombre() +".");
		System.out.println("----------------------------------------------------------------------------------------------------");
	}
	
	/*
	 * M�todo que devuelve por pantalla las acciones en la lucha
	 */
	public static void dano(int dano, Personaje p, Personaje p1) {
		System.out.println("El personaje " +p.getNombre()+ " ha realizado " +dano+ " puntos de da�o.");
		if(p1.getVida()>0) {
			System.out.println("Al jugador " +p1.getNombre()+ " le quedan " +p1.getVida()+ " puntos de vida.");
		}else {
			System.out.println("Al jugador " +p1.getNombre()+ " no le queda vida.");
		}
	}
	
	/*
	 * M�todo que devuelve por pantalla el turno del jugador 1
	 */
	public static void mensaje3() {
		System.out.println("---TURNO JUGADOR 1---");
	}
	
	/*
	 * M�todo que devuelve por pantalla el turno del jugador 2
	 */
	public static void mensaje4() {
		System.out.println("---TURNO JUGADOR 2---");
	}
	
	/*
	 * M�todo que devuelve por pantalla al personaje que ha ganado el combate
	 */
	public static void victoria(Personaje p) {
		System.out.println("El personaje " +p.getNombre()+ " ha resultado victorioso.");
		System.out.println("----------------------------------------------------------------------------------------------------");
	}
	
	/*
	 * M�todo que devuelve por pantalla que la opci�n introducida no es correcta
	 */
	public static void mensaje5() {
		System.out.println("Opci�n no v�lida, por favor vuelva a seleccionar otra.");
	}
}
