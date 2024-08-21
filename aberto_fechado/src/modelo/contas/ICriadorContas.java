package modelo.src.modelo.contas;

import modelo.src.modelo.empregado.Empregado;
import modelo.src.modelo.candidato.ICandidato;

public interface ICriadorContas {

    public Empregado criar(ICandidato candidato);

}
