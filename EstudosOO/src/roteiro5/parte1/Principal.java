package roteiro5.parte1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<Loja> lojas = new ArrayList<Loja>();
		lojas.add(new Loja("Lojão da Orla", "Lojão Comércio LTDA", "35353035"));
		lojas.add(new Loja("Mercadão da Orla", "", "12372381/0000-1"));
		
		JOptionPane.showMessageDialog(null,
				"Razão Social:  " + lojas.get(0).getRazaoSocial() +
				"\n" + "Nome fantasia: " + lojas.get(0).getNomeFantasia() +
				"\n" + "CNPJ: " + lojas.get(0).getCnpj()
				);
		JOptionPane.showMessageDialog(null,
				"Razão Social:  " + lojas.get(1).getRazaoSocial() +
				"\n" + "Nome fantasia: " + lojas.get(1).getNomeFantasia() +
				"\n" + "CNPJ: " + lojas.get(1).getCnpj()
				);
		
	}

}
