package com.diego.aula30;

public class Galinha {
	
	//a palavra static indica q a variavel ou metodo pertence a classe, e nao a uma simples instancia do objeto, e são acessados sem a necessidade de uma instância da classe
	
	public static int ovosdaGranja; //variavel global
	
	public int ovos;
	
	public Galinha botar() {
		ovos++;
		Galinha.ovosdaGranja++;
		return this;
	}
	
	public static double mediaDeOvos(double galinhas) {
		return ovosdaGranja / galinhas;
	}
	

}
