package com.diego.aula29;

public class Funcionario {
	
	/*
	 * GET/IS - Captura
	 * SET - Configuração
	 */

	private String nome;
	//para que outras classes acessem a variavel(private) precisamos criar um metodo que retorne o valor da variavel para outras classes,
	//ultilizamos então o prefixo "get"
	
	private boolean ativo;// captura diferente
	
	public String getNome() {
		return nome;
	}
	
	public boolean isAtivo() { //usamos "is" para a capitura boolean
		return ativo;
	}
	
	//e para modificar ultilizamos o prefixo "set"
	public String setNome(String nome) {
		return this.nome = nome;
	}
	
	public boolean setAtivo(boolean ativo) {
		return this.ativo = ativo;
	}

}
