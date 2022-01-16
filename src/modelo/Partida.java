package modelo;

import java.util.Arrays;

import Utils.Utils;
import Vista.Vista;
import modelo.*;

public class Partida{
	private Personaje[] personajes;
	
	public Partida(int n) {
		personajes= new Personaje[n];
	}
	
	public Personaje[] getPersonajes() {
		return personajes;
	}
	
	public void setPersonajes(Personaje[] personajes) {
		this.personajes = personajes;
	}

	/**
	 * Método que sirve para elegir a un personaje de un array mediante una opción dada
	 * @param personajes Personajes del array
	 * @param opcion Número que nos permitirá seleccionar la posición de un personaje en el array
	 * @return Personaje de la posición elegida
	 */
	public Personaje eligePersonaje(Personaje[]personajes, int opcion) {
		Personaje p=new Personaje();
		try {
			p=personajes[opcion];
			personajes[opcion]=null;
		}catch(Exception ex) {
			System.out.println("Personaje no encontrado. Vuelve a intentarlo.");
		}
		return p;
	}
	
	/**
	 * Método que permite que p1 ataque
	 * @param p1 Personaje que ataca
	 * @param p2 Personaje que defiende
	 */
	public static void luchaJugador(Personaje p1, Personaje p2) {
		int danoTotal=-1;
		double numeroAleatorio= 20 + Math.random() * p1.getAtaque();
		int dano=(int) numeroAleatorio;
		boolean turnoAcabado= false;

		do {
			if(p1.getClass()==Guerreros.class && p2.getClass()==Magos.class) {
				Guerreros aux= (Guerreros)p1;
				Magos aux1=(Magos)p2;
				danoTotal=(dano+aux.getPoderAtaqueEspecial()) - (p2.getDefensa()+aux1.getPoderDefensaEspecial());
				if(danoTotal>0) {
					p2.setVida(p2.getVida() - danoTotal);
					Vista.dano(danoTotal, p1, p2);
				}else if(danoTotal<0 || danoTotal==0) {
					System.out.println("No has realizado daño al rival");
				}
				turnoAcabado= true;
			}else if(p1.getClass()==Guerreros.class && p2.getClass()==Guerreros.class) {
				Guerreros aux= (Guerreros)p1;
				danoTotal=(dano+aux.getPoderAtaqueEspecial()) - p2.getDefensa();
				if(danoTotal>0) {
					p2.setVida(p2.getVida() - danoTotal);
					Vista.dano(danoTotal, p1, p2);
				}else if(danoTotal<0 || danoTotal==0) {
					System.out.println("No has realizado daño al rival");
				}
				turnoAcabado= true;
			}else if(p1.getClass()==Magos.class && p2.getClass()==Guerreros.class) {
				danoTotal=dano - p2.getDefensa();
				if(danoTotal>0) {
					p2.setVida(p2.getVida() - danoTotal);
					Vista.dano(danoTotal, p1, p2);
				}else if(danoTotal<0 || danoTotal==0) {
					System.out.println("No has realizado daño al rival");
				}
				turnoAcabado= true;
			}else if(p1.getClass()==Magos.class && p2.getClass()==Magos.class) {
				Magos aux= (Magos)p2;
				danoTotal=dano - (p2.getDefensa()+aux.getPoderDefensaEspecial());
				if(danoTotal>0) {
					p2.setVida(p2.getVida() - danoTotal);
					Vista.dano(danoTotal, p1, p2);
				}else if(danoTotal<0 || danoTotal==0) {
					System.out.println("No has realizado daño al rival");
				}
				turnoAcabado= true;
			}
		}while(!turnoAcabado);
		System.out.println("");
	}
	
	/**
	 * Método que permite que p2 ataque
	 * @param p1 Personaje que defiende
	 * @param p2 Persanje que ataca
	 */
	public static void luchaCPU(Personaje p1, Personaje p2) {
		int danoTotal=-1;
		double numeroAleatorio= 20 + Math.random() * p2.getAtaque();
		int dano=(int) numeroAleatorio;
		boolean turnoAcabado= false;
		
		do {
			if(p2.getClass()==Guerreros.class && p1.getClass()==Magos.class) {
				Guerreros aux= (Guerreros)p2;
				Magos aux1= (Magos)p1;
				danoTotal=(dano+aux.getPoderAtaqueEspecial()) - (p1.getDefensa()+aux1.getPoderDefensaEspecial());
				if(danoTotal>0) {
					p1.setVida(p1.getVida() - danoTotal);
					Vista.dano(danoTotal, p2, p1);
				}else if(danoTotal<0 || danoTotal==0) {
					System.out.println("No has realizado daño al rival");
				}
				turnoAcabado= true;
			}else if(p2.getClass()==Guerreros.class && p1.getClass()==Guerreros.class) {
				Guerreros aux= (Guerreros)p2;
				danoTotal=(dano+aux.getPoderAtaqueEspecial()) - p1.getDefensa();
				if(danoTotal>0) {
					p1.setVida(p1.getVida() - danoTotal);
					Vista.dano(danoTotal, p2, p1);
				}else if(danoTotal<0 || danoTotal==0) {
					System.out.println("No has realizado daño al rival");
				}
				turnoAcabado= true;
			}else if(p2.getClass()==Magos.class && p1.getClass()==Guerreros.class) {
				danoTotal=dano - p1.getDefensa();
				if(danoTotal>0) {
					p1.setVida(p1.getVida() - danoTotal);
					Vista.dano(danoTotal, p2, p1);
				}else if(danoTotal<0 || danoTotal==0) {
					System.out.println("No has realizado daño al rival");
				}
				turnoAcabado= true;
			}else if(p2.getClass()==Magos.class && p1.getClass()==Guerreros.class) {
				Magos aux= (Magos)p2;
				danoTotal=dano - (p1.getDefensa()+aux.getPoderDefensaEspecial());
				if(danoTotal>0) {
					p1.setVida(p1.getVida() - danoTotal);
					Vista.dano(danoTotal, p2, p1);
				}else if(danoTotal<0 || danoTotal==0) {
					System.out.println("No has realizado daño al rival");
				}
				turnoAcabado= true;
			}
		}while(!turnoAcabado);
		System.out.println("");
	}
	
	@Override
	public String toString() {
		return Arrays.toString(personajes);
	}
}

