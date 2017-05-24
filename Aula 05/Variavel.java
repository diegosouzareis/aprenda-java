public class Variavel {

	public static void main(String[] args) {
		
		//Variaveis Primitivas

		int x = 7;
		x = 8; //JVM subistitui 7 por 8, apagando o 7

		//Variaveis de Referencia

		String nome = "Diego";
		nome = "Reis"; //Subistitui por "Reis", mas deixando na memoria "Diego"
		//Então quando um objeto esta na memoria, mas não esta sendo ultilizado, usamos o Garbage Collector
		nome = null; // todos os valores da variavel ficam nulos, e o garbage collector "apaga" esses dados da memoria
		


	}
}