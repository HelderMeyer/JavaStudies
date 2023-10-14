package roteiro2.parte2;

import javax.swing.JOptionPane;

public class Programa03 {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Informe o seu nome: ");
		String stringIdade = JOptionPane.showInputDialog("Informe sua idade: ");
		int idade = Integer.parseInt(stringIdade);
		
		System.out.println("Nome informado: " + nome);
		System.out.println("Idade informada: " + idade);
		
		JOptionPane.showMessageDialog(null, "Nome informado: " + nome);
		JOptionPane.showMessageDialog(null, "Idade informada: " + idade);
		
	}

}
