package com.diego.aula28;

public class MatematicaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matematica m = new Matematica();
		int maior = m.maior(10, 20);
		System.out.println(maior);
		
		double soma = m.soma(10.5, 10.5);
		System.out.println(soma);
	}

}
