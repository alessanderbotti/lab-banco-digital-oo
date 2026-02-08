package com.BancoDigital;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Cliente {
	private String nome;

	public String toString() {
		return this.nome;
	}
}
