package array_vetores_Matrizes_estruturaDeDados;

import projeto_classes.Aluno;
import projeto_classes.Disciplina;

public class AULA13_7_Percorrendo_listas_e_arrays {

	public static void main(String[] args) {

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

		// adicionando a nova disciplina a disciplinas do aluno.
		aluno.getDisciplinas().add(disciplina);

		// instanciar um Array de notas da discipina2.
		double[] notas2 = { 11.0, 13.5, 15.0, 17.0 };

		// setar os dados da disciplina
		disciplina2.setMateria("Lógica");
		disciplina2.setNotasvetor(notas2);

		// adicionando a nova disciplina a disciplinas do aluno.
		aluno.getDisciplinas().add(disciplina2);

		// ==========================================================================

		/*
		 * Neste nosso caso temos um objeto "Aluno" e esse objeto não é uma lista, então
		 * partiremos diretamente para a lista de disciplinas e posterior para o Array
		 * de notas. OBS : Não se pode ter uma varialve dentro do laço "for" com msm
		 * nome de objeto Ex: Disciplina "disciplina" : aluno.getDisciplinas(); A
		 * "disciplina" representa o objeto de lista instanciado acima.
		 **/

		// vamos imprimir no console : o nome, o curso e a Escola e o titulo da
		// disciplinas.
		System.out.println("Nome do aluno: " + aluno.getNome() + " Inscrito no Curso: " + aluno.getNomeEscola());

		System.out.println("-------------Disciplinas do aluno:--------------- ");

		// Vamos percorrer a Disciplina do aluno

		for (Disciplina d : aluno.getDisciplinas()) {

			// imprimiremos a disciplina
			System.out.println("Displina : " + d.getMateria());

			// Varreremos o Array de notas dentro do mesmo "for" digamos:
			// Um "for" varrerá a disciplina e o outro o Array de notas

			for (int i = 0; i < d.getNotasvetor().length; i++) {

				System.out.println("Nota " + i + " é = " + d.getNotasvetor()[i]);

			}
			

		}
	}

}
