package roteiro2.parte3;

import javax.swing.JOptionPane;

public class Programa05 {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			String stringNota = JOptionPane.showInputDialog("Informe uma nota: ");
			int nota = Integer.parseInt(stringNota);

			if (nota >= 7) {
				JOptionPane.showMessageDialog(null, "Você foi aprovado com " + nota + " pontos.");
			} else {
				JOptionPane.showMessageDialog(null, "Você foi reprovado com " + nota + " pontos.");
			}
		}
	}

}
