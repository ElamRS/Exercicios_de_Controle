/* INTEGRANTES DO GRUPO M
 	Elam Rufino dos Santos - SP3075338
 	Benjamin Anthony Zabala Paxi - SP3066061
 	Kauan dos Anjos Rocha - SP3065839
 	Ícaro Juan Santana Moreira - SP3065596
 	Pedro Henrique dos Santos Martins - SP3066126
*/

import java.util.Scanner; // Import Scanner da biblioteca util

public class Fibonnaci {
	// Atributos de Fibonnaci
	private int a=0;
	private int b=1;
	private int c=0;
	
	// Instancimento de objeto do tipo Scanner
	Scanner sc = new Scanner(System.in);
	
	// Método para imprimir a sequência de fibonnaci
	public void print_fib() { 
		int n;
		do {
			System.out.print("\nTamanho da Sequencia [-1 para sair]: ");
			n = sc.nextInt(); // Leitura do tamanho da sequência
			for (int i=0; i<n; i++) {
				System.out.printf("%d ", a); // Impressão do i-ésimo valor de a  
				c=b;
				b=a;
				a=b+c;
			}
			a=0; b=1; c=0;
		} while(n!=-1);
	}

	public static void main(String args[]) {
		Fibonnaci fib = new Fibonnaci(); // Objeto fib do tipo (classe) Fibonnaci
		fib.print_fib(); // Chamada do método prinf_fib() da instância fib 
	}
}

