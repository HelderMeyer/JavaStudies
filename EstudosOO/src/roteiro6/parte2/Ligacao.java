package roteiro6.parte2;

public class Ligacao {

	private String numeroOrigem;
	private String numeroDestino;
	private String localOrigem;
	private String localDestino;
	private Tempo horaInicio;
	private Tempo horaFim;
	
	public Ligacao(String numeroOrigem, String numeroDestino, String localOrigem, String localDestino, Tempo horaInicio, Tempo horaFim){
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
	
}
