package roteiro2.parte3;

import javax.swing.JOptionPane;

public class Programa07 {

	public static void main(String[] args) {
		boolean flag = true;
		double contador = 0;
		double somaNotas = 0;
		double mediaNotas = 0;
		
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
				somaNotas += nota;
				contador += 1;
			}
		}
		mediaNotas = somaNotas/contador;
		JOptionPane.showMessageDialog(null, "A média das notas é: " + mediaNotas);
	}

}
