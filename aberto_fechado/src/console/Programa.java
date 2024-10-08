package modelo.src.console;

import modelo.src.modelo.candidato.CandidatoDiretor;
import modelo.src.modelo.candidato.CandidatoGenerico;
import modelo.src.modelo.candidato.CandidatoGerente;
import modelo.src.modelo.candidato.ICandidato;
import modelo.src.modelo.empregado.Empregado;

import java.util.*;

public class Programa {
	public static void main(String[] args) {
		List<ICandidato> candidatos = new ArrayList<ICandidato>();
		candidatos.add(new CandidatoGenerico("Carlos", "Silva"));
		candidatos.add(new CandidatoGerente("Maria", "Souza"));
		candidatos.add(new CandidatoDiretor("Ana", "Lopes"));

	    List<Empregado> empregados = new ArrayList <Empregado>();

	    for (ICandidato candidato : candidatos)
	    {
	        empregados.add(candidato.obterCriadorContas().criar(candidato));
	    }

	    for (Empregado empregado: empregados)
	    {
	        System.out.println(empregado.getNome() + " " + empregado.getSobrenome() + " " +
					empregado.getEmail() + " Gerente: " + empregado.isGerente() +
					" Diretor: " + empregado.isDiretor());
	    }

	}

}
