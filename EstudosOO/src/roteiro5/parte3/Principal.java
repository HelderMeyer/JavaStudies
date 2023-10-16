package roteiro5.parte3;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		ArrayList<Loja> lojas = new ArrayList<Loja>();
		lojas.add(new Loja("Loj�o da Cidade", "Loj�o Com�rcio LTDA", "11223344"));
		lojas.add(new Loja("Mercad�o do Povo", "10101010"));
		lojas.add(new Loja("Loj�o da Cidade", "Loj�o Com�rcio LTDA", "11223344"));
		lojas.get(0).setValorFaturamento(10000);
		lojas.get(1).setValorFaturamento(20000);
		lojas.get(2).setValorFaturamento(10000);

		System.out.println(" ****** Compara��o com m�todo est�tico ********");
		System.out.println(Loja.compararFat_static(lojas.get(0), lojas.get(1)));

		System.out.println(" ****** Compara��o com m�todo N�O est�tico ********");
		System.out.println(lojas.get(0).compararFat_naoStatic(lojas.get(1)));
		
		System.out.println(" ****** Compara��o com m�todo N�O est�tico ********");
		System.out.println(lojas.get(1).compararFat_naoStatic(lojas.get(0)));

		/*
		 * Tendo um m�todo est�tico (static), � poss�vel utiliz�-lo diretamente na
		 * classe. Entretanto, utilizando o m�todo n�o est�tico, voc� s� pode us�-lo no
		 * objeto instaciado.
		 */

	}

}
