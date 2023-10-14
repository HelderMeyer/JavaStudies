package roteiro3.parte2;

import javax.swing.JOptionPane;

public class Programa13 {

	public static void main(String[] args) {
		String stringX = JOptionPane.showInputDialog("Informe o valor de x: ");
		int x = Integer.parseInt(stringX);

		String operator = JOptionPane.showInputDialog("Informe o operador: ");

		String stringY = JOptionPane.showInputDialog("Informe o valor de y: ");
		int y = Integer.parseInt(stringY);

		switch (operator) {
		case "+":
			soma(x, y);
			break;
		case "-":
			subtracao(x, y);
			break;
		case "*":
			multiplicacao(x, y);
			break;
		case "/":
			divisao(x, y);
			break;
		default:
			JOptionPane.showMessageDialog(null, "Operador inválido");
			break;
		}

	}

	public static void soma(double x, double y) {
		JOptionPane.showMessageDialog(null, "Resultado: " + (x + y));
	}

	public static void subtracao(double x, double y) {
		JOptionPane.showMessageDialog(null, "Resultado: " + (x - y));
	}

	public static void multiplicacao(double x, double y) {
		JOptionPane.showMessageDialog(null, "Resultado: " + (x * y));
	}

	public static void divisao(double x, double y) {
		JOptionPane.showMessageDialog(null, "Resultado: " + (x / y));
	}

}
