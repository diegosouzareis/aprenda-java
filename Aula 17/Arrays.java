public class Arrays {
	public static void main(String[] args) {
		 //Array de uma dimensão
		String[] paises = {"Brasil", "Russia", "Mexico", "Portugal"};
		//Array de duas dimensões
		String[][] carros = {
			{"Camaro", "Chev", "2012"},
			{"Uno", "Fiat", "2009"}
		};

		System.out.println(carros[1][1]); //localizando em um array de duas dimensões
	}
}