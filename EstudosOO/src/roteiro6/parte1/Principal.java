package roteiro6.parte1;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		Ligacao ligacao = new Ligacao("121212", "565656", "A", "B", "10:15:02", "10:20:35");
		JOptionPane.showMessageDialog(null, 
				"Detalhes da liga��o: " + 
				"\n" + "N�mero de Origem: " + ligacao.getNumeroOrigem() +
				"\n" + "N�mero de Destino: " + ligacao.getNumeroDestino() +
				"\n" + "Local Origem: " + ligacao.getLocalOrigem() +
				"\n" + "Local Destino: " + ligacao.getLocalDestino() +
				"\n" + "Hora In�cio: " + ligacao.getHoraInicio() +
				"\n" + "Hora Fim: " + ligacao.getHoraFim()
				);
				
	}

}
