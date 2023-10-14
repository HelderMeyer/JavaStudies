package roteiro2.parte4;

import javax.swing.JOptionPane;

public class Programa08 {

	public static void main(String[] args) {
		int[] vetorNotas = new int[5];
		
		for(int contador = 0; contador < vetorNotas.length; contador++) {
			String stringNota = JOptionPane.showInputDialog("Informe uma nota: ");
			int nota = Integer.parseInt(stringNota);
			
			vetorNotas[contador] = nota;
		}
		for(int contador = 0; contador < vetorNotas.length; contador++) {
			JOptionPane.showMessageDialog(null, vetorNotas[contador]);
		}
	}

}
