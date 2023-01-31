package thread_e_programacao_paralela_ou_concorrente;

import javax.swing.JOptionPane;

public class AULA14_4_Processamento_concorrente_entre_duas_Thread {

	public static void main(String[] args) throws InterruptedException {
		
		/*Com o Thread pode fazer quantas execusões paralelas forem precisas*/

		// ==========EXECUSÃO PARALELA 1=============================

		new Thread() {

			public void run() {

				for (int i = 0; i < 10; i++) {

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Enviando Email em 2º plano ");

				}

			};

		}.start();
		
		/* Observe a o tempo maior da 2 execulsão.*/

		// ==========EXECUSÃO PARALELA 2=============================

		new Thread() {

			public void run() {

				for (int i = 0; i < 10; i++) {

					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Enviando Notas Fiscais em 2º plano ");

				}

				System.out.println("Fim da execusão paralela ");

			};

		}.start();

		JOptionPane.showMessageDialog(null, "O SISTEMA ESTA SENDO EXECULTADO :");

		JOptionPane.showMessageDialog(null, "O SISTEMA CONTINUA SENDO EXECULTADO :");
	}
}
