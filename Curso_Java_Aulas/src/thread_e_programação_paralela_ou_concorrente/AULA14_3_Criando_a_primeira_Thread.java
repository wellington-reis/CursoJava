package thread_e_programação_paralela_ou_concorrente;

import javax.swing.JOptionPane;

public class AULA14_3_Criando_a_primeira_Thread {

	public static void main(String[] args) {

		// 01*- Instanciaremos o método Thread e no final da chave a iniciaremos pelo
		// "START"
		new Thread() {

			// 02 - Criaremos uma interface onde execultaremos o codigo em 2º plano
			public void run() {

				// 03 - Escrevemos o codigo que queremos execultar em 2° plano
				for (int pos = 0; pos < 10; pos++) {

					// A função "sleep" nos obriga a fazer um tratamento de execeção
					// com Try / catch .
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {

						e.printStackTrace();
					}

					// quero execultar este envio com um tempo de parada.
					System.out.println("Execultadando alguma rotina, por exemplo envio de email");

				}
				// fim do codigo

			};

		}.start(); // 01.1- O start inicia a thread para execultar o codigo em paralelo.

		// Codigo do sistema do usuario continua o fluxo de trabalho.
		System.out.println("CHEGOU AO FIM DO COGIGO DO TESTE DO THREAD ");

		// O Sistema seguindo o fluxo e o thread a tarefa escolhida execultando em 2º
		// plano.
		JOptionPane.showMessageDialog(null, "O Programa esta execultado em 2º plano");

	}
}
