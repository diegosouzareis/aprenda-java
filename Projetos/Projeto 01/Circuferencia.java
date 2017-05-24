//Projeto: Calculo da circuferencia
import java.util.Scanner;
public class Circuferencia{
	public static void main(String[] args){

		Scanner usuario = new Scanner(System.in);
		System.out.println("Qual o raio da circuferencia?");
		Double raio = usuario.nextDouble(); 

		//Diametro
		// D = 2.r
		double diametro = 2 * raio;
		System.out.println(diametro);

		//Circuferencia
		//C = 2.π.r
		double pi = Math.PI;
		double circuferencia = 2 * pi * raio;
		System.out.println(circuferencia);

		//Area
		//A = π·r²
		double area = pi * (raio * raio);
		System.out.println(area);

	}
}