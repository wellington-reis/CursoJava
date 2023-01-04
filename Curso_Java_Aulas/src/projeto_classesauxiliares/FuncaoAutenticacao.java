package projeto_classesauxiliares;

import projeto_interfaces.PermitirAcesso;

//aula 10.14

public class FuncaoAutenticacao {
	
	private PermitirAcesso permitiracesso;
	
	public boolean autenticar() {
		return permitiracesso.autenticar();
	}
	
	public FuncaoAutenticacao(PermitirAcesso acesso) {

		this.permitiracesso = acesso;
	}

}

