package roteiro5.parte2;

public class Principal2 {

	public static void main(String[] args) {

		Loja loja01 = new Loja("Lojão da Cidade", "Lojão Comércio LTDA", "11223344");
		Loja loja02 = new Loja("Mercadão do Povo", "", "10101010");
		Loja loja03 = new Loja("Lojão da Cidade", "Lojão Comércio LTDA", "11223344");

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
		 * esse operador verifica se as duas variáveis de referência apontam para o mesmo objeto na memória,
		 * entretanto, não é verificado se os conteúdos são iguais.
		 * 
		 * Além disso, foi utilizado o método ".equals()" para comparar os nomes fantasia das lojas. Portanto,
		 * esse é o método correto para comparar strings, pois verifica se os conteúdos das strings são
		 * iguais.
		 * 
		 * Apesar de possuir valores iguais, no teste 3 o resultado foi "Lojas Diferentes" porque ao comparar
		 * as instâncias das lojas 1 e 3, ambos se referem a objetos diferentes na memória.
		 * 
		 * Ao usar o método ".equals()" para comparar as instâncias, o resultado foi "Lojas diferentes" porque
		 * a classe "Loja" não teve uma implementação personalizada do método ".equals()", portanto, ele se
		 * comporatará da mesma forma que o operador "==", comparando as referências, não o conteúdo. Dessa forma,
		 * o resultado foi "Lojas Diferentes".
		 * 
		 * Por fim, foi utilizado o operador "==" também para comparar os valores de faturamento das lojas. Nesse caso,
		 * isso é apropriado, uma vez que os valores de faturamento são do tipo primitivo "int" e podem ser
		 * comparados com o operador "==", o conteúdo é comparado.
		 * 
		 * NO TESTE 5 É POSSÍVEL UTILZIAR O OPERADOR .EQUALS()?
		 * 
		 * No TESTE 5, não é possível utilizar o método .equals(), porque para comparar valores numéricos,
		 * do tipo primitivo como int, double, entre outros, é apropriado utilizar o operador "==", enquanto que,
		 * para strings, pode-se usar o ".equals()". 
		 */
	}

}
