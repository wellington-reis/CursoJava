package outros;

import projeto_classes.Aluno;
import projeto_classes.Diretor;
import projeto_classes.Secretario;

public class TesteHerança {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setNome("wellington");
		aluno.setRegistroGeral("123256215");
		aluno.setIdade(22);

		Diretor diretor = new Diretor();
		diretor.setNome("Well");
		diretor.setRegistroEducacao("212135562");
		diretor.setIdade(25);

		Secretario secretario = new Secretario();
		secretario.setNome("Pedro");
		secretario.setRegistro("124565655");
		secretario.setIdade(22);

		
		aluno.pessoaMaiorIdade();
		diretor.pessoaMaiorIdade();
		secretario.pessoaMaiorIdade();

		System.out.println(aluno.pessoaMaiorIdade() + "-" + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade()+"-"+ diretor.msgMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
	}

}
