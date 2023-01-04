package projeto_classes;

import projeto_interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso {
	
	//Atributos

	protected String Registro;
	protected String NilvelCargo;
	protected String Experiencia;
	private String loguin;
	private String senha;
	
	//Set e Gets
	
	public Secretario( String loguin , String senha) {
		this.loguin = loguin;
		this.senha = senha;
	}
	
	public Secretario() {
		this.loguin = "";
		this.senha = "";
		// TODO Auto-generated constructor stub
	}



	public String getRegistro() {
		return Registro;
	}

	public void setRegistro(String registro) {
		Registro = registro;
	}

	public String getNilvelCargo() {
		return NilvelCargo;
	}

	public void setNilvelCargo(String nilvelCargo) {
		NilvelCargo = nilvelCargo;
	}

	public String getExperiencia() {
		return Experiencia;
	}

	public void setExperiencia(String experiencia) {
		Experiencia = experiencia;
	}
	

	
	//Metodos Sobrepostos
	
	@Override // Metodo não abstrato não tem  obrigação de ser implementado.
	public boolean pessoaMaiorIdade() {
		return super.pessoaMaiorIdade();
	}

	@Override // Metodo Abstrato tem  obrigação de ser implementado  nas classes filhas.
	public double salario() {
		// TODO Auto-generated method stub
		return 1800.00;
	}
	
	
	@Override
	public boolean autenticar(String loguin, String senha) {
		this.loguin = loguin;
		this.senha = senha;
		return  autenticar();
	}

	@Override
	public String construtor() {
		this.loguin = "";
		this.senha = "";
		return "" ;
	}

	@Override
	public boolean autenticar() {
		// TODO Auto-generated method stub
		return loguin.equalsIgnoreCase("admin") & senha.equalsIgnoreCase("admin");
	}



	

	



}
