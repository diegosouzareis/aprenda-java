package com.diego.aula27;

public class ContaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta conta = new Conta();
		conta.cliente = "Diego";
		conta.saldo = 3_000.00;
		conta.mostrarSaldo();
		
		Conta destino = new Conta();
		destino.cliente = "Lucas";
		destino.saldo = 2_000.00;
		destino.mostrarSaldo();
		
		conta.Transferencia(destino, 100.0);
		destino.mostrarSaldo();
		conta.mostrarSaldo();

	}

}
