public class Autoboxing{
	public static void main(String[] args){

		//Antigo
		Integer x = new Integer(555);// Integer empacotado
		int a = x.intValue();// desempacotando
		a++;//incrementando
		x = new Integer(a); //empacotando
		System.out.println(x.intValue()); //desempacotando

		//Novo - desempacotando, incrementando e reempacotando
		Integer y = 555;
		y++;
		System.out.println(y);

	}
}