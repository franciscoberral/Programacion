package Utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {
	/**
	 * M�todo que permite leer n�mero introducido
	 * @param frase Frase que va a recibir el m�todo
	 * @return N�mero elegido
	 */
	public static int leeEntero(String frase) {
		Scanner teclado= new Scanner (System.in);
		int numero=-1;
		boolean valid=false;
		
		do {
			try {
				System.out.println(frase);
				numero=teclado.nextInt();
				valid=true;
			}catch(InputMismatchException ex) {
				System.out.println("N�mero no v�lido. Vuelve a intentarlo.");
				teclado.next();
			}
		}while(!valid);
		return numero;
	}
}
