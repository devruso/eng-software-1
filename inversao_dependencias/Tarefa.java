 public class Tarefa implements ITarefa {
	
	private String nome;
	private IFuncionario responsavel;
	private double horasTrabalhadas;
	private boolean completa = false;


	private IMecanismoLog log;
	private  IMecanismoMensagem mecanismoMensagem;

	public Tarefa(IMecanismoLog log, IMecanismoMensagem mecanismoMensagem){
		this.log = log;
		this.mecanismoMensagem = mecanismoMensagem;
	}

    @Override
	public void realizarTrabalho(double horas)
    {
        this.horasTrabalhadas += horas;
		//IMecanismoLog log = Fabrica.criarMecanismoLog();
        this.log.registrar("Trabalho realizado em " + this.nome + ".");
    }

    @Override
	public void completarTarefa()
    {
        completa = true;
        //IMecanismoLog log = Fabrica.criarMecanismoLog();
        this.log.registrar("Tarefa " + this.nome + " completa.");

        //IMecanismoMensagem mecanismoEmail = new MecanismoEmail();
        this.mecanismoMensagem.enviarMensagem(this.responsavel, "A tarefa " + this.nome + " foi finalizada.");
    }
	
	@Override
	public String getNome() {
		return nome;
	}
	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public IFuncionario getResponsavel() {
		return responsavel;
	}
	@Override
	public void setResponsavel(IFuncionario responsavel) {
		this.responsavel = responsavel;
	}
	@Override
	public double getHorasTrabalhadas() {return this.horasTrabalhadas;}
	@Override
	public boolean isCompleta() {
		return this.completa;
	}
	
	
}
