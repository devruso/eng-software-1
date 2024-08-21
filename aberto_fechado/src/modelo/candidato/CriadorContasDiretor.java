package modelo.src.modelo.candidato;

import modelo.src.modelo.empregado.Empregado;
import modelo.src.modelo.contas.ICriadorContas;

public class CriadorContasDiretor implements ICriadorContas {

    @Override
    public Empregado criar(ICandidato candidato) {
        {
            Empregado empregado = new Empregado();

            empregado.setNome(candidato.getNome());
            empregado.setSobrenome(candidato.getSobrenome());
            empregado.setEmail(candidato.getNome() + candidato.getSobrenome() + "@xptodiretoria.com");
            empregado.setDiretor(true);
            return empregado;
        }
    }
}
