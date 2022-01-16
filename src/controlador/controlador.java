package controlador;

import modelo.*;
import Utils.Utils;
import Vista.*;

public class controlador {
	/**
	 * Método que permite iniciar partida
	 */
	public static void iniciaPartida() {
		Partida p = new Partida(10);
		
		Magos p1 = new Magos ("Mago 1", 100, 20, 25, 5);
		Guerreros p2 = new Guerreros ("Guerrero 1", 100, 21, 20, 8);
		Magos p3 = new Magos ("Mago 2", 100, 19, 25, 1);
		Guerreros p4 = new Guerreros ("Guerrero 2", 100, 25, 20, 2);
		Magos p5 = new Magos ("Mago 3", 100, 16, 25, 9);
		Guerreros p6 = new Guerreros ("Guerrero 3", 100, 23, 20, 6);
		Magos p7 = new Magos ("Mago 4", 100, 18, 25, 7);
		Guerreros p8 = new Guerreros ("Guerrero 4", 100, 17, 20, 5);
		Magos p9 = new Magos ("Mago 5", 100, 22, 25, 3);
		Guerreros p10 = new Guerreros ("Guerrero 5", 100, 24, 20, 4);
		
		Personaje[]personajes= new Personaje[10];
		
		personajes[0]=p1;
		personajes[1]=p2;
		personajes[2]=p3;
		personajes[3]=p4;
		personajes[4]=p5;
		personajes[5]=p6;
		personajes[6]=p7;
		personajes[7]=p8;
		personajes[8]=p9;
		personajes[9]=p10;
		
		Vista.bienvenida();
		
		int opcion;
		Personaje seleccionado1= new Personaje();
		Personaje seleccionado2= new Personaje();
		do {
			Vista.muestraMenu();
			opcion=Utils.leeEntero("Por favor, seleccione una de las opciones anteriores: ");
			switch(opcion) {
				case 0:
					Vista.mensaje1();
					break;
				case 1:
					Vista.muestraInstrucciones();
					break;
				case 2:
					Vista.muestraPersonajes();
					break;
				case 3:
					Vista.muestraEstadisticas(personajes);
					break;
				case 4:
					int opcion1;
					int opcion2;
					boolean valid=false;
					do {
						do {
							opcion1=Utils.leeEntero("Elige un personaje: ");
							seleccionado1=p.eligePersonaje(personajes, opcion1);
							if(seleccionado1!=null) {
								System.out.println(seleccionado1.getNombre());
							}else {
								Vista.mensaje2();
							}
						}while(seleccionado1==null || opcion1<0 || opcion1>9);
						do {
							opcion2=Utils.leeEntero("Elige otro personaje: ");
							seleccionado2=p.eligePersonaje(personajes, opcion2);
							if(seleccionado2!=null) {
								System.out.println(seleccionado2.getNombre());
							}else {
								Vista.mensaje2();
							}
						}while(seleccionado2==null || opcion2<0 || opcion2>9);
						if (seleccionado1!=null && seleccionado2!=null) {
							valid=true;
						}
					}while(!valid);
					Vista.lucha(seleccionado1, seleccionado2);
					break;
				case 5:
					boolean valid1=false;
					do {
						do {
							if(seleccionado1.getVida()>0) {
								Vista.mensaje3();
								Partida.luchaJugador(seleccionado1, seleccionado2);
							}
							if(seleccionado2.getVida()>0) {
								Vista.mensaje4();
								Partida.luchaCPU(seleccionado1, seleccionado2);
							}
						}while(seleccionado1.getVida()>0 && seleccionado2.getVida()>0);
						valid1=true;
					}while(!valid1);
					if(seleccionado1.getVida()>0) {
						Vista.victoria(seleccionado1);
					}else if(seleccionado2.getVida()>0) {
						Vista.victoria(seleccionado2);
					}
					break;
				default:
					Vista.mensaje5();
					break;
			}
		}while(opcion!=0);
	}
}
