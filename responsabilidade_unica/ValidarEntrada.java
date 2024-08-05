
abstract class ValidarEntrada{
    public static String isValido(String nome) throws Exception {
        if(nome.isBlank()) return "Nome inválido";
        else throw new RuntimeException("Nome válido") ;
    }

    public static boolean isPessoaValida(Pessoa pessoa){
        if(pessoa.getPrimeiroNome().isEmpty()){
            GerenciadorMensagens.mensagemErroValidacao("primeiro nome");
            return false;
        }
        if (pessoa.getUltimoNome().isEmpty()){
            GerenciadorMensagens.mensagemErroValidacao("segundo nome");
            return false;
        }

        return true;
    }

}
