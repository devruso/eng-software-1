package modelo.src.modelo.contas;

import modelo.src.modelo.empregado.Empregado;
import modelo.src.modelo.candidato.ICandidato;

public class CriadorContasGenerico implements ICriadorContas {
    public Empregado criar(ICandidato candidato)
    {
        Empregado empregado = new Empregado();

        empregado.setNome(candidato.getNome());
        empregado.setSobrenome(candidato.getSobrenome());
        empregado.setEmail(candidato.getNome().substring(0, 1) + candidato.getSobrenome() + "@xpto.com");
        
        return empregado;
    }
}
