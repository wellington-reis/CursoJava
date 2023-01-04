package array_vetores_Matrizes_estruturaDeDados;

import projeto_classes.Aluno;
import projeto_classes.Disciplina;

public class AULA13_8_Descobrindo_a_maior_e_a_menor_nota_do_aluno {

	/*
	 * Iremos fazer um Exercicio muito ultilizado em testes praticos nas empresas,
	 * que e precorrer o array de notas e dizer qual a maior nota do Aluno.
	 * Ultilizando o msm codigo onde varremos o array de notas onde trabalharemos
	 * 
	 */

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

		// * AULA13_8_Descobrindo_a_maior_nota_do_aluno

		// Vamos percorrer a Disciplina do aluno

		for (Disciplina d : aluno.getDisciplinas()) {

			// imprimiremos a disciplina
			System.out.println("Displina : " + d.getMateria());

			// Varreremos o Array de notas dentro do mesmo "for" digamos:
			// Um "for" varrerá a disciplina e o outro o Array de notas

			// Sempre que precisar separar um certo valor, usaremos uma varialvel auxiliar
			// para armazenar um valor de comparação.

			// Como o nosso Array e do tipo double faremos uma variavel iqual para nota
			// maior.
			double notaMax = 0.0;
			double notaMin = 0.0;

			for (int pos = 0; pos < d.getNotasvetor().length; pos++) {

				System.out.println("Nota " + pos + " é = " + d.getNotasvetor()[pos]);

				// Usaremos uma condição para iniciar a contagem das notas

				if (pos == 0) {
					/*
					 * Se o elemento Array "NotasVetor" for = 0 a variavel notaMax , vai receber o
					 * retorno de "NotasVetor" no elemento varrido.
					 */
					notaMax = d.getNotasvetor()[pos];
					notaMin = d.getNotasvetor()[pos];
					// agora a varialvel passa a ter o valor do elemento "0"

					/*
					 * Na proxima repetição do "for" o elemento não será mais 0 pois sera
					 * incrementado +1 ( pos ++) então condição sera falsa(else)
					 */
				} else {// entraremos nessa condição.

					if (d.getNotasvetor()[pos] > notaMax) {

					
						/*
						 * Se o valor do Array "notasVetor" for maior que a varialvel auxiliar " notaMax"
						 * A variavel recebe o valor do elemento e  Sai da condição e da repetição e imprimi
						 * a nota maior.
						 */

					} else {

						notaMin = d.getNotasvetor()[pos];

					}

				}

			}

			// E Imprimi no console a maior nota
			// Obs: tem que sair do laço de repetição do Array.
			System.out.println("A maior nota da Materia é : " + notaMax);
			System.out.println("A menor nota da Materia é : " + notaMin);
			System.out.println("============================================");

		}
	}

}
