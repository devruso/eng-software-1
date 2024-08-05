package br.ufba.isp.livro;

import br.ufba.isp.geral.IItemBiblioteca;

public interface ILivro extends IItemBiblioteca {
    public String getAutor();
    public void setAutor(String autor);

    public int getNumeroPaginas();
    public void setNumeroPaginas(int numeroPaginas);

}
