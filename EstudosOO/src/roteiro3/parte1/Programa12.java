package roteiro3.parte1;

import javax.swing.JOptionPane;

public class Programa12 {

	public static void main(String[] args) {
		String stringSalarioBase = JOptionPane.showInputDialog("Digite o valor do sal�rio-base: ");
		int salarioBase = Integer.parseInt(stringSalarioBase);
		JOptionPane.showMessageDialog(null, "Seu sal�rio final �: R$" + calcularSalarioFinal(salarioBase));
	}

	public static double calcularGratificacaoEImposto(double salarioBase, double porcentagem) {
		return salarioBase * porcentagem;
	}

	public static double calcularSalarioFinal(double salarioBase) {
		return salarioBase + calcularGratificacaoEImposto(salarioBase, 0.05)
		- calcularGratificacaoEImposto(salarioBase, 0.07);
	}

	// O modificador static indica que o m�todo pertence � pr�pria classe e n�o a
	// uma inst�ncia espec�fica dela. Isso permite que eu chame diretamente na
	// pr�pria classe sem instanciar o objeto.
}
