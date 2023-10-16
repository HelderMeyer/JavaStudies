package roteiro5.parte3;

public class Loja {

	private String nomeFantasia;
	private String razaoSocial;
	private String cnpj;
	private double valorFaturamento;
	private double area;
	private String nomeProprietario;

	Loja(String nomeFantasia, String razaoSocial, String cnpj) {
		this.setNomeFantasia(nomeFantasia);
		this.setRazaoSocial(razaoSocial);
		this.setCnpj(cnpj);
	}

	Loja(String nomeFantasia, String cnpj) {
		this(nomeFantasia, nomeFantasia, cnpj);
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

	public static String compararFat_static(Loja lojaA, Loja lojaB) {

		if (lojaA.getValorFaturamento() > lojaB.getValorFaturamento()) {
			return lojaA.nomeFantasia;
		} else {
			return lojaB.nomeFantasia;
		}
	}

	public String compararFat_naoStatic(Loja lojaB) {

		if (this.getValorFaturamento() > lojaB.getValorFaturamento()) {
			return this.nomeFantasia;
		} else {
			return lojaB.nomeFantasia;
		}
		
	}

}
