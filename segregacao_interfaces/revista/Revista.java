package br.ufba.isp.revista;

import java.time.LocalDateTime;

public class Revista  implements  IRevistaEmprestavel{

    @Override
    public String getFrequencia(){
        return null;
    }

    @Override
    public void setFrequencia(){
    }

    @Override
    public int getNumeroPagina(){
        return 0;
    }

    @Override
    public void emprestar(String usuarioEmprestimo) {

    }

    @Override
    public void devolver() {

    }

    @Override
    public LocalDateTime getDataDevolver() {
        return null;
    }

    @Override
    public int getDuracaoEmprestimoEmDias() {
        return 0;
    }

    @Override
    public void setDuracaoEmprestimoEmDias(int duracaoEmprestimoEmDias) {

    }

    @Override
    public String getUsuarioEmprestimo() {
        return null;
    }

    @Override
    public void setUsuarioEmprestimo(String usuarioEmprestimo) {

    }

    @Override
    public LocalDateTime getDataEmprestimo() {
        return null;
    }

    @Override
    public void setDataEmprestimo(LocalDateTime dataEmprestimo) {

    }

    @Override
    public String getIdItemBiblioteca() {
        return null;
    }

    @Override
    public void setIdItemBiblioteca(String idItemBiblioteca) {

    }

    @Override
    public String getTitulo() {
        return null;
    }

    @Override
    public void setTitulo(String titulo) {

    }

    @Override
    public int getNumeroPaginas() {
        return 0;
    }

    @Override
    public void setNumeroPaginas(int numeroPaginas) {

    }



}
