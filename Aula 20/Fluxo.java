public class Fluxo {
	public static void main(String[] args) {
		
		char sexo = 'M';

		switch (sexo) {
			case 'M': System.out.println("Macho");
				break;
			case 'F': System.out.println("Femea");
				break;
			default: 
				System.out.println("Outro");
		}

		//ou

		String tecnologia = new String("Postgresql");
		switch (tecnologia) {
			case "Java":
			case "C++":
			case "Cobol":
				System.out.println("Linguagem de programação");
				break;
			case "Oracle":
			case "Server" :
			case "Postgresql":
				System.out.println("Banco de dados");
				break;
			default:
				System.out.println("Desconhecido");
			
		}
	}
}