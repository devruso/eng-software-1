import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GerenciadorMensagens {


    public static void mensagemBoasVindas(){
        System.out.println("Seja bem-vinda ou bem-vindo");
    }
    public static void mensagemFimPrograma(){
        System.out.println("Volte novamente!");
    }
    public static  void mensagemErroInput() throws IOException {
        try {
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Houve um erro ao preencher os dados!");
            System.out.println("Pressione a tecla enter para sair do programa");
            teclado.readLine();
        } catch (IOException e) {
           throw new RuntimeException(e);
        }
    }
    public static void perguntaNome(String nome){
        System.out.printf("Qual seu %s nome?", nome);
    }
    public static void mensagemErroValidacao(String campo){
        if (campo.isEmpty()){
            System.out.printf("VocÊ inseriu dados errados para" + campo + " tente novamente.");
        }
    }





}
