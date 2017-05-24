/*Classes Wrapper 
Representados com letras maiusculas
Long, Integer, Double, 
*/
public class Variavel {
	public static void main(String[] args) {

		//Cria um objeto do tipo Double, utilizando o "new"
		Double idade = new Double("1.23"); //Podemos passar um string e depois recuperar outros valores

		//Dado o objeto, podemos converter esse objeto a outros tipos de valores
		double idadeToDouble = idade.doubleValue(); // Aqui recuperamos o valor String, para um double
		System.out.println(idadeToDouble + " - Podemos ver a string ser transformada em seu valor real, double");
		//Outros exemplos:
		//Indo para um valor inteiro:
		int idadeToInt = idade.intValue();
		System.out.println(idadeToInt + " - Podemos ver que \"1.23\"(double) foi transformado em 1(int)");
		//Indo para um valor

		//Realizar um conversão sem criar um objeto, utilizamos os metodos estaticos, que são metodos da classe
		//Conversão Esatica
		double numero = Double.parseDouble("1.23"); // Aqui convertemos uma string("1.23") para um double, sem a nessecidade de criar um objeto
		int numero2 = Integer.parseInt("123"); // String passada, e transformada em inteiro



	}
}