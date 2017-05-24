import javax.swing.JOptionPane;
public class Imc{

	public static void main(String[] args) {
		
		String peso = JOptionPane.showInputDialog("Qual o seu peso");
		double pesoDouble = Double.parseDouble(peso);

		String altura = JOptionPane.showInputDialog("Qual a sua altura");
		double alturaDouble = Double.parseDouble(altura);

		Double imc = new Double(pesoDouble/(alturaDouble * alturaDouble));
		String msg = (imc >=  20) && (imc <= 25) ? "Peso ideal" : "Fora do peso ideal";

		msg = "IMC = " + imc + "\n" + msg; 

		JOptionPane.showMessageDialog(null, msg);
	}
}