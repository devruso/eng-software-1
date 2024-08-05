package br.ufba.isp.revista;

import br.ufba.isp.geral.IEmprestavel;

public interface IRevistaEmprestavel extends  IRevista, IEmprestavel {
    String getFrequencia();

    void setFrequencia();

    int getNumeroPagina();
}
