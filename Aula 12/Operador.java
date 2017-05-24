//Operadores de comparação - vão resultar em um valor booleano
public class Operador {
	public static void main(String[] args) {
		int x = 5;
		System.out.println( x == 5); // É igual a
		System.out.println( x != 5); // É diferente de
		System.out.println( x > 5); // Maior que
		System.out.println( x < 5); // Menor que
		System.out.println( x >= 5); // Maior ou igual
		System.out.println( x <= 5); //Menor ou igual

		Integer y = new Integer(6);
		System.out.println( y instanceof Integer); //Comprova objetos, "y é um instancia Integer?", "verifcar se ele é do tipo ***"
	}
}