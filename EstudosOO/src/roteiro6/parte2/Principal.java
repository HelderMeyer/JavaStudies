package roteiro6.parte2;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		//10:15:02
		//10:20:35
		Ligacao ligacao = new Ligacao("121212", "565656", "A", "B", new Tempo(10,15,02), new Tempo(10,20,35));
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
