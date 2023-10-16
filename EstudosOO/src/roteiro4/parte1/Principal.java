package roteiro4.parte1;

public class Principal {

	public static void main(String[] args) {

		Aluno aluno01 = new Aluno();
		aluno01.matricula = 111;
		aluno01.nome = "Helder";
		aluno01.curso = "Engenharia da Computação";
		aluno01.anoIngresso = 2019;
		
		Aluno aluno02 = new Aluno();
		aluno02.matricula = 222;
		aluno02.nome = "Sarah";
		aluno02.curso = "Psicologia";
		aluno02.anoIngresso = 2023;
		
		System.out.println("=========================================");
		System.out.println("Matrícula: " + aluno01.matricula);
		System.out.println("Nome: " + aluno01.nome);
		System.out.println("Curso: " + aluno01.curso);
		System.out.println("Ano Ingresso: " + aluno01.anoIngresso);
		System.out.println("=========================================");
		System.out.println("Matrícula: " + aluno02.matricula);
		System.out.println("Nome: " + aluno02.nome);
		System.out.println("Curso: " + aluno02.curso);
		System.out.println("Ano Ingresso: " + aluno02.anoIngresso);
		System.out.println("=========================================");
		
	}

}
