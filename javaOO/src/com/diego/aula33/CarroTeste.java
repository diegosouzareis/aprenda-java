package com.diego.aula33;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		Carro mercedes = new Carro("Classe A", 30, 30);
		System.out.println(mercedes.modelo);
		Motor v8 = new Motor();
		v8.tipo = "V18";
		v8.potencia = 660;
		mercedes.motor = v8; //adiciona o motor ao carro

		Carro ferrari = new Carro("Enzo", 30, 30);
		Motor v12 = new Motor("v12", 30);
		ferrari.motor = v12;
		//objeto dentro de objeto
		System.out.println(ferrari.motor.potencia);
		
		Carro buggati = new Carro("Veyron", 30, 30, new Motor("W16", 40));
		System.out.println(buggati.motor.potencia);
		
	}

}
