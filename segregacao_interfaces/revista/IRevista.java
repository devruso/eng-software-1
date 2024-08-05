package br.ufba.isp.revista;

import br.ufba.isp.geral.IItemBiblioteca;

public interface IRevista extends IItemBiblioteca {

    public int getNumeroPaginas();
    public void setNumeroPaginas(int numeroPaginas);

}
