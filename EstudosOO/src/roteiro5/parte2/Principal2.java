package roteiro5.parte2;

public class Principal2 {

	public static void main(String[] args) {

		Loja loja01 = new Loja("Loj�o da Cidade", "Loj�o Com�rcio LTDA", "11223344");
		Loja loja02 = new Loja("Mercad�o do Povo", "", "10101010");
		Loja loja03 = new Loja("Loj�o da Cidade", "Loj�o Com�rcio LTDA", "11223344");

		loja01.setValorFaturamento(10000);
		loja02.setValorFaturamento(20000);
		loja03.setValorFaturamento(10000);

		System.out.println(" ****** Teste 1 ********");
		if (loja01.getNomeFantasia() == loja03.getNomeFantasia()) {
			System.out.println("Lojas Iguais");
		} else {
			System.out.println("Lojas Diferentes");
		}

		System.out.println(" ****** Teste 2 ********");
		if (loja01.getNomeFantasia().equals(loja03.getNomeFantasia())) {
			System.out.println("Lojas Iguais");
		} else {
			System.out.println("Lojas Diferentes");
		}

		System.out.println(" ****** Teste 3 ********");
		if (loja01 == loja03) {
			System.out.println("Lojas Iguais");
		} else {
			System.out.println("Lojas Diferentes");
		}

		System.out.println(" ****** Teste 4 ********");
		if (loja01.equals(loja02)) {
			System.out.println("Lojas Iguais");
		} else {
			System.out.println("Lojas Diferentes");
		}

		System.out.println(" ****** Teste 5 ********");
		if (loja01.getValorFaturamento() == loja03.getValorFaturamento()) {
			System.out.println("Faturamentos Iguais");
		} else {
			System.out.println("Faturamentos Diferentes");
		}
		
		/*
		 * 
		 * O QUE CONSEGUIU CONCLUIR SOBRE OS TESTES FEITOS?
		 * 
		 * Foi utilizado o operador "==" para comparar os nomes fantasia das lojas, uma vez que
		 * esse operador verifica se as duas vari�veis de refer�ncia apontam para o mesmo objeto na mem�ria,
		 * entretanto, n�o � verificado se os conte�dos s�o iguais.
		 * 
		 * Al�m disso, foi utilizado o m�todo ".equals()" para comparar os nomes fantasia das lojas. Portanto,
		 * esse � o m�todo correto para comparar strings, pois verifica se os conte�dos das strings s�o
		 * iguais.
		 * 
		 * Apesar de possuir valores iguais, no teste 3 o resultado foi "Lojas Diferentes" porque ao comparar
		 * as inst�ncias das lojas 1 e 3, ambos se referem a objetos diferentes na mem�ria.
		 * 
		 * Ao usar o m�todo ".equals()" para comparar as inst�ncias, o resultado foi "Lojas diferentes" porque
		 * a classe "Loja" n�o teve uma implementa��o personalizada do m�todo ".equals()", portanto, ele se
		 * comporatar� da mesma forma que o operador "==", comparando as refer�ncias, n�o o conte�do. Dessa forma,
		 * o resultado foi "Lojas Diferentes".
		 * 
		 * Por fim, foi utilizado o operador "==" tamb�m para comparar os valores de faturamento das lojas. Nesse caso,
		 * isso � apropriado, uma vez que os valores de faturamento s�o do tipo primitivo "int" e podem ser
		 * comparados com o operador "==", o conte�do � comparado.
		 * 
		 * NO TESTE 5 � POSS�VEL UTILZIAR O OPERADOR .EQUALS()?
		 * 
		 * No TESTE 5, n�o � poss�vel utilizar o m�todo .equals(), porque para comparar valores num�ricos,
		 * do tipo primitivo como int, double, entre outros, � apropriado utilizar o operador "==", enquanto que,
		 * para strings, pode-se usar o ".equals()". 
		 */
	}

}
