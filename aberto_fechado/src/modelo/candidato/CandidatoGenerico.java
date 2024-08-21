package modelo.src.modelo.candidato;

import modelo.src.modelo.contas.CriadorContasGenerico;
import modelo.src.modelo.contas.ICriadorContas;

public class CandidatoGenerico implements ICandidato {

	private String nome;
	private String sobrenome;
	
	public CandidatoGenerico(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}	
	
	public String getNome() {
		return nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}

	public ICriadorContas obterCriadorContas(){
		return new CriadorContasGenerico();
	}
}
