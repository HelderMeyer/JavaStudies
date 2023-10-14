package roteiro2.parte3;

import javax.swing.JOptionPane;

public class Programa06 {

	public static void main(String[] args) {

		boolean flag = true;

		while (flag) {
			String stringNota = JOptionPane.showInputDialog("Informe a nota do aluno: ");
			int nota = Integer.parseInt(stringNota);
			if (nota == -1) {
				JOptionPane.showMessageDialog(null, "Fim da operação!");
				flag = false;
			} else {
				if (nota >= 7) {
					JOptionPane.showMessageDialog(null, "Aprovado");
				} else {
					JOptionPane.showMessageDialog(null, "Reprovado");
				}
			}
		}

	}

}
