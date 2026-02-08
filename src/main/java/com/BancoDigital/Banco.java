package com.BancoDigital;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Banco {
	private String nome;
	private List<Conta> contas;

	public void listarClientes() {
		System.out.println("=== Clientes ===");
		contas.stream().map(Conta::getCliente).distinct().map(Cliente::toString).forEach(System.out::println);
	}
}
