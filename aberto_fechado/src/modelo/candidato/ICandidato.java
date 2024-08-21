package modelo.src.modelo.candidato;

import modelo.src.modelo.contas.ICriadorContas;

public interface ICandidato {

    String getNome();
    String getSobrenome();

    ICriadorContas obterCriadorContas();

}
