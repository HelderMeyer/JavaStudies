package roteiro5.parte2;

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

		System.out.println(" ****** Teste 1 ********");
		if (lojas.get(0).getNomeFantasia() == lojas.get(2).getNomeFantasia()) {
			System.out.println("Lojas Iguais");
		} else {
			System.out.println("Lojas Diferentes");
		}

		System.out.println(" ****** Teste 2 ********");
		if (lojas.get(0).getNomeFantasia().equals(lojas.get(2).getNomeFantasia())) {
			System.out.println("Lojas Iguais");
		} else {
			System.out.println("Lojas Diferentes");
		}

		System.out.println(" ****** Teste 3 ********");
		if (lojas.get(0) == lojas.get(2)) {
			System.out.println("Lojas Iguais");
		} else {
			System.out.println("Lojas Diferentes");
		}

		System.out.println(" ****** Teste 4 ********");
		if (lojas.get(0).equals(lojas.get(2))) {
			System.out.println("Lojas Iguais");
		} else {
			System.out.println("Lojas Diferentes");
		}

		System.out.println(" ****** Teste 5 ********");
		if (lojas.get(0).getValorFaturamento() == lojas.get(2).getValorFaturamento()) {
			System.out.println("Faturamentos Iguais");
		} else {
			System.out.println("Faturamentos Diferentes");
		}
		
	}

}
