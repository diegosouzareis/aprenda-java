//Entradas do usuario
//Pacote default java.lang
//Pacote com scanner
import java.util.Scanner;
public class Entrada {
	//o parametro args é um Array, nesse parametro podemos recuperar dados do usuario
	public static void main(String[] args) {
		//Entrada feita na chamada do programa
		//System.out.println(args[1]); O sistema ira resgatar o argumento que o usuario ira passar podendo ser: "diego, rafael, lucas", indicando qual: [0],[1],[2], e printando na tela o argumento dado
		
		Scanner s = new Scanner(System.in); //Criamos um objeto scanner de entrada, para pegar informações
		//System.out.println(s.nextLine()); Fazemos o sistema printar o resultado do objeto 

		//Podemos colocar a resposta do usuario em uma variavel
		System.out.println("Qual é o seu nome?"); //Colocamos um dialogo
		String resultado = s.nextLine(); // fazemos uma variavel que contem o resultado do objeto Scanner, dado pelo usuario
		System.out.println("Bem vindo " +  resultado); //Printamos um simples dialogo com o dado do usuario
	}
}