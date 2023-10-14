package roteiro3.parte1;

import javax.swing.JOptionPane;

public class Programa12 {

	public static void main(String[] args) {
		String stringSalarioBase = JOptionPane.showInputDialog("Digite o valor do salário-base: ");
		int salarioBase = Integer.parseInt(stringSalarioBase);
		JOptionPane.showMessageDialog(null, "Seu salário final é: R$" + calcularSalarioFinal(salarioBase));
	}

	public static double calcularGratificacaoEImposto(double salarioBase, double porcentagem) {
		return salarioBase * porcentagem;
	}

	public static double calcularSalarioFinal(double salarioBase) {
		return salarioBase + calcularGratificacaoEImposto(salarioBase, 0.05)
		- calcularGratificacaoEImposto(salarioBase, 0.07);
	}

	// O modificador static indica que o método pertence à própria classe e não a
	// uma instância específica dela. Isso permite que eu chame diretamente na
	// própria classe sem instanciar o objeto.
}
