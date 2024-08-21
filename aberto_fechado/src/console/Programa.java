package modelo.src.console;

import modelo.src.modelo.CandidatoGenerico;
import modelo.src.modelo.CriadorContas;
import modelo.src.modelo.Empregado;
import modelo.src.modelo.ICandidato;

import java.util.*;

public class Programa {

	public static void main(String[] args) {
		List<ICandidato> candidatos = new ArrayList<ICandidato>();
		candidatos.add(new CandidatoGenerico("Carlos", "Silva"));
		candidatos.add(new CandidatoGenerico("Maria", "Souza"));
		candidatos.add(new CandidatoGenerico("Ana", "Lopes"));

	    List<Empregado> empregados = new ArrayList <Empregado>();
	    CriadorContas criadorContas = new CriadorContas();

	    for (ICandidato candidato : candidatos)
	    {
	        empregados.add(criadorContas.criar(candidato));
	    }

	    for (Empregado empregado: empregados)
	    {
	        System.out.println(empregado.getNome() + " " + empregado.getSobrenome() + " " +
					empregado.getEmail() + " Gerente: " + empregado.isGerente() +
					" Diretor: " + empregado.isDiretor());
	    }

	}

}
