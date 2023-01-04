package array_vetores_Matrizes_estruturaDeDados;

import projeto_classes.Aluno;
import projeto_classes.Disciplina;

public class AULA13_10_ManipulandoArrayDeObjetos {

	public static void main(String[] args) {
		// Arrays de Notas
		double[] notaJava = { 10.0, 10.0, 10.8, 10.5 };
		double[] notaLogica = { 12.0, 15.0, 13.8, 11.5 };

		// instanciação de objeto Aluno
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

		// ==========================================================

		// Criando um array para a Classe Aluno.
		Aluno[] arrayAlunos = new Aluno[1];

		// Adicionando o Objeto "aluno" que foi instanciado acima no primeiro elemento "
		// 0 " do "arrayAluno".
		arrayAlunos[0] = aluno;

		
		 // Obs: Lembrando que dentro da Classe Aluno temos: 
		 // Uma lista de Diciplinas, 
		 // Um Array de notas e 
		 // Agora um array de Objetos "Alunos".
	

		// Varrendo o "ArrayAluno"
		for (int pos = 0; pos < arrayAlunos.length; pos++) {

			// Imprimindo Atributo "Nome" do objeto "aluno"
			System.out.println("Nome do Aluno é: " + arrayAlunos[pos].getNome());
			System.out.println("------------------------------------------------");


			// Varrendo a lista de Disciplinas
			for (Disciplina d3 : arrayAlunos[pos].getDisciplinas()) {
				
				// Imprimindo  "Nome" da discilina da lista do objeto "aluno"
				System.out.println(" Nome da Disciplina é : " + d3.getMateria());
				System.out.println("------------------------------------------------");

				
				for (int posNota = 0; posNota < d3.getNotasvetor().length; posNota++) {
					
					System.out.println("A nota número " + posNota + " é igual " + d3.getNotasvetor()[posNota]);
				}

			}

		}

	

	}

}
