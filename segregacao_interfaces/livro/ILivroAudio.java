package br.ufba.isp.livro;

import br.ufba.isp.geral.IItemBiblioteca;

public interface ILivroAudio extends IItemBiblioteca {

    public String getAutor();
    public void setAutor(String autor);

    public int getDuracaoEmMinutos();
    public  void setDuracaoEmMinutos(int duracaoEmMinutos);

}
