public class Fluxo {

	public static void main(String[] args) {
		String nome = "";
		for(int i=0; i<3; i++) { // For é um metodo de repetição, o primeiro bloco do "For" é a nossa variavel, o segundo bloco é a nossa condĩção verdadeira, e o terceiro é a nossa ação
		//"Enquanto "i" for menor 3, continue adicionando i, caso não seja mais menor que três, pare de adicionar" ou seja enquanto a condição for verdadeira, continue acionando ação, agora se for falsa, pare a ação	
			nome = nome + i + ","; //adicionamos na variavel "nome" os numeros da varivel "i" e colocamos virgulas
			System.out.println(i); //printamos i 
		}
		System.out.println(nome); //printamos nome
	}
}
