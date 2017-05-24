public class Variavel{

	public static void main(String[] args) {

		//Tipos primitivos
		//Tipos e Tamanhos

		int idade = 17;
		double preco = 1.38; //Pode ser um numero fracionado - Ponto flutuante
		char sexo = 'M'; //Um Caracter entre aspas simples
		boolean namorando = true; //Verdade ou Falso(false)

		byte b = 127; //Suporta ate o numero 127 (cem)
		short s = 32767; //Suporta ate o numero 32768, pode separar por underline ex: 32_768 (mil)
		int i = 2147483647; // Suporta ate o numero 2147483647, tem 4 bytes informação que equivale a 32 bits de espaço (bilhoes)
		long l = 9223372036854775807L; //Suporta + de 9 Quintilhoes
		float f = 123F; // "F" de float. Tem 32 bits de espaço - Ponto flutuante

		//Cast Implicito de conversão
		/*Ex: i = s; */ // Erro pois um int não cabe em um short então precisamos fazer um conversão explicita

		//Cast Explicito - Forçar uma conversão (Podem ocorrer perdas, mas você se asegura disso)

		/*Ex: i = (int) l;*/ //Assim forçamos um long em um inteiro
	}
}