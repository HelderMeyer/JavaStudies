package roteiro4.parte3;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		Aluno aluno01 = new Aluno(111, "Helder", "Engenharia da Computação", 2019);
		Aluno aluno02 = new Aluno(222, "Sarah", "Psicologia", 2023);

		JOptionPane.showMessageDialog(null, 
				"ALUNO 1" +
				"\n" + "Matrícula: " + aluno01.getMatricula() + 
				"\n" + "Nome: " + aluno01.getNome() + 
				"\n" + "Curso: " + aluno01.getCurso() + 
				"\n" + "Ano Ingresso: " + aluno01.getAnoIngresso());
		
		JOptionPane.showMessageDialog(null, 
				"ALUNO 2" +
				"\n" + "Matrícula: " + aluno02.getMatricula() + 
				"\n" + "Nome: " + aluno02.getNome() + 
				"\n" + "Curso: " + aluno02.getCurso() + 
				"\n" + "Ano Ingresso: " + aluno02.getAnoIngresso());

	}

}
