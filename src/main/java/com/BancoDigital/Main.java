package com.BancoDigital;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco();
		List<Conta> listaContas = new ArrayList<>();

		banco.setNome("Banco Exemplo");
		banco.setContas(listaContas);

		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		listaContas.add(cc);
		Conta poupanca = new ContaPoupanca(venilton);
		listaContas.add(poupanca);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		Cliente flovson = new Cliente();
		flovson.setNome("Flóvson");
		Conta poupancaFlovson = new ContaPoupanca(flovson);
		listaContas.add(poupancaFlovson);

		banco.listarClientes();
	}
}
