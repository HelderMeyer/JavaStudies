package roteiro3.parte2;

import javax.swing.JOptionPane;

public class Programa14 {
	
	public static void main(String[] args) {
		String stringX = JOptionPane.showInputDialog("Informe o valor de x: ");
		int x = Integer.parseInt(stringX);

		String operator = JOptionPane.showInputDialog("Informe o operador: ");
		
		String stringY = JOptionPane.showInputDialog("Informe o valor de y: ");
		int y = Integer.parseInt(stringY);

		switch (operator) {
		case "+":
			JOptionPane.showMessageDialog(null, x + " + " + y + " = " + soma(x,y));
			break;
		case "-":
			JOptionPane.showMessageDialog(null, x + " - " + y + " = " + subtracao(x,y));
			break;
		case "*":
			JOptionPane.showMessageDialog(null, x + " * " + y + " = " + multiplicacao(x,y));
			break;
		case "/":
			JOptionPane.showMessageDialog(null, x + " / " + y + " = " + divisao(x,y));
			break;
		default:
			JOptionPane.showMessageDialog(null, "Operador inválido");
			break;
		}

	}

	public static double soma(double x, double y) {
		return x + y;
	}

	public static double subtracao(double x, double y) {
		return x - y;
	}

	public static double multiplicacao(double x, double y) {
		return x * y;
	}

	public static double divisao(double x, double y) {
		return x / y;
	}

}
