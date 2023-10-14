package roteiro2.parte5;

import java.util.Random;

import javax.swing.JOptionPane;

public class Adivinha {

	public static void main(String[] args) {
		//Gerar um número secreto aleatório entre 1 e 100.
		Random random = new Random();
		boolean flag = true;
		int numeroSecreto = random.nextInt(100);
		if (numeroSecreto == 0) {
			numeroSecreto = 1;
		}
		while(flag) {
			String stringNumero = JOptionPane.showInputDialog("Qual é o número secreto (1 a 100): ");
			int numero = Integer.parseInt(stringNumero);
			if(numero == numeroSecreto) {
				JOptionPane.showMessageDialog(null, "Parabéns, você acertou! O número secreto é " + numeroSecreto);
				flag = false;
			}else {
				if(numero < numeroSecreto) {
					JOptionPane.showMessageDialog(null, "Tente novamente. É um número maior.");
				}else {
					JOptionPane.showMessageDialog(null, "Tente novamente. É um número menor.");
				}
			}
		}
	}

}
