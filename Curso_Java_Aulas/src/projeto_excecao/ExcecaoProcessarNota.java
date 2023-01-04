package projeto_excecao;

public class ExcecaoProcessarNota extends Exception {
	
	public ExcecaoProcessarNota(String erro) {
		super("  vixxi Aconteceu um erro ao processar o arguivo " + erro);
	}

}
