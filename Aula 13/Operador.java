//Operadores logicos
public class Operador {
	
	public static void main(String[] args){

		int x  = 5;

		System.out.println((x == 5) && (x >= 5)); // && = AND, So se os dois forem verdadeiros, retornão true, se apenas um for false, tudo retorna false
		System.out.println((x == 5) || (x >= 5)); // || = OR, Se um for true e outro false(ou outros false), retorna true, se todos forem true, retorna true, se todos forem false, retorna false
		System.out.println(!(x >= 9)); //Operador de negação, se for true, retorna false, se for false retorna true

	}
}