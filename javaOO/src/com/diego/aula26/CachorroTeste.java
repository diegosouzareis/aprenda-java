package com.diego.aula26;

public class CachorroTeste {

	public static void main(String[] args) {
		
		Cachorro poodle = new Cachorro();
		poodle.raça = "Poodle";
		poodle.tamanho = 40;
		poodle.latir();
		
		Cachorro bulldog = new Cachorro();
		bulldog.raça = "BullDog";
		bulldog.tamanho = 30;
		bulldog.latir();

	}

}
