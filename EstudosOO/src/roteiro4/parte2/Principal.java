package roteiro4.parte2;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		Aluno aluno01 = new Aluno(111, "Helder", "Engenharia da Computação", 2019);
		Aluno aluno02 = new Aluno(222, "Sarah", "Psicologia", 2023);

		JOptionPane.showMessageDialog(null, 
				"ALUNO 1" +
				"\n" + "Matrícula: " + aluno01.matricula + 
				"\n" + "Nome: " + aluno01.nome + 
				"\n" + "Curso: " + aluno01.curso + 
				"\n" + "Ano Ingresso: " + aluno01.anoIngresso);
		
		JOptionPane.showMessageDialog(null, 
				"ALUNO 2" +
				"\n" + "Matrícula: " + aluno02.matricula + 
				"\n" + "Nome: " + aluno02.nome + 
				"\n" + "Curso: " + aluno02.curso + 
				"\n" + "Ano Ingresso: " + aluno02.anoIngresso);

	}

}
