package com.diego.aula27;

public class Conta {
	
	String cliente;
	Double saldo;
	
	void mostrarSaldo() {
		System.out.println(cliente + " Seu saldo é de " + "R$" + saldo);
	}
	
	void saca(double valor) {	
		saldo = saldo - valor;
	}
	
	void deposito(double valor) {
		saldo = saldo + valor;
	}
	
	void Transferencia(Conta destino, double valor) {
		this.saca(valor);
		destino.deposito(valor);
	}

}
