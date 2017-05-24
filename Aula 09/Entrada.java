//Adicionando interface grafica
import javax.swing.JOptionPane;

public class Entrada {
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual o seu nome"); //Criamos uma variavel com uma chamada de dados de uma interface grafica
		JOptionPane.showMessageDialog(null, "Seu nome é muito bonito " + nome); //fazemos a classe JOptionPane mostrar um mensagem
		System.out.println(nome); //Printamos o resultado da variavel nome
	}
}