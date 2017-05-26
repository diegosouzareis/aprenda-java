import java.util.*;
public class Arrays{
	public static void main(String[] args) {
		
		ArrayList<String> cores = new ArrayList<>(); //Framework de Array, os <> definimos o tipo do elemento
		cores.add("Azul"); //adicionamos no array, o valor "Azul"
		cores.add(0, "Branco"); //acionamos "branco" na primeira posição
		System.out.println(cores.toString()); //Printamos o array em função de texto
		System.out.println(cores.size()); // Quantos elementos tem
		System.out.println(cores.get(1)); //recupera o elemento na posição 2
		System.out.println(cores.indexOf("Azul")); //retorna o indice/posição de..
		cores.remove("Branco"); //remove elementos
		System.out.println(cores.contains("Amarelo")); //ve se contem algum elemento especifico no array

	}
}