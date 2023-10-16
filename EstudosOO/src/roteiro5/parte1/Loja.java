package roteiro5.parte1;

public class Loja {

	private String nomeFantasia;
	private String razaoSocial;
	private String cnpj;
	private double valorFaturamento;
	private double area;
	private String nomeProprietario;

	Loja(String nomeFantasia, String razaoSocial, String cnpj) {
		this.setNomeFantasia(nomeFantasia);
		if (razaoSocial.equals("")) {
			this.setRazaoSocial(nomeFantasia);
		} else {
			this.setRazaoSocial(razaoSocial);
		}
		this.setCnpj(cnpj);
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public double getValorFaturamento() {
		return valorFaturamento;
	}

	public void setValorFaturamento(double valorFaturamento) {
		this.valorFaturamento = valorFaturamento;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

}
