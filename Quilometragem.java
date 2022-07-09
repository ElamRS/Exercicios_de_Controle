/* INTEGRANTES DO GRUPO M
 	Elam Rufino dos Santos - SP3075338
 	Benjamin Anthony Zabala Paxi - SP3066061
 	Kauan dos Anjos Rocha - SP3065839
 	Ícaro Juan Santana Moreira - SP3065596
 	Pedro Henrique dos Santos Martins - SP3066126
*/

import java.util.Scanner;

public class Quilometragem {
	private int km_rodados;
	private int litros_gastos;
	private double tot_rodado=0;
	private double tot_gasto=0;
	private double consumo;
	
	public void calc_consumo() {
		int i;
		do {
			Scanner tecla = new Scanner(System.in);
			// Ler a quantidade de quilometros rodados e litros gastos
			System.out.println("Quil�metros rodados: ");
			this.km_rodados = tecla.nextInt();
			System.out.println("Litros gastos: ");
			this.litros_gastos = tecla.nextInt();
			// Adicionar aos valores atuais de quilometros rodados e litros gastos ao total
			this.tot_rodado += this.km_rodados;
			this.tot_gasto += this.litros_gastos;
			// C�lculo do consumo
			this.consumo = km_rodados/litros_gastos;
			exib_consumo();
			System.out.println("\n");
			System.out.println("[Digite -1 para encerrar a execu��o!]");
			System.out.println("[Digite qualquer n�mero para continuar a execu��o!]");
			i = tecla.nextInt();
		} while (i != -1);
		System.out.println("Fim da execu��o!");
	}
	
	public void exib_consumo() {
		System.out.printf("Consumo: %.2f Quil�metros/Litros\n", consumo);
		System.out.printf("Quil�metros rodados at� agora: %.2f Km\n", tot_rodado);
		System.out.printf("Total de litros de combust�vel gasto: %.2f Litros", tot_gasto);
	}
}
