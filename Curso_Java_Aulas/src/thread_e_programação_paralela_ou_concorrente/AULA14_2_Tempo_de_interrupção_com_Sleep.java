package thread_e_programação_paralela_ou_concorrente;

import javax.swing.JOptionPane;

public class AULA14_2_Tempo_de_interrupção_com_Sleep {

	public static void main(String[] args) throws InterruptedException {
		
		new Thread() {
			
			public void run() {
				
				// codigo da rotina que quero execultar em paralelo
				for (int pos = 0; pos < 10; pos++) {
					
					// o Sleep faz com que tenha uma parada na execução do codigo
					// execulta em milisegundo ( 1000ms = 1segundo )
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					
					//quero execultar este envio com um tempo de parada.
					System.out.println("Execultadando alguma rotina, por exemplo envio de email");
					
				}
				//fim do codigo
				
				
			};
			
		}.start();// O start inicia a thread para execultar o codigo em paralelo.
		 
	
		
		//Codigo do sistema do usuario continua o fluxo de trabalho.
		System.out.println("CHEGOU AO FIM DO COGIGO DO TESTE DO THREAD ");
		
		JOptionPane.showMessageDialog(null, "O Programa esta execultado em 2º plano");
		
	}



}
