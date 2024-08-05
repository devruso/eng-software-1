package br.ufba.isp.filme;

import br.ufba.isp.geral.IItemBiblioteca;

import java.util.List;

public interface IFilme extends IItemBiblioteca {

    public int getDuracaoEmMinutos() ;
    public void setDuracaoEmMinutos(int duracaoEmMinutos) ;
    public List<String> getAtores();
    public void setAtores(List<String> atores);


}
