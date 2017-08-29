import java.util.ArrayList;
public class Fluxo {
	public static void main(String[] args) {
		//Foreach - Percorrer elementos dentro de um array ou de um Arraylist
		//Limitações: So percorre para frente

		//Normal
		int[] pares = {2, 4, 6, 8};
		for (int i=0; i<pares.length; i++) {
			int par = pares[i];
			System.out.println(par);
		}

		//podemos fazer assim
		for(int par : pares){ //Percorre "pares" para cada elemento da variavel "par"
			System.out.print(par + ",");
		}

		//Ou Assim
		ArrayList<Integer> lista = new ArrayList<Integer>();
		for (int i=0;i<10;i++ ) {
			lista.add(i); // Adicionou os numeros do "for" na ArrayList
		}
		for(int listas : lista){ // Percorreu a lista para cada elemento em lista
			System.out.println(listas);
		}
	}
}