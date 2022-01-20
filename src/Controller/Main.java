package Controller;

import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		Cliente nome = new Cliente();
		nome.setNome("Lívia");

		Conta cc = new ContaCorrente(nome);
		Conta poupanca = new ContaPoupanca(nome);
		
		cc.depositar(100);
		cc.transferir(45, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		

	}

}
