package roteiro6.parte3;

public class Ligacao {

	private String numeroOrigem;
	private String numeroDestino;
	private String localOrigem;
	private String localDestino;
	private Tempo horaInicio;
	private Tempo horaFim;

	public Ligacao(String numeroOrigem, String numeroDestino, String localOrigem, String localDestino, Tempo horaInicio,
			Tempo horaFim) {
		this.numeroOrigem = numeroOrigem;
		this.numeroDestino = numeroDestino;
		this.localOrigem = localOrigem;
		this.localDestino = localDestino;
		this.horaInicio = horaInicio;
		this.horaFim = horaFim;
	}

	public String getNumeroOrigem() {
		return numeroOrigem;
	}

	public void setNumeroOrigem(String numeroOrigem) {
		this.numeroOrigem = numeroOrigem;
	}

	public String getNumeroDestino() {
		return numeroDestino;
	}

	public void setNumeroDestino(String numeroDestino) {
		this.numeroDestino = numeroDestino;
	}

	public String getLocalOrigem() {
		return localOrigem;
	}

	public void setLocalOrigem(String localOrigem) {
		this.localOrigem = localOrigem;
	}

	public String getLocalDestino() {
		return localDestino;
	}

	public void setLocalDestino(String localDestino) {
		this.localDestino = localDestino;
	}

	public String getHoraInicio() {
		return horaInicio.getHora() + ":" + horaInicio.getMinuto() + ":" + horaInicio.getSegundo();
	}

	public void setHoraInicio(Tempo horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getHoraFim() {
		return horaFim.getHora() + ":" + horaFim.getMinuto() + ":" + horaFim.getSegundo();
	}

	public void setHoraFim(Tempo horaFim) {
		this.horaFim = horaFim;
	}

	public String verificarNumero(String numero) {
		if (numero.equals(this.numeroOrigem)) {
			return "O número informado é de origem.";
		} else if (numero.equals(this.numeroDestino)) {
			return "O número informado é de destino.";
		} else {
			return "Esse número não existe na ligação.";
		}
	}

	public String calcularValorLigacao() {
		int horaInicial = horaInicio.getHora();
		int horaFinal = horaFim.getHora();
		int totalHoras = (horaFinal - horaInicial) * 60;
		int minutoInicial = horaInicio.getMinuto();
		int minutoFinal = horaFim.getMinuto();
		int totalMinutos = minutoFinal - minutoInicial;
		int segundoInicial = horaInicio.getSegundo();
		int segundoFinal = horaFim.getSegundo();
		int totalsegundos = segundoFinal - segundoInicial;
		int calculo = totalHoras + totalMinutos;
		if (totalsegundos > 0) {
			calculo++;
		}
		if (totalMinutos == 0 && totalsegundos < 0) {
			calculo--;
		}
		String Total = "R$" + calculo;
		return Total;
	}

	/*
	 * public String getTotalPagar() { int horaInicial = horaInicio.getHora(); int
	 * horaFinal = horaFim.getHora(); int totalHoras = (horaFinal - horaInicial) *
	 * 60; int minutoInicial = horaInicio.getMinuto(); int minutoFinal =
	 * horaFim.getMinuto(); int totalMinutos = minutoFinal - minutoInicial; int
	 * segundoInicial = horaInicio.getSegundo(); int segundoFinal =
	 * horaFim.getSegundo(); int totalsegundos = segundoFinal - segundoInicial; int
	 * calculo = totalHoras + totalMinutos; if (totalsegundos > 0) { calculo++; } if
	 * (totalMinutos == 0 && totalsegundos < 0) { calculo--; } String Total = "R$" +
	 * calculo; return Total; }
	 */

}
