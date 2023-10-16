package roteiro4.parte4;

public class Aluno {

	private int matricula;
	private String nome;
	private String curso;
	private int anoIngresso;
	private int quantidadeDisciplinas;
	private String situacao;
	
	Aluno(int matricula, String nome, String curso, int anoIngresso) {
		this.setMatricula(matricula);
		this.setNome(nome);
		this.setCurso(curso);
		this.setAnoIngresso(anoIngresso);
		this.setSituacao(curso);;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getAnoIngresso() {
		return anoIngresso;
	}

	public void setAnoIngresso(int anoIngresso) {
		this.anoIngresso = anoIngresso;
	}

	public int getQuantidadeDisciplinas() {
		return quantidadeDisciplinas;
	}

	public void setQuantidadeDisciplinas(int quantidadeDisciplinas) {
		this.quantidadeDisciplinas = quantidadeDisciplinas;
	}

	public String getSituacao() {
		if(this.quantidadeDisciplinas >= 1) {
			this.situacao = "Matriculado";
		}else {
			this.situacao = "Não Matriculado";
		}
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
}
