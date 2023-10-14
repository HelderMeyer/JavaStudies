package roteiro3.parte1;

import javax.swing.JOptionPane;

public class Programa10 {

	public static void main(String[] args) {
		String stringSalarioBase = JOptionPane.showInputDialog("Digite o valor do salário-base: ");
		int salarioBase = Integer.parseInt(stringSalarioBase);
		double gratificacao = salarioBase * 0.05;
		double imposto = salarioBase * 0.07;
		double salarioFinal = salarioBase + gratificacao - imposto;
		JOptionPane.showMessageDialog(null, "Seu salário final é: R$" + salarioFinal);
	}

}
