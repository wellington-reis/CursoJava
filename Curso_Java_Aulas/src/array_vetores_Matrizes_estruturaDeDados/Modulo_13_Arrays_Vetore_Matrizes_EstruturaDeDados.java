package array_vetores_Matrizes_estruturaDeDados;



import projeto_classes.Aluno;
import projeto_classes.Disciplina;

/* O Array pode ser de todos os tipos de Dados e tambem de Objetos.*/
//AULA 13.6 ADD UM ARRAY DE NOTAS NA DISCIPLINA.
public class Modulo_13_Arrays_Vetore_Matrizes_EstruturaDeDados {

	public static void main(String[] args) {

	
		// ==============================================================================

	
		// =========================================================================================

		// AULA 13.5 - Diferentes formas de atribuição de valores

		double[] notaJava = { 10.0, 10.0, 10.8, 10.5 };
		double[] notaLogica = { 12.0, 15.0, 13.8, 11.5 };

		// instaciação de objeto Aluno
		Aluno aluno = new Aluno();
		aluno.setNome("wellington");
		aluno.setNomeEscola("JDev");
		aluno.setIdade(42);

		// instanciação de Objeto disciplina
		Disciplina disciplina = new Disciplina();
		disciplina.setMateria("Curso de Java");
		disciplina.setNotasvetor(notaJava);

		aluno.getDisciplinas().add(disciplina);

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setMateria("Lógica");
		disciplina2.setNotasvetor(notaLogica);

		aluno.getDisciplinas().add(disciplina2);

		// aula 13.7 percorrendo lista e arrays

		System.out.println("Nome do aluno = " + aluno.getNome() + " Inscrito no curso : " + aluno.getNomeEscola());
		System.out.println("--------Materias do Aluno---------");

		for (Disciplina d : aluno.getDisciplinas()) {

			System.out.println("------------------------------");
			System.out.println("Materia : " + d.getMateria());
			System.out.println("As Notas da disciplina são: ");

			double notaMin = 0;
			double notaMax = 0;
			for (int i = 0; i < d.getNotasvetor().length; i++) {

				System.out.println("Nota " + i + " é = " + d.getNotasvetor()[i]);

				// Aula 13.8 - Descobrindo a maior nota do Array

				if (i == 0) {
					notaMax = d.getNotasvetor()[i];

				} else {
					if (d.getNotasvetor()[i] > notaMax) {
						notaMax = d.getNotasvetor()[i];
					}
				}

				// Aula 13.8 - Descobrindo a menor nota do Array
				if (i == 0) {
					notaMin = d.getNotasvetor()[i];
				} else {
					if (d.getNotasvetor()[i] < notaMin) {

						notaMin = d.getNotasvetor()[i];

					}
				}

			}

			System.out.println("A maior nota da Materia " + d.getMateria() + " é = " + notaMax);
			System.out.println("A Menor nota da Materia " + d.getMateria() + " é = " + notaMin);
		}
	}

}
