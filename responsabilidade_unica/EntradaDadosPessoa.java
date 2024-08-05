import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntradaDadosPessoa {




    public static Pessoa obterDados() throws IOException {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        Pessoa usuario = new Pessoa();

        GerenciadorMensagens.perguntaNome("primeiro");
        usuario.setPrimeiroNome(teclado.readLine());
        GerenciadorMensagens.perguntaNome("segundo");
        usuario.setUltimoNome(teclado.readLine());

        return usuario;
    }

    public void cadastrarPessoa() throws Exception{
        var usuario = new Pessoa();
        String nome;
        GerenciadorMensagens.perguntaNome("primeiro");
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        nome = ValidarEntrada.isValido(teclado.readLine());
        usuario.setPrimeiroNome(nome);
        GerenciadorMensagens.perguntaNome("segundo");
        nome = ValidarEntrada.isValido(teclado.readLine());
        usuario.setUltimoNome(nome);
    }
}
