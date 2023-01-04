/*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*/

package outros;

//import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
//import java.util.Scanner;
import javax.swing.JOptionPane;
import projeto_classes.Aluno;
import projeto_classes.Diretor;
import projeto_classes.Disciplina;
import projeto_classesauxiliares.FuncaoAutenticacao;
import projeto_constantes.ResultadosAluno;

public class Projeto_exe {

	public static void main(String[] args) {

		try {

			lerArquivo();

			String loguin = JOptionPane.showInputDialog("Digite seu Loguin : ");
			String senha = JOptionPane.showInputDialog("Senha: ");

			if (new FuncaoAutenticacao(new Diretor(loguin, senha)).autenticar()) {

				List<Aluno> alunos = new ArrayList<Aluno>();/* aula 9.26 Criando e percorrendo a lista. */

				/*
				 * hasmap tbm e uma lista que dentro dela temos uma chave que identifica
				 * umasequencia de valores tbm
				 */
				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

				/* List<DadosAluno> alunosAprovado = new ArrayList<DadosAluno>();/* (9.32.1) */
				/*
				 * List<DadosAluno> alunosRecuperacao = new ArrayList<DadosAluno>();/* (9.32.1)
				 */
				/* List<DadosAluno> alunosReprovado = new ArrayList<DadosAluno>();/* (9.32.1) */

				for (int qtd = 1; qtd <= 1; qtd++) { /* Criamos um laço de repetição para adiciona dados a lista */

					String nome = JOptionPane.showInputDialog("NOME ALUNO " + qtd + ":");
					String idade = JOptionPane.showInputDialog("IDADE :");// criação de erro para aula 11.10.

					/*
					 * JOptionPane.showInputDialog("DATA NASCIMENTO :"); String RG =
					 * JOptionPane.showInputDialog("NUMERO RG :"); String CPF =
					 * JOptionPane.showInputDialog("NUMERO DO CPF :");
					 */

					/* Chamando Objeto Aluno */
					Aluno aluno = new Aluno();

					/* setando dados aluno */
					aluno.setNome(nome);
					aluno.setIdade(Integer.valueOf(idade));
					aluno.setNomeEscola("JDev");

					/*
					 * aluno.setDataNascimento(); aluno.setRegistroGeral(RG);
					 * aluno.setNumeroCpf(CPF);
					 */

					/*
					 * ===========================================================================
					 */

					/* AULA 9.22 - Criando a lista dinâmica das disciplinas do aluno dia-17/04/22 */

					for (int pos = 1; pos <= 1; pos++) {/*
														 * Criamos um laço de repetição para adiciona dados a lista
														 */
						// String nomeMateria = JOptionPane.showInputDialog("Qual o Nome da Materia " +
						// pos + " ?");
						// String faltaMateria = JOptionPane.showInputDialog("Quantas faltas na Materia
						// " + pos + " ?");

						/* Chamando Objeto Disciplina. */
						Disciplina disciplina = new Disciplina();
						Disciplina disciplina2 = new Disciplina();

						/* Setando dados no objeto disciplina. */
						disciplina.setMateria("Java");
						disciplina.setNotas(aluno.getNotasJava());
						disciplina.setFaltas(10);

						/* Setando dados no objeto disciplina. */
						disciplina2.setMateria("Lógica");
						disciplina2.setNotas(aluno.getNotasLogica());
						disciplina2.setFaltas(10);

						/* Adicionando o objeto disciplina na lista de Disciplinas */
						aluno.getDisciplinas().add(disciplina);
						aluno.getDisciplinas().add(disciplina2);

					}
					System.out.println(
							"Nome do aluno = " + aluno.getNome() + " Inscrito no curso : " + aluno.getNomeEscola());
					System.out.println("--------Materias do Aluno---------");

					for (Disciplina d : aluno.getDisciplinas()) {

						System.out.println("--------------------------");
						System.out.println("Materia : " + d.getMateria());
						System.out.println("As notas da Materia são: ");

						aluno.setNotaMax(0);
						for (int i = 0; i < d.getNotas().length; i++) {

							System.out.println("Nota " + i + " é = " + d.getNotas()[i]);
							if (i == 0) {
								aluno.setNotaMax(d.getNotas()[i]); 
							} else {
								if (d.getNotas()[i] > aluno.getNotaMax()) {
									aluno.setNotaMax(d.getNotas()[i]);
								}
							}

						}

						System.out.println("A maior nota da Máteria " + d.getMateria() + " é a Nota : " + aluno.getNotaMax());

					}
					/* ====================================================================== */

					/* AULA 9.23 - Removendo disciplinas da lista do aluno 19/09/22 aula 124. */

					/*
					 * int escolha = JOptionPane.showConfirmDialog(null,
					 * "Deseija deletar alguma Disciplina? ");
					 */

					/*
					 * if(escolha==0) {
					 * 
					 * /*String delMateria = JOptionPane.showInputDialog(
					 * "Qual Materia vai Deletar ?"+ "\nNumero 1"+ "\nNumero 2"+ "\nNumero 3"+
					 * "\nNumero 4");/*
					 * 
					 * /*Chama a lista de Disciplina do aluno e remove a matéria Pedida.
					 */
					/* aluno.getDisciplinas().remove(Integer.valueOf(delMateria).intValue()-1);} */

					/* ===================================================================== */

					/* AULA 9.24 - Descobrindo se o aluno está em recuperação */

					/*
					 * obs: Comentei o atributos do aluno para facilitar a Execulsão do
					 * codigo.(linha 13ao16 e 22ao25)
					 * 
					 */

					/*
					 * Modifiquei o objeto "DadosAluno" onde acrescentei uma condicional de
					 * recuperação caso, a nota media do aluno ficar entre 50 a 70 pontos e faltas
					 * menor ou igual a 40.
					 */

					/* ========================================================================= */

					/* AULA 9.25 - Remover disciplinas em repetição */

					/* obs.Comentamos a aula 124 para fazer essa aula */

					/*
					 * int opcaoDeletar = JOptionPane.showConfirmDialog(null,
					 * "Deseija Remover Alguma Materia ?");
					 * 
					 * if (opcaoDeletar == 0) {
					 * 
					 * int deletarOutras = 0; int index = 1;
					 * 
					 * while (deletarOutras == 0) {
					 * 
					 * String deletarMateria =
					 * JOptionPane.showInputDialog("Remover qual Materia: 1, 2, 3 ou 4 ?");
					 * aluno.getDisciplinas().remove(Integer.valueOf(deletarMateria).intValue() -
					 * index); deletarOutras = JOptionPane.showConfirmDialog(null,
					 * "Remover outra Materia?"); index++;
					 * 
					 * }
					 * 
					 * }
					 */

					/* ========================================================================== */

					/* AULA 9.26 - Criando e Percorrendo a lista de alunos. 21/09/22 */

					/*
					 * Istanciaremos uma lista de Alunos no inicio do método. criamos um laço de
					 * repetição com os dados do aluno e disciplina.
					 * 
					 * Então criaremos um laço de repeticão para nos retornar as informaçoes no
					 * console.
					 */

					/* ====================================================================== */

					alunos.add(aluno);

					aluno.getNumeroFaltas();
					aluno.getNotaTotalLog();
					aluno.getNotaTotalJava();
					aluno.getNotaMediaJava();
					aluno.getNotaMediaLog();

				}

				maps.put(ResultadosAluno.APROVADO, new ArrayList<Aluno>());
				maps.put(ResultadosAluno.REPROVADO, new ArrayList<Aluno>());
				maps.put(ResultadosAluno.RECUPERACAO, new ArrayList<Aluno>());
				maps.put(ResultadosAluno.REPROVADOF, new ArrayList<Aluno>());

				/* for (DadosAluno aluno : alunos) *//*
														 * {
														 * 
														 * /* Procurando um aluno na lista e calculando média aula
														 * (9.27) 22/09/22
														 */

				/*
				 * criamos uma condição
				 * "se objeto dadosAluno retorna um "nome" .equal ao pedido," "execulta a tarefa
				 * de tirar as médias e imprimir o resultado.
				 */

				/*
				 * =====================================================================
				 */

				/* AULA (9.28) 27/09/22 - Procurando e removendo um aluno da lista */

				/*
				 * Ultilizando a condição anterior será execultada a tarefa de remover o objeto.
				 * E passamos a tarefa anterior de tirar as media e o resultado para condição de
				 * senao(else)
				 */

				/*
				 * if (aluno.getNome().equalsIgnoreCase("wellington")) {
				 * 
				 * System.out.println("aluno removido"); alunos.remove(aluno); break;
				 * 
				 * 
				 * } else { System.out.println("Aluno: " + aluno.getNome());
				 * System.out.println("Materias: " + aluno.getDisciplinas());
				 * System.out.println("Nota total: " + aluno.getNotaTotal());
				 * System.out.println("Nota Média: " + aluno.getNotaMedia());
				 * System.out.println("Faltas: " + aluno.getNumeroFaltas());
				 * System.out.println("Resultado: " + aluno.getResultadotxt());
				 * System.out.println("--------------------------------------------------------"
				 * );
				 * 
				 * JOptionPane.showMessageDialog(null, "Aluno : " + aluno.getNome() +
				 * "\n Nota Total: " + aluno.getNotaTotal() + "\n Nota Média: " +
				 * aluno.getNotaMedia() + "\n Resultado : " + aluno.getResultadotxt()); } }
				 */

				/*
				 * =====================================================================
				 */

				/* AULA (9.29)- Percorrendo lista pelas posições */

				/*
				 * obs: Comentei o atributos do aluno para facilitar a Execulsão do
				 * codigo.(linha 123 ao 162)
				 * 
				 */

				/*
				 * for (int pos = 0; pos < alunos.size(); pos++) {
				 * 
				 * DadosAluno aluno = alunos.get(pos);
				 * 
				 * System.out.println("Nome do Aluno: " + aluno.getNome());
				 * System.out.println("Nota Total " + aluno.getNotaTotal());
				 * System.out.println("Media do Aluno: " + aluno.getNotaMedia());
				 * System.out.println("Resultado: " + aluno.getResultadotxt());
				 * System.out.println("-------------------------------------------------------")
				 * ; }
				 */

				/* ========================================================================== */

				/* AULA (9.30) - Substituindo um aluno na lista 03/10/22 seg. */

				/*
				 * Percoreremos a lista alunos e verificaremos se o aluno tem um certo Nome
				 * predefinido se sim, istaciaremos um objeto de "trocar o nome" onde, iremos
				 * setar o novo nome. estaciaremos tbm novas diciplina, notas e faltas e
				 * colocaremos em lista. Entao Setaremos o novo aluno a lista de alunos.
				 * 
				 * imprimire-mos console.
				 * 
				 */

				for (int pos = 0; pos < alunos.size(); pos++) {

					Aluno aluno = alunos.get(pos);

					if (aluno.getNome().equalsIgnoreCase("--")) {

						Aluno trocar = new Aluno();
						trocar.setNome("Aluno Trocado");

						Disciplina disciplina = new Disciplina();
						disciplina.setMateria("Spring");
						disciplina.setFaltas(10);

						trocar.getDisciplinas().add(disciplina);

						alunos.set(pos, trocar);
						aluno = alunos.get(pos);

					}

					/*
					 * System.out.println("Nome do Aluno: " + aluno.getNome());
					 * System.out.println("Nota Total " + aluno.getNotaTotal());
					 * System.out.println("Faltas Total " + aluno.getNumeroFaltas());
					 * System.out.println("Media do Aluno: " + aluno.getNotaMedia());
					 * System.out.println("Resultado: " + aluno.getResultadotxt());
					 * System.out.println("-------------------------------------------------------")
					 * ;
					 */

				}

				/* ====================================================================== */

				/* AULA(9.31) 10/10/22 - Classes e Atributos Estáticos ( Contantes ) */

				/*
				 * São Classes e atributos que sempre possuem o mesmo valor. Não podem ser
				 * alterado e são carregados em todos os lugares do Sistema.
				 * 
				 * Ex: Resultado do Aluno ( Aprovado ). Resultado do Aluno ( Reprovado ).
				 * Resultado do Aluno ( Recuperação).
				 * 
				 * A String "Aprovado","Reprovado","Recuperação". Pode ser uma "Constante",
				 * Assim evitamos de ficar escrevendo o resultado basta chamar a constante.
				 * 
				 * Criaremos um pacote de "Constantes" no programa (src). Criaremos uma classe
				 * com o nome " ResultadosAluno " com 2 atributos: public : Para ser chamado de
				 * qualquer lugar do sistema. statico : Para ser uma condição estática. Então
				 * chamaremos a constante para setar o valor pedido.
				 * 
				 */
				/* ======================================================================= */

				/*
				 * AULA (9.32)- Criando lista de alunos aprovados, reprovados e em recuperação
				 */

				/*
				 * Iremos dividir a lista de Alunos de acordo com o resultado .
				 * 
				 * 1- Instaciaremos 3 listas para o aluno, 1 para cada resultado
				 * (Aprovado,Reprovado ou Recuperão) 2-Percorremos a lista de alunos .
				 * 3-Condicionaremos se o resultado for iqual adicionaremos na lista de
				 * resultado. 4-Execultaremos o codigo no console.
				 */

				for (Aluno aluno : alunos)/* (9.32.2) */ {

					/* (9.32.3) */if (aluno.getResultadotxt().equalsIgnoreCase(ResultadosAluno.APROVADO)) {

						maps.get(ResultadosAluno.APROVADO).add(aluno);

					} else if (aluno.getResultadotxt().equalsIgnoreCase(ResultadosAluno.RECUPERACAO)) {

						maps.get(ResultadosAluno.RECUPERACAO).add(aluno);

					} else if (aluno.getResultadotxt().equalsIgnoreCase(ResultadosAluno.REPROVADO)) {

						maps.get(ResultadosAluno.REPROVADO).add(aluno);

					} else if (aluno.getResultadotxt().equalsIgnoreCase(ResultadosAluno.REPROVADOF)) {

						maps.get(ResultadosAluno.REPROVADOF).add(aluno);
					}

				}

				/* (9.32.4) */System.out.println("------LISTA DOS ALUNOS APROVADOS------");

				for (Aluno aluno : maps.get(ResultadosAluno.APROVADO)) {
					
					System.out.println("Aluno: " + aluno.getNome());

					JOptionPane.showMessageDialog(null, "Aluno: " + aluno.getNome() + "\n Resultado: " + aluno.getResultadotxt()
							+ "\n Nota total Java: " + aluno.getNotaTotalJava() 
							+ "\n Nota Total logica :"+ aluno.getNotaTotalLog() 
							+ "\n Nota media java: " + aluno.getNotaMediaJava()
							+ "\n Nota Media lógica " + aluno.getNotaMediaLog() 
							+ "\n--------------------------------");

				}

				/* (9.32.4) */System.out.println("------LISTA DOS ALUNOS RECUPERAÇÃO------");

				for (Aluno aluno : maps.get(ResultadosAluno.RECUPERACAO)) {
					
					System.out.println("Aluno: " + aluno.getNome());

					JOptionPane.showMessageDialog(null, "Aluno: " + aluno.getNome() + "\n Resultado: " + aluno.getResultadotxt()
					+ "\n Nota total Java: " + aluno.getNotaTotalJava() 
					+ "\n Nota Total logica :"+ aluno.getNotaTotalLog() 
					+ "\n Nota media java: " + aluno.getNotaMediaJava()
					+ "\n Nota Media lógica " + aluno.getNotaMediaLog() 
					+ "\n--------------------------------");
				}

				/* (9.32.4) */System.out.println("------LISTA DOS ALUNOS REPROVADOS------");

				for (Aluno aluno : maps.get(ResultadosAluno.REPROVADO)) {
					
					System.out.println("Aluno: " + aluno.getNome());

					JOptionPane.showMessageDialog(null, "Aluno: " + aluno.getNome() + "\n Resultado: " + aluno.getResultadotxt()
					+ "\n Nota total Java: " + aluno.getNotaTotalJava() 
					+ "\n Nota Total logica :"+ aluno.getNotaTotalLog() 
					+ "\n Nota media java: " + aluno.getNotaMediaJava()
					+ "\n Nota Media lógica " + aluno.getNotaMediaLog() 
					+ "\n--------------------------------");
				}

				for (Aluno aluno : maps.get(ResultadosAluno.REPROVADOF)) {
					
					System.out.println("Aluno: " + aluno.getNome());

					JOptionPane.showMessageDialog(null, "Aluno: " + aluno.getNome() + "\n Resultado: " + aluno.getResultadotxt()
					+ "\n Nota total Java: " + aluno.getNotaTotalJava() 
					+ "\n Nota Total logica :"+ aluno.getNotaTotalLog() 
					+ "\n Nota media java: " + aluno.getNotaMediaJava()
					+ "\n Nota Media lógica " + aluno.getNotaMediaLog() 
					+ "\n--------------------------------");
				}

				/* ================================================================== */

				/* aula (9.33) Separando as listas com HashMap */

				/* E uma forma de se carregar dados e recupera-los atraves de um valor. */

				/* 9.33.0- Comentaremos a aula anterior (9.32)(L-25 a 29) */
				/*
				 * 9.33.1- instaciaremos um hashMap no inicio do método ,logo apos a criação de
				 * lista
				 */
				/* 9.33.2- Declararemos o HashMaps apos a criação da lista de alunos (L-146) */

			} else {

				JOptionPane.showMessageDialog(null, "===Loguin Incorreto===" + "\nVerifique loguin e Senha : ");

			}

			/* aqui */
		} catch (NumberFormatException e) { // capturando um erro específico "NumberFormatException"

			// Imprime o erro no console Java
			e.printStackTrace();

			// Mensagem de erro + causa.
			System.out.println("Mensagen de Erro: " + e.getMessage());

			// Mensagem do erro que aparece para o usuario
			JOptionPane.showMessageDialog(null, "Erro ao processar notas.");

			// Mensagem de erro separadas em topicos.
			for (int pos = 0; pos < e.getStackTrace().length; pos++) {
				System.out.println("tipos do Erro : " + e.getMessage());
				System.out.println("Classe : " + e.getStackTrace()[pos].getClassName());
				System.out.println("Metodo : " + e.getStackTrace()[pos].getMethodName());
				System.out.println("Numero da Linha : " + e.getStackTrace()[pos].getLineNumber());
				System.out.println("----------------------------------------");
			}
		} catch (NullPointerException e) {// capturando um erro específico "NullPointerException"

			// Imprime o erro no console Java
			e.printStackTrace();

			// Mensagem de erro separadas em topicos.
			/*
			 * for (int pos = 0; pos < e.getStackTrace().length; pos++) {
			 * System.out.println("tipos do Erro : " + e.getMessage());
			 * System.out.println("Classe : " + e.getStackTrace()[pos].getClassName());
			 * System.out.println("Metodo : " + e.getStackTrace()[pos].getMethodName());
			 * System.out.println("Numero da Linha : " +
			 * e.getStackTrace()[pos].getLineNumber());
			 * System.out.println("----------------------------------------"); }
			 */
		} catch (FileNotFoundException e) {// capturando um erro genericos.

			// Imprime o erro no console Java
			e.printStackTrace();

		} finally {// Sempre execulta ocorendo erro ou nao .

			JOptionPane.showInternalMessageDialog(null, "MENSAGEM DO FINALLY !!");

		}

	}

	public static void lerArquivo() throws FileNotFoundException {

		// mandando pra cima uma excecao simples
		// temos de mandar o erro da excecao para cima neste caso
		// (FileNotFoundException)

		// File file = new File("c://Arquivo.txt");
		// Scanner scanner = new Scanner(file);

		/*
		 * //mandando pra cima uma excecao customizada // temos de mandar a classe da
		 * excecao custumizada para cima neste caso (ExcecaoProcessarNota) try { File
		 * file = new File("c://Arquivo.txt"); Scanner scanner = new Scanner(file);
		 * }catch (FileNotFoundException e) { throw new
		 * ExcecaoProcessarNota(e.getMessage()); }
		 */

	}

}
