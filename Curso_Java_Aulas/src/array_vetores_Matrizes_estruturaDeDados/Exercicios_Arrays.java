package array_vetores_Matrizes_estruturaDeDados;

import javax.swing.JOptionPane;

import projeto_classes.Aluno;
import projeto_classes.Disciplina;

public class Exercicios_Arrays {

	public static void main(String[] args) {

		// Exercicio:// Aula 13-2- Criando o Primeiro Array

		// vamos istanciar um array "notas" com 4 elementos.fazer a descrição.
		double[] notas = new double[4];// varialvel "notas" com tipo double recebe um novo array do tipo double com 4
										// posiçoes.

		// vamos add os valores dos elementos. e faze sua descrição.

		notas[0] = 10.3; // O array notas na posição "0" recebe 10.3.
		notas[1] = 10.5; // O array notas na posição "1" recebe 10.5.
		notas[2] = 10.8; // O array notas na Posição "2" recebe 10.8.
		notas[3] = 10.9; // O array notas na Posição "3" recebe 10.9.

		// imprimir no console

		System.out.println(notas[0]);

		// Debugar o codigo.

		System.out.println("================fim Exercicio  ============================");

		// ======================================================================

		// AULA 13_3 - Recuperando valores no Array

		// Vamos recuperar o valor do Array "notas"
		for (int pos = 0; pos < notas.length; pos++) {

			// Vamos imprimir no console.
			System.out.println("O array notas na posição  " + pos + " recebe: " + notas[pos]);

		}

		// debugar o codigo.

		System.out.println("================fim Exercicio  ============================");

		// =======================================================================

		// AULA13_4_Entrada_e_Leitura_FormaDinâmica

		// pedir o usuario para colocar a quantidade de elementos do Array
		String posUser = JOptionPane.showInputDialog("Quantas posiçoes o Array terá : ");

		// instanciar um novo array com a quantidade de posiçoes ditas pelo usuario
		double[] notas2 = new double[Integer.parseInt(posUser)];

		// pedir o usuario para colocar os valores de cada elemento.
		for (int pos = 0; pos < notas2.length; pos++) {

			String notaUser = JOptionPane.showInputDialog("Qual nota " + pos + " : ");

			notas2[pos] = Double.valueOf(notaUser);

		}

		// Recuperar os valores do array e imprimi-los no console.

		for (int i = 0; i < notas2.length; i++) {

			System.out.println("O valor para a posição  " + i + " é = " + notas2[i]);

		}

		System.out.println("================fim Exercicio  ============================");

		// =============================================================================

		// AULA13_5_Diferentesformas_de_atribuição_de_valores

		// 01- Criar um array com implementação de dados diretos com dados de diferente
		// tipos

		String[] var = { "Wellington", "42", "10.5", "11.5", "22", "30" };

		System.out.println("");

		// 02- Recuperar os dados do array
		for (int posVar = 0; posVar < var.length; posVar++) {

			// 03- imprimir no console

			System.out.println("Os Dados da Array na posição " + posVar + " é = " + var[posVar]);

		}

		System.out.println("================fim Exercicio  ============================");

		// ================================================================================

		// Exercicios da semana 26/12 a 01/01

		// 13_6_Adicionando_o_array_de_notas_dentro_da_disciplina 26/12

		// 1-Instanciar um objeto aluno com os
		Aluno aluno = new Aluno();

		// 1.1-Setar os atributos de : Nome, Escola, Idade.

		aluno.setNome("Wellington");
		aluno.setIdade(42);
		aluno.setNomeEscola("JDev Treinamentos");

		// 2-Instanciar uma lista de disciplina

		Disciplina disciplina1 = new Disciplina();
		Disciplina disciplina2 = new Disciplina();
		Disciplina disciplina3 = new Disciplina();

		// 2.1-Instanciar o array de notas.

		double[] notasD1 = { 10.1, 20.2, 30.3, 40.4 };
		double[] notasD2 = { 20.1, 30.2, 40.3, 50.4 };
		double[] notasD3 = { 30.1, 40.2, 50.3, 60.4 };

		// 2.2-Setar a lista com o Nome e os valores do array de notas.
		disciplina1.setMateria("java");

		disciplina1.setNotasvetor(notasD1);

		disciplina2.setMateria("Lógica programação");

		disciplina2.setNotasvetor(notasD2);

		disciplina3.setMateria("SpringBoot");

		disciplina3.setNotasvetor(notasD3);

		// 3-Adicionar a disciplina ao objeto Aluno.
		aluno.getDisciplinas().add(disciplina1);
		aluno.getDisciplinas().add(disciplina2);
		aluno.getDisciplinas().add(disciplina3);

		// 4- criar mais 2 disciplinas.ok

		// =========================================================================

		// AULA13_7_Percorrendo_listas_e_arrays 26/12

		// 01 - Imprimir no console o Nome do aluno e a escola .
		System.out.println("Nome do Aluno: " + aluno.getNome());
		System.out.println("Nome da Escola: " + aluno.getNomeEscola());

		// 02 - Varrer a lista de disciplinas

		for (Disciplina d : aluno.getDisciplinas()) {

			// 2.1 - Imprimir no console as diciplinas do aluno e o titulo das notas " As
			// notas da disciplina são:".
			System.out.println("As notas da Matéria " + d.getMateria() + " são : ");

			// 03 - Varrer o Array de notas
			for (int posN = 0; posN < d.getNotasvetor().length; posN++) {

				// 3.1 - imprimir no console o elemento e o valor do Array de nota para cada
				// disciplina.
				System.out.println(" O valor do Elemento " + posN + " é = " + d.getNotasvetor()[posN]);

			}
			System.out.println("---------------------------------------------------");

		}

		// Debugar o codigo.

		System.out.println("================fim Exercicio  ============================");

		// ===========================================================================

		// AULA13_8_Descobrindo_a_maior_e_a_menor_nota_do_aluno 27/12

		// 01 - Imprimir no console o Titulo do exercicio .

		System.out.println("DESCOBRINDO A MAIOR E MENOR NOTA DA MATÉRIA");

		// 02 - Varrer a lista de disciplinas

		for (Disciplina d2 : aluno.getDisciplinas()) {

			double notaMax = 0.0;
			double notaMin = 0.0;

			// 03 - Varrer o Array de notas
			for (int i = 0; i < d2.getNotasvetor().length; i++) {

				if (i == 0) {

					notaMax = d2.getNotasvetor()[i];
					notaMin = d2.getNotasvetor()[i];

				} else {
					if (d2.getNotasvetor()[i] > notaMax) {

						notaMax = d2.getNotasvetor()[i];

					}

					if (d2.getNotasvetor()[i] < notaMin) {

						notaMin = d2.getNotasvetor()[i];

					}
				}

			}

			// 04- imprimir a maior nota da disciplina
			System.out.println("A Maior nota da máteria " + d2.getMateria() + " é = " + notaMax);

			// 05- imprimir a menor nota da disciplina
			System.out.println("A Menor nota da máteria " + d2.getMateria() + " é = " + notaMin);

			System.out.println("-----------------------------------------------------------------");

		}

		System.out.println("================fim Exercicio  ============================");

		// Debugar o codigo.

		// ==============================================================================

		// AULA13_10_ManipulandoArrayDeObjetos 28/12

		// obs: A varredura pelo "for" tem que ser um dentro do outro.

		System.out.println("MANIPULANDO ARRAY DE OBJETO.\n");

		// 01-Criando um Array do objeto Aluno

		Aluno[] arrayAluno = new Aluno[1];

		// 02-Add o Aluno na posicao do array

		arrayAluno[0] = aluno;

		// 03-Varrendo o array do objeto Aluno e imprimir o nome do aluno

		for (int posArrayAluno = 0; posArrayAluno < arrayAluno.length; posArrayAluno++) {

			System.out.println("Nome do Aluno : " + arrayAluno[posArrayAluno].getNome());

			// 04-Varrendo a Lista de Disciplinas e imprimir as disciplinas
			for (Disciplina d3 : arrayAluno[0].getDisciplinas()) {

				System.out.println("Nome da Materia : " + d3.getMateria());

				double maxNotas = 0.0;
				double minNotas = 0.0;

				// 05-Varrendo o Array de Notas
				for (int posArrayNotas = 0; posArrayNotas < d3.getNotasvetor().length; posArrayNotas++) {

					System.out.println(" As notas são : " + posArrayNotas);

					// 06-Encontrando a maior nota
					if (d3.getNotasvetor()[posArrayNotas] == 0) {

						maxNotas = d3.getNotasvetor()[posArrayNotas];
						minNotas = d3.getNotasvetor()[posArrayNotas];

					} else {
						if (d3.getNotasvetor()[posArrayNotas] > maxNotas) {

							maxNotas = d3.getNotasvetor()[posArrayNotas];

						}
						if (d3.getNotasvetor()[posArrayNotas] < minNotas) {

							minNotas = d3.getNotasvetor()[posArrayNotas];

						}
					}

				}

				// 07-imprimindo a maior e menor nota.

				System.out.println(" A maior nota é = " + maxNotas);
				System.out.println(" A menor nota é = " + minNotas);
				System.out.println("---------------------------------------");
			}

		}

		System.out.println("================fim Exercicio  ============================");
		// ======================================================================

		// =============== EXERCICIOS DA SEMANA 02/01 A 06/01

		// AULA13_11e12_Matrizes_ArraysMultdimencional

		// 01- CRIE UMA MATRIZ 2X3
		double[][] matrizAluno = new double[2][3];

		// 1.1-FAÇA SUA Descrição :
		// "matrizAluno" recebe uma matriz do tipo double com 3 elementos e 3 posiçoes

		// 02-Adicione dados a matriz

		matrizAluno[0][0] = 21;
		matrizAluno[0][1] = 25;
		matrizAluno[0][2] = 30;

		matrizAluno[1][0] = 22;
		matrizAluno[1][1] = 24;
		matrizAluno[1][2] = 40;

		// DEBUG O CODIGO.

		System.out.println("================fim Exercicio  ============================");

		// =============================================================================

		// AULA13_13_LendoMatriz

		// 01- Vamos ler a Matriz do ultimo exercicio.

		double maxMatriz = 0.0;
		double minMatriz = 0.0;
		for (int posLinha = 0; posLinha < matrizAluno.length; posLinha++) {

			for (int posColuna = 0; posColuna < matrizAluno[posLinha].length; posColuna++) {

				System.out.println("O valores da Matriz são: " + matrizAluno[posLinha][posColuna]);

				// 02- Separar as Matrizes
				if (posColuna == 0) {

					maxMatriz = matrizAluno[posLinha][posColuna];

				} else {

					if (matrizAluno[posLinha][posColuna] > maxMatriz) {

					}
				}

			}


		}
		

		System.out.println("================fim Exercicio  ============================");

		// =============================================================================
		
		//AULA13_14_String_eo_Método_Split_para_Array
		
		// CRIE UMA VARIAVEL DO TIPO STRING COM NOME, CURSO, NOTA1, NOTA2, NOTA3, NOTA4.
		String texto = "wellington, Java, 40, 80, 70, 60";
		
		// CRIE UM ARRAY COM OS VALORES DA VARIAVEL ULTILIZANDO O METODO .SPLIT.
		
		String[] arrayTexto = texto.split(",");
		
		// PERCORRA O ARRAY E IMPRIMA NO CONSOLE
		
		for (int pos = 0; pos < arrayTexto.length; pos++) {
			
			System.out.println(" O Array de texto he: " + arrayTexto[pos]);
			
		}
	}

}
