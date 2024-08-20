package modelo;

import java.util.*;

public class Programa {

	public static void main(String[] args) {
		List<Candidato> candidatos = new ArrayList<Candidato>();
	    candidatos.add(new Candidato("Carlos", "Silva"));
	    candidatos.add(new Candidato("Maria", "Souza", TipoCandidato.GERENTE));
	    candidatos.add(new Candidato("Ana", "Lopes", TipoCandidato.DIRETOR));

	    List<Empregado> empregados = new ArrayList<Empregado>();
	    CriadorContas criadorContas = new CriadorContas();

	    for (Candidato candidato: candidatos)
	    {
	        empregados.add(criadorContas.criar(candidato));
	    }

	    for (Empregado empregado: empregados)
	    {
	        System.out.println(empregado.getNome() + " " + empregado.getSobrenome() + " "
			+ empregado.getEmail() + " Gerente: " + empregado.isGerente()
			+ " Diretor:" + empregado.isDiretor());
	    }

	}

}
