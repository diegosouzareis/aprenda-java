import static java.util.Arrays.*;
public class Arrays {
	public static void main(String[] args){

		String[] nomes = {"Diego", "Lucas", "Rafael", "Gabriel"}; //Criamos uma Array de strings simples
		System.out.println(nomes[0]); // localizamos a string

		//podemos mudar o valor tambem
		nomes[0] = "Reis";
		System.out.println(nomes[0]);

		//Array de inteiros
		int[] numeros = new int[3]; //Criamos um array apenas com o numero de "lugares"
		numeros[0] = 1;// e definimos os valores depois
		numeros[1] = 2;
		numeros[2] = 3;
		System.out.println(numeros[1]);

		//podemos converte um array para uma string
		System.out.println(nomes.toString());

		//Pode fazer uma pesquisa
		int posicao = binarySearch(nomes, "Lucas");
		System.out.println(posicao);

		//Você tambem pode ordenar
		sort(nomes, 0, nomes.length);




	}
}