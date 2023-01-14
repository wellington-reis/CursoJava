package thread_e_programação_paralela_ou_concorrente;

public class AULA14_5_Thread_em_objeto_e_o_Runnable {

	/*
	 * Runnable é uma interface que tem por objetivo separar em um método a Thread.
	 * nos dando a possibilidade de explorar , organizar e usar=la como um objeto
	 * podendo ser instanciada de qualquer lugar do sistema.
	 */

	public static void main(String[] args) throws InterruptedException {

		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
		
		Thread threadNotaE = new Thread(thread2);
		threadNotaE.start();

	}

	// Criaremos um método fora do metodo "main" onde istanciaremos o runnable.
	private static Runnable thread1 = new Runnable() {

		// Será criado esse método auxiliar onde iremos colocar todo nossa tarefa.
		@Override
		public void run() {

			for (int pos = 0; pos < 10; pos++) {

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(" sistema enviando email e 2° plano ");

			}

		}
	};
	
	//===============================================================
	
	private static Runnable thread2 = new Runnable() {

		// Será criado esse método auxiliar onde iremos colocar todo nossa tarefa.
		@Override
		public void run() {

			for (int pos = 0; pos < 10; pos++) {

				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(" sistema enviando Nota Fiscal Eletronica em 2° plano ");

			}

		}
	};
}
