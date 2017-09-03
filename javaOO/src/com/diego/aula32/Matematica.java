package com.diego.aula32;

public class Matematica {
	//Sobrecarga de metodos
	// JVM consegue identificar qual o melhor metodo para os tipos de argumentos
	
	double media(double x, double y) {
		return (x + y) / 2;
	}
	
	double media(String x, String y) {
		int ix = Integer.parseInt(x);
		int iy = Integer.parseInt(y);
		return (ix + iy) / 2;
	}
	
	double media(double x) {
		return x;
	}
	
//	double media(int ... x) {	
//		return...
//	}

}
