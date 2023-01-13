package array_vetores_Matrizes_estruturaDeDados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

import projeto_classes.Aluno;
import projeto_classes.Disciplina;

public class Exercicios_Arrays {

	public static void main(String[] args) {

		// Exercicio:// Aula 13-2- Criando o Primeiro Array

		// 01- vamos istanciar um array "notas" com 4 elementos.fazer a descrição.

		double[] notas = new double[4];
		// Istanciando um array tipo double com referente "notas" recebe uma array de 4
		// posiçoes

		// 02- vamos add os valores dos elementos. e faze sua descrição.

		notas[0] = 15;
		notas[1] = 20;
		notas[2] = 25;
		notas[3] = 30;

		// 03- imprimir no console

		System.out.println(notas[0]);
		System.out.println(notas[1]);
		System.out.println(notas[2]);
		System.out.println(notas[3]);

		// 04- Debugar o codigo.

		System.out.println("================fim Exercicio============================");

		// ======================================================================

		// AULA 13_3 - Recuperando valores no Array

		// Vamos varrer o Array "notas" e recuperar os valores nas posiçoes.
		for (int pos = 0; pos < notas.length; pos++) {

			// Vamos imprimir no console.
			System.out.println("O valor da nota é : " + notas[pos]);

		}

		// debugar o codigo.

		System.out.println("================fim Exercicio===========================");

		// =======================================================================

		// AULA13_4_Entrada_e_Leitura_FormaDinâmica

		// pedir o usuario para colocar a quantidade de posiçoes do Array
		
		String qtd = JOptionPane.showInputDialog("Quantas posiçoes tera o Array ? ");

		// instanciar um novo array com a quantidade de posiçoes ditas pelo usuario
		
		double[] notas2 = new double[Integer.parseInt(qtd)];

		// Recuperar os valores do array
		
		for (int pos = 0; pos < notas2.length; pos++) {
			
			// pedir o usuario para colocar os valores de cada elemento.
			String chooseoption = JOptionPane.showInputDialog("Qual o valor da nota ? " + (pos+1));
			
			notas2[pos] = Double.valueOf(chooseoption); 
			
			// imprimir no console o valor e a posição do Array
			System.out.println(" A nota na posição " + pos + " é = " + notas2[pos]);
			
		}

		System.out.println("================fimExercicio============================");

		// =============================================================================

		// AULA13_5_Diferentesformas_de_atribuição_de_valores

		// 01- Criar um array com implementação de dados diretos com dados de diferente
		// tipos
		
		String[] notas3 = {"wellington", "Java","40","50","60","70"};

		// 02- Varrer e Recuperar os dados do array
		
		for (int pos = 0; pos < notas3.length; pos++) {
			
			// 03- imprimir no console
			System.out.println("Os Dados do Array direto na posição " + pos +" é = " + notas3[pos]);
			
		}

		System.out.println("================fimExercicio============================");

		// ================================================================================

		// Exercicios da semana 26/12 a 01/01

		// 13_6_Adicionando_o_array_de_notas_dentro_da_disciplina 26/12

		// 1-Instanciar um objeto aluno com os
		Aluno aluno = new Aluno();

		// 1.1-Setar os atributos de : Nome, Escola, Idade.
		
		aluno.setNome("Wellington");
		aluno.setIdade(42);
		aluno.setNomeEscola("Jdev");

		// 2-Instanciar uma lista de disciplina
		
		Disciplina disciplina = new Disciplina();
		Disciplina disciplina1 = new Disciplina();
		Disciplina disciplina2 = new Disciplina();

		// 2.1-Instanciar o array de notas.
		
		double[] notasJava = {45.5, 30.3, 25.5, 35.0};
		double[] notasLogica = {45.5, 30.3, 25.5, 35.0};
		double[] notasSpring = {45.5, 30.3, 25.5, 35.0};

		// 2.2-Setar a lista com o Nome e os valores do array de notas.
		
		disciplina.setMateria("Java");
		disciplina.setNotasvetor(notasJava);
		
		disciplina1.setMateria("Logica Programação");
		disciplina1.setNotasvetor(notasLogica);
		
		disciplina2.setMateria("SpringBoot");
		disciplina2.setNotasvetor(notasSpring);

		// 3-Adicionar a disciplina ao objeto Aluno.
		
		aluno.getDisciplinas().add(disciplina);
		aluno.getDisciplinas().add(disciplina1);
		aluno.getDisciplinas().add(disciplina2);

		// 4- criar mais 2 disciplinas.ok

		System.out.println("================fimExercicio============================");

		// =========================================================================

		// AULA13_7_Percorrendo_listas_e_arrays 26/12

		// 01 - Imprimir no console o Nome do aluno e a escola .

		// 02 - Varrer a lista de disciplinas

		// 2.1 - Imprimir no console as diciplinas do aluno e o titulo das notas " As
		// notas da disciplina são:".

		// 03 - Varrer o Array de notas

		// 3.1 - imprimir no console o elemento e o valor do Array de nota para cada
		// disciplina.

		// System.out.println("---------------------------------------------------------");

		// Debugar o codigo.

		// System.out.println("================fim
		// Exercicio============================");

		// ===========================================================================

		// AULA13_8_Descobrindo_a_maior_e_a_menor_nota_do_aluno 27/12

		// 01 - Imprimir no console o Titulo do exercicio .

		// 02 - Varrer a lista de disciplinas

		// 03 - Varrer o Array de notas
		// 04- imprimir a maior nota da disciplina
		// 05- imprimir a menor nota da disciplina
		// Debugar o codigo.
		// System.out.println("================fim
		// Exercicio============================");

		// ==============================================================================

		// AULA13_10_ManipulandoArrayDeObjetos 28/12

		// obs: A varredura pelo "for" tem que ser um dentro do outro.

		// 01-Criando um Array do objeto Aluno

		// 02-Add o Aluno na posicao do array

		// 03-Varrendo o array do objeto Aluno e imprimir o nome do aluno
		// 04-Varrendo a Lista de Disciplinas e imprimir as disciplinas
		// 05-Varrendo o Array de Notas
		// 06-Adicionar mais um objeto aluno no array - ok

		// System.out.println("================fim Exercicio
		// ============================");
		// ======================================================================

		// =============== EXERCICIOS DA SEMANA 02/01 A 06/01

		// AULA13_11e12_Matrizes_ArraysMultdimencional

		// 01- CRIE UMA MATRIZ 2X3

		// 1.1-FAÇA SUA Descrição :
		// "semestre " recebe uma matriz do tipo double com 2 elementos e 3 posiçoes

		// 02-Adicione dados a matriz

		// DEBUG O CODIGO.

		// =============================================================================

		// AULA13_13_LendoMatriz

		// 01- Vamos ler a Matriz do ultimo exercicio.

		// 02- Separar as Matrizes
		// System.out.println("================fim
		// Exercicio============================");

		// =============================================================================

		// AULA13_14_String_eo_Método_Split_para_Array

		// CRIE UMA VARIAVEL DO TIPO STRING COM NOME, CURSO, NOTA1, NOTA2, NOTA3, NOTA4.

		// CRIE UM ARRAY COM OS VALORES DA VARIAVEL ULTILIZANDO O METODO .SPLIT.

		// PERCORRA O ARRAY E IMPRIMA NO CONSOLE

		// =============================================================================

		// AULA_13_15_Conversão_Array_para_Lista_e_Lista_para_Array

		// 01- Converta o "arrayTexto" criado acima em uma lista

		// 02- Varra a lista e imprima no console.

		// 03 - Reconverta o arrayTexto para um Array.

		// 04 - Varra o Array e imprima no console.

		// System.out.println("================fimExercicio============================");

		// =============================================================================

	}

}
