package modelo;

public class CriadorContas {
    public Empregado criar(Candidato candidato)
    {
        Empregado empregado = new Empregado();

        empregado.setNome(candidato.getNome());
        empregado.setSobrenome(candidato.getSobrenome());
        if (candidato.getTipoCandidato() == TipoCandidato.GENERICO){
            empregado.setEmail(candidato.getNome().substring(0, 1) + candidato.getSobrenome() + "@xpto.com");
        }

        if(candidato.getTipoCandidato() == TipoCandidato.GERENTE){
            empregado.setEmail(candidato.getNome() + candidato.getSobrenome() + "@xpto.com");
            empregado.setGerente(true);
        }

        if(candidato.getTipoCandidato() == TipoCandidato.DIRETOR){
            empregado.setEmail(candidato.getNome() + candidato.getSobrenome() + "@xptodiretoria.com");
            empregado.setDiretor(false);
        }
        
        return empregado;
    }
}
