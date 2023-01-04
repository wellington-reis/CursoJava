package array_vetores_Matrizes_estruturaDeDados;

import projeto_classes.Aluno;
import projeto_classes.Disciplina;

public class AULA13_6_Adicionando_o_array_de_notas_dentro_da_disciplina {

	public static void main(String[] args) {

		/*
		 * Na Classe "Disciplina" iremos instanciar um array de notas com 4 posiçoes que
		 * simulara os bimestres. Tambem criaremos seu sets e gets.
		 */

		// instanciar o Objeto Aluno
		Aluno aluno = new Aluno();

		// setar o dados do aluno
		aluno.setNome("Wellington");
		aluno.setIdade(42);
		aluno.setNomeEscola("JDev");

		// instanciar o objeto de lista " Disciplina"
		Disciplina disciplina = new Disciplina();
		Disciplina disciplina2 = new Disciplina();

		// instanciar um Array de notas.
		double[] notas = { 8.8, 9.7, 7.5, 6.8 };

		// setar os dados da disciplina
		disciplina.setMateria("Java");
		disciplina.setNotasvetor(notas); // O parametro "notas" veio da instaciação do array.
		
		//adicionando a nova disciplina a disciplinas do aluno.
		aluno.getDisciplinas().add(disciplina);
		
		// instanciar um Array de notas da discipina2.
		double[] notas2 = { 11.0, 13.5, 15.0, 17.0 };
		
		// setar os dados da disciplina
		disciplina2.setMateria("Lógica");
		disciplina2.setNotasvetor(notas2);

		//adicionando a nova disciplina a disciplinas do aluno.
		aluno.getDisciplinas().add(disciplina2);
		

	}

}
