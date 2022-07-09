/* INTEGRANTES DO GRUPO M
 	Elam Rufino dos Santos - SP3075338
 	Benjamin Anthony Zabala Paxi - SP3066061
 	Kauan dos Anjos Rocha - SP3065839
 	Ícaro Juan Santana Moreira - SP3065596
 	Pedro Henrique dos Santos Martins - SP3066126
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
	public static int quociente (int numerador, int denominador) throws ArithmeticException {
		return numerador/denominador;
	}
	
	public static void main (String args[]) {
		// Primeiro são declarados os atributos floats que servirão para filtrar quando o usuário digitou um float/double 
		float n = 0;
		float d = 0;
		Scanner value = new Scanner (System.in);
		boolean loop = true;
		do {
			try {
				System.out.print("Entre com numerador: ");
				n = value.nextFloat(); // A leitura é feita em float, pois para todos os efeitos, 5.0 == 5, ou então 5 = (int) 5.5
				int numerador = (int) n; // Em seguida numerador, do tipo int recebe o valor de n convertido.
				System.out.print("Entre com o denominador: ");
				d = value.nextFloat();
				int denominador = (int) d;
				int result = quociente(numerador, denominador);
				System.out.printf("\nResultado: %d/%d = %d\n", numerador, denominador, result);
				// Como as varáveis que recebem o input dos usuários estão separadas das que realizam as operações, é possível checar se o usuário digitou um float no início.
				if ((n-((int)n))!=0 || d-((int)d)!=0) {
					System.out.println("Voce digitou um float/double ao inves de um inteiro. Tente novamente.\n");
				} else {
					loop = false;
				}
			} catch (InputMismatchException input) {
				// Assume-se que, se o InputMismatchException não foi ocasionado por um float, então foi ocasionado por um caractere ou String digitado.
				System.out.println("Voce digitou um caractere/double ao inves de um inteiro. Tente novamente.\n");
				value.nextLine();
			} catch (ArithmeticException e) {
				System.err.printf("Exception: %s\n", e);
				System.out.println("Divisao por Zero!");
			}
		} while(loop);
	}
}

