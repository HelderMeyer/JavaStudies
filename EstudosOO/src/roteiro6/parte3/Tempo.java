package roteiro6.parte3;

public class Tempo {

	private int hora;
	private int minuto;
	private int segundo;
	
	public Tempo(int hora, int minuto, int segundo){
		this.setHora(hora);
		this.setMinuto(minuto);
		this.setSegundo(segundo);
	}
	
	public int getHora() {
		return hora;
	}
	
	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
	
}
