package roteiro2.parte4;

import javax.swing.JOptionPane;

public class Programa09 {

	public static void main(String[] args) {
		int[] vetorNotas = new int[5];
		int quantidadeNotasAcimaMedia = 0;
		int quantidadeNotasAbaixoMedia = 0;
		double somaNotas = 0;
		double mediaNotas;

		for (int contador = 0; contador < vetorNotas.length; contador++) {
			String stringNota = JOptionPane.showInputDialog("Informe uma nota: ");
			int nota = Integer.parseInt(stringNota);
			while (nota < 0 || nota > 10) {
				JOptionPane.showMessageDialog(null, "Nota inválida. Por favor, insira uma nota entre 0 - 10.");
				stringNota = JOptionPane.showInputDialog("Informe uma nota: ");
				nota = Integer.parseInt(stringNota);
			}
			vetorNotas[contador] = nota;
			if (vetorNotas[contador] >= 7) {
				quantidadeNotasAcimaMedia += 1;

			} else {
				quantidadeNotasAbaixoMedia += 1;
			}
			somaNotas += vetorNotas[contador];
		}
		for (int contador = 0; contador < vetorNotas.length; contador++) {
			JOptionPane.showMessageDialog(null, vetorNotas[contador]);
		}
		mediaNotas = somaNotas/vetorNotas.length;
		JOptionPane.showMessageDialog(null, "Média: " + mediaNotas);
		JOptionPane.showMessageDialog(null, "Quantidade de notas acima da média: " + quantidadeNotasAcimaMedia + "/5");
		JOptionPane.showMessageDialog(null,"Quantidade de notas abaixo da média: " + quantidadeNotasAbaixoMedia + "/5");
	}

}
