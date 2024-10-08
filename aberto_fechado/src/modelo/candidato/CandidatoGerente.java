package modelo.src.modelo.candidato;

import modelo.src.modelo.contas.CriadorContasGerente;
import modelo.src.modelo.contas.ICriadorContas;

public class CandidatoGerente implements ICandidato{


    private String nome;
    private String sobrenome;

    public CandidatoGerente(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    @Override
    public String getNome() {
        return nome;
    }
    @Override
    public String getSobrenome() {
        return sobrenome;
    }

    @Override
    public ICriadorContas obterCriadorContas() {
        return new CriadorContasGerente();
    }

}
