package roteiro5.parte3;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		ArrayList<Loja> lojas = new ArrayList<Loja>();
		lojas.add(new Loja("Lojão da Cidade", "Lojão Comércio LTDA", "11223344"));
		lojas.add(new Loja("Mercadão do Povo", "10101010"));
		lojas.add(new Loja("Lojão da Cidade", "Lojão Comércio LTDA", "11223344"));
		lojas.get(0).setValorFaturamento(10000);
		lojas.get(1).setValorFaturamento(20000);
		lojas.get(2).setValorFaturamento(10000);

		System.out.println(" ****** Comparação com método estático ********");
		System.out.println(Loja.compararFat_static(lojas.get(0), lojas.get(1)));

		System.out.println(" ****** Comparação com método NÃO estático ********");
		System.out.println(lojas.get(0).compararFat_naoStatic(lojas.get(1)));
		
		System.out.println(" ****** Comparação com método NÃO estático ********");
		System.out.println(lojas.get(1).compararFat_naoStatic(lojas.get(0)));

		/*
		 * Tendo um método estático (static), é possível utilizá-lo diretamente na
		 * classe. Entretanto, utilizando o método não estático, você só pode usá-lo no
		 * objeto instaciado.
		 */

	}

}
