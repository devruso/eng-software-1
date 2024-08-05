import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Programa {

	public static void main(String[] args) throws IOException {

	GerenciadorMensagens.mensagemBoasVindas();

	Pessoa pessoa = EntradaDadosPessoa.obterDados();

	if (!ValidarEntrada.isPessoaValida(pessoa)){
		ValidarEntrada.isPessoaValida(pessoa);
		return;
	}

	CriadorConta.criar(pessoa);

		
	GerenciadorMensagens.mensagemFimPrograma();
		
	}

}