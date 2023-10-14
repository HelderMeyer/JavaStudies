package roteiro2.parte5;

import java.util.Random;

import javax.swing.JOptionPane;

public class Adivinha {

	public static void main(String[] args) {
		//Gerar um n�mero secreto aleat�rio entre 1 e 100.
		Random random = new Random();
		boolean flag = true;
		int numeroSecreto = random.nextInt(100);
		if (numeroSecreto == 0) {
			numeroSecreto = 1;
		}
		while(flag) {
			String stringNumero = JOptionPane.showInputDialog("Qual � o n�mero secreto (1 a 100): ");
			int numero = Integer.parseInt(stringNumero);
			if(numero == numeroSecreto) {
				JOptionPane.showMessageDialog(null, "Parab�ns, voc� acertou! O n�mero secreto � " + numeroSecreto);
				flag = false;
			}else {
				if(numero < numeroSecreto) {
					JOptionPane.showMessageDialog(null, "Tente novamente. � um n�mero maior.");
				}else {
					JOptionPane.showMessageDialog(null, "Tente novamente. � um n�mero menor.");
				}
			}
		}
	}

}
