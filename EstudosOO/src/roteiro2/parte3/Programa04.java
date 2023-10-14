package roteiro2.parte3;

import javax.swing.JOptionPane;

public class Programa04 {

	public static void main(String[] args) {

		int contador = 0;
		while (contador < 5) {
			String stringNota = JOptionPane.showInputDialog("Informe uma nota: ");
			int nota = Integer.parseInt(stringNota);

			if (nota >= 7) {
				JOptionPane.showMessageDialog(null, "Você foi aprovado com " + nota + " pontos.");
			} else {
				JOptionPane.showMessageDialog(null, "Você foi reprovado com " + nota + " pontos.");
			}
			contador++;
		}
	}

}
