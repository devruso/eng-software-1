public class MecanismoSms implements  IMecanismoMensagem{


    @Override
    public void enviarMensagem(IFuncionario funcionario, String mensagem) {
        System.out.println("Simulando o envio de sms para " + funcionario.getNome());
    }
}
