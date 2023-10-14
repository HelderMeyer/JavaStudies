package roteiro2.parte1;

import java.util.Scanner;

public class Programa02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o seu nome: ");
		String nome =  scan.nextLine();
		
		System.out.println("Informe o seu sobrenome: ");
		String sobrenome = scan.nextLine();
		
		System.out.println("Informe a sua idade: ");
		int idade = scan.nextInt();
		scan.nextLine(); //Para resetar o scan
		
		System.out.println("Curso de graduação: ");
		String curso = scan.nextLine();
		
		System.out.println("O nome informado é " + nome);
		System.out.println("O sobrenome informado é " + sobrenome);
		System.out.println("A idade informada é " + idade + " anos");
		System.out.println("O curso informado é " + curso);
		
		scan.close();
	}

}
