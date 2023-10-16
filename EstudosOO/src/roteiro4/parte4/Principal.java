package roteiro4.parte4;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String nomeAluno = JOptionPane.showInputDialog("Digite o nome do aluno(a): ");
		String stringMatricula = JOptionPane.showInputDialog("Digite a matrícula do aluno(a): ");
		int matricula = Integer.parseInt(stringMatricula);
		String curso = JOptionPane.showInputDialog("Digite o curso do aluno(a): ");
		String stringAnoIngresso = JOptionPane.showInputDialog("Digite o ano de ingresso: ");
		int anoIngresso = Integer.parseInt(stringAnoIngresso);
		
		Aluno aluno = new Aluno(matricula, nomeAluno, curso, anoIngresso);
		String stringQuantidadeDisciplinas = JOptionPane.showInputDialog("Digite a quantidade de disciplinas de " + aluno.getNome() + ":");
		int quantidadeDisciplinas = Integer.parseInt(stringQuantidadeDisciplinas);
		while(quantidadeDisciplinas < 0) {
			JOptionPane.showMessageDialog(null, "Número de disciplinas inválido!");
			stringQuantidadeDisciplinas = JOptionPane.showInputDialog("Por favor, digite a quantidade de disciplinas de " + aluno.getNome() + ":");
			quantidadeDisciplinas = Integer.parseInt(stringQuantidadeDisciplinas);
		}
		aluno.setQuantidadeDisciplinas(quantidadeDisciplinas);
		
		JOptionPane.showMessageDialog(null, 
				"ALUNO 1" +
				"\n" + "=====================================" +
				"\n" + "Matrícula: " + aluno.getMatricula() + 
				"\n" + "Nome: " + aluno.getNome() + 
				"\n" + "Curso: " + aluno.getCurso() + 
				"\n" + "Ano Ingresso: " + aluno.getAnoIngresso() +
				"\n" + "Quantidade de matérias: " + aluno.getQuantidadeDisciplinas() +
				"\n" + "Situação: " + aluno.getSituacao() +
				"\n" + "=====================================");

	}

}
