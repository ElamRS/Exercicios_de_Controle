/* INTEGRANTES DO GRUPO M
 	Elam Rufino dos Santos - SP3075338
 	Benjamin Anthony Zabala Paxi - SP3066061
 	Kauan dos Anjos Rocha - SP3065839
 	Ícaro Juan Santana Moreira - SP3065596
 	Pedro Henrique dos Santos Martins - SP3066126
*/

import java.util.*;

public class Cliente {
	Random random = new Random();
	private int num_account = random.nextInt(1000) + 1; // cria um n�mero de conta aleat�rio
	private int saldo_ini;
	private int saldo_new;
	private int tot_cobrado;
	private int limite_credit;
	
	// Construtor para informar os dados ao instanciar o cliente 
	public Cliente(int saldo_ini, int tot_cobrado, int limite_credit) {
		this.saldo_ini = saldo_ini;
		this.tot_cobrado = tot_cobrado;
		this.limite_credit = limite_credit;
	}
	
	// m�todos para calcular e exibir o novo saldo
	public int calc_saldo() {
		this.saldo_new = (saldo_ini + tot_cobrado - limite_credit);
		if (this.saldo_new < 0) {
			this.saldo_new = -(this.saldo_new);
		}
		return this.saldo_new;
	}
	public void exib_saldo() {
		System.out.printf("Novo saldo de R$%d %s", saldo_new, saldo_new<=limite_credit ? 
				"est� dentro do limite de cr�dito." : "excede o limite de cr�dito.");
	}
}
