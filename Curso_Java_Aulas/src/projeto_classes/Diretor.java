package projeto_classes;

import projeto_interfaces.PermitirAcesso;

public class Diretor extends Pessoa implements PermitirAcesso{
	
	protected String RegistroEducacao;
	protected String TempoDirecao;
	protected String Titulacao;
	protected String loguin;
	protected String senha;
	
	//Set e get
	
	public Diretor(String login , String senha) {
		this.loguin = login;
		this.senha = senha;
	}
	
	public Diretor() {
		// TODO Auto-generated constructor stub
	}
	public String getRegistroEducacao() {
		return RegistroEducacao;
	}
	public void setRegistroEducacao(String registroEducacao) {
		RegistroEducacao = registroEducacao;
	}
	public String getTempoDirecao() {
		return TempoDirecao;
	}
	public void setTempoDirecao(String tempoDirecao) {
		TempoDirecao = tempoDirecao;
	}
	public String getTitulacao() {
		return Titulacao;
	}
	public void setTitulacao(String titulacao) {
		Titulacao = titulacao;
	}
	
	@Override
	public boolean pessoaMaiorIdade() {
		return idade >= 25;
	}
	
	public String msgMaiorIdade() {
		
		return this.pessoaMaiorIdade() ? "idade ideal" : "Idade Incompatível";
	}
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 2200.00;
	}
	@Override
	public String construtor() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean autenticar(String loguin, String senha) {
		this.loguin = loguin;
		this.senha = senha;
		return autenticar();
	}
	@Override
	public boolean autenticar() {
		
		return loguin.equalsIgnoreCase("wor") && senha.equalsIgnoreCase("1234");
	}
	
	
	
	
	

	

}
