package modelo.src.modelo.contas;

import modelo.src.modelo.empregado.Empregado;
import modelo.src.modelo.candidato.ICandidato;

public class CriadorContasGerente implements ICriadorContas{

    private Empregado empregado;

    @Override
    public Empregado criar(ICandidato candidato) {
        Empregado empregado = new Empregado();

        empregado.setNome(candidato.getNome());
        empregado.setSobrenome(candidato.getSobrenome());
        empregado.setEmail(candidato.getNome()+ candidato.getSobrenome() + "@xpto.com");

        empregado.setGerente(true);
        return empregado;
    }
}
