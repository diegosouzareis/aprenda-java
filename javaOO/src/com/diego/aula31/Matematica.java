package com.diego.aula31;

public class Matematica {
	
	public double soma(double ... numeros) {
		double total = 0;
		for(double n : numeros) {
			total += n;
		}
		return total;
		
		
	}

}
