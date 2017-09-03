package com.diego.aula30;

public class GalinhaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Galinha g1 = new Galinha();
		g1.botar();
		g1.botar();
		g1.botar();
		
		//ou
		
		Galinha g2 = new Galinha();
		g2.botar().botar();
		
		System.out.println(g1.ovos);
		System.out.println(g2.ovos);
		System.out.println(Galinha.ovosdaGranja);
		System.out.println(Galinha.mediaDeOvos(2));

	}

}
