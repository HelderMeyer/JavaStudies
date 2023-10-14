package roteiro3.parte1;

import javax.swing.JOptionPane;

public class Programa11 {

	public static void main(String[] args) {
		String stringSalarioBase = JOptionPane.showInputDialog("Digite o valor do salário-base: ");
		int salarioBase = Integer.parseInt(stringSalarioBase);
		JOptionPane.showMessageDialog(null, "Seu salário final é: R$" + calcularSalarioFinal(salarioBase));
	}
	
	public static double calcularGratificacao(double salarioBase) {
		return salarioBase * 0.05;
	}
	
	public static double calcularImposto(double salarioBase) {
		return salarioBase * 0.07;
	}
	
	public static double calcularSalarioFinal(double salarioBase) {
		return salarioBase + calcularGratificacao(salarioBase) - calcularImposto(salarioBase);
	}

}
