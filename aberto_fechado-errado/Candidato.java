package modelo;

public class Candidato {

	private String nome;
	private String sobrenome;

	private  TipoCandidato tipoCandidato;




	public Candidato(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	public Candidato(String nome, String sobrenome, TipoCandidato tipoCandidato) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.tipoCandidato = tipoCandidato;
	}

	public TipoCandidato getTipoCandidato() {
		return tipoCandidato;
	}

	public void setTipoCandidato(TipoCandidato tipoCandidato) {
		this.tipoCandidato = tipoCandidato;
	}

	public String getNome() {
		return nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
}
