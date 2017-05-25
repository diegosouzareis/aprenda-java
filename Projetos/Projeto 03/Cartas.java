import java.util.Random;
public class Cartas{
	public static void main(String[] args) {
		
		String[] faces = {"A", "1", "2", "3", "4"};
		String[] nipes = {"Espadas", "Copas", "Paus"};

		Random r = new Random();

		int indiceFace = r.nextInt(faces.length);
		String face = faces[indiceFace];

		int indiceNipes = r.nextInt(nipes.length);
		String nipe = nipes[indiceNipes];

		String carta = face + " de " + nipe;

		System.out.println(carta);

	}
}