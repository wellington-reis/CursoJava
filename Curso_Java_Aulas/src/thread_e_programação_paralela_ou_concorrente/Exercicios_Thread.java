package thread_e_programação_paralela_ou_concorrente;

public class Exercicios_Thread {
	public static void main(String[] args) throws InterruptedException {

		// AULA_14_2_Tempo_de_interrupção_com_Sleep

		// Criar uma variavel de Alunos com 10 nomes;
		String alunos = "Wellington, Eliz, Nino, Ana, Carlito, Amelia, Antonio, Luciene, Paulo, Yoshi";

		// usando o metodo split transforme os dados da variavel em um array;
		String[] arrayAlunos = alunos.split(",");

		// varrer o Array e adicionar a frase" MANDANDO O EMAIL" para o aluno

		// 02- Criar um tempo de interrupção de 2 seg.
		// 03-imprimir no console.

		System.out.println("==========FIM DO EXERCIO=================");

		// ================================================================

		// AULA14_3_Criando_a_primeira_Thread

		// Criar uma thread para o codigo acima para ele rodar em segundo plano.
		// Criar uma mensagem para o usuario.
		// observar a thread ser execultada.

		System.out.println("==========FIM DO EXERCIO=================");

		// ===================================================================

		// AULA14_4_Processamento_concorrente_entre_duas_ou_mais_Thread

		// crie mais uma tarefa de enviar Notas Fiscais para o aluno
		// Crie uma mensagem para o usuario informando.
		// observar a thread ser execultada.

		System.out.println("==========FIM DO EXERCIO=================");

		// =============================================================

		// AULA14_5_Thread_em_objeto_e_o_Runnable

		Thread threadEmail = new Thread(thread1);
		threadEmail.start();

		Thread threadNota = new Thread(thread2);
		threadNota.start();

	}

	private static Runnable thread1 = new Runnable() {

		@Override
		public void run() {

			String alunos2 = "Wellington, Eliz, Nino, Ana, Carlito, Amelia, Antonio, Luciene, Paulo, Yoshi";
			String[] arrayAlunos = alunos2.split(",");

			for (int i = 0; i < arrayAlunos.length; i++) {

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Enviando Email para Aluno " + arrayAlunos[i]);

			}

		}
	};

	// ==========================================
	private static Runnable thread2 = new Runnable() {

		@Override
		public void run() {

			String alunos2 = "Wellington, Eliz, Nino, Ana, Carlito, Amelia, Antonio, Luciene, Paulo, Yoshi";
			String[] arrayAlunos = alunos2.split(",");

			for (int i = 0; i < arrayAlunos.length; i++) {

				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Enviando Notas Fiscais para Aluno " + arrayAlunos[i]);

			}

			System.out.println("==========FIM DO EXERCIO=================");

			// =============================================================

		}

	};
}
