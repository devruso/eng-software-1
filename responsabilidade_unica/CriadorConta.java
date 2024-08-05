public class CriadorConta {
    public static void criar(Pessoa pessoa){
        System.out.println("Seu id é:" + pessoa.getUltimoNome().substring(0,2) + pessoa.getUltimoNome());
    }
}
