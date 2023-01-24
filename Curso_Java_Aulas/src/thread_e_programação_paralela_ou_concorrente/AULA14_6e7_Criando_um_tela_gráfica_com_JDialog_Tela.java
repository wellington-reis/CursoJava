package thread_e_programação_paralela_ou_concorrente;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



// Vamos extender a "JDialog que é uma extensão do javax.Swing esse que e um frameWork do java . "
public class AULA14_6e7_Criando_um_tela_gráfica_com_JDialog_Tela extends JDialog {
	
	
	private JPanel jPanel = new JPanel(new GridBagLayout());//Painel de componentes.
	
	// 1º componente criado da tela. 
	private  JLabel descriçãoHora = new JLabel("Time Thread 1 ");// elemento no painel
	
	// 2º componente criado da tela. (AULA 14_7.1)
	private JTextField mostraTempo = new JTextField(); // elemento no painel
	
	// 3º componente criado da tela. (AULA 14_7.1)
	private  JLabel descriçãoHora2 = new JLabel("Time Thread 2 ");// elemento no painel
	
	// 4º componente criado da tela. (AULA 14_7.1)
	private JTextField mostraTempo2 = new JTextField(); // elemento no painel
	
	// Criação dos botões "Start" e " Stop " ( AULA 14_8 )
	
	private JButton jButton = new JButton("Start");
	
	private JButton jButton2 = new JButton("Stop");
	
	/*Sempre que for iniciado um objeto de tela todas as informaçoes padroes devemos 
	 *Colocar dentro de um método construtor.
*/
	public AULA14_6e7_Criando_um_tela_gráfica_com_JDialog_Tela() {/*Execulta oque deve ser iniciado na execução */
		
		// Cria o titulo da Tela
		setTitle("Minha tela de Time com Thread");
		
		// Dimensiona a tela
		setSize(new Dimension(240, 240));
		
		// Trava a tela no tamanho escolhido.
		setResizable(false);
		
		//Para centralizar a tela
		setLocationRelativeTo(null);/*foi passado "null" pq nao temos outra tela para ser 
		relativo.
		*/
		//1º parte concluida.
		
		//========================================================================
		
		// 2º parte
		
		//AULA14_7 - Conhecendo o GridBagConstraints gerenciador de posicionamento e layout
		
		//AULA14_7.1 -  ADICIONANDO MAIS COMPONENTES NA TELA
		
		/*Agora iremos construir os dados internos de nossa tela usando um 
		 *controlador de direcionamento de objetos na tela. com isso podendo ter varios
		 *objetos em localização diferente. 
		 */
		
		// É preciso instanciar este controlador de posicionamento do JavaSwit.
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		
		// Agora temos de definir parametros o controlador.
		/* Pegando por exemplo imagine uma estante de livros no meio da tela que criamos 
		 * onde o "X" representa linha
		 * e o "Y" a coluna */
		
		gridBagConstraints.gridx = 0;// Iremos iniciar na linha 0 .
		gridBagConstraints.gridy = 0;// e na coluna 0
		gridBagConstraints.gridwidth = 2;//( AULA 14_8 _ OBS1 - ) 
		
		
		
		
		//(AULA 14_18.1) ANCORAGEM DOS ELEMENTOS A ESQUERDA DA TELA.
		gridBagConstraints.anchor = gridBagConstraints.WEST;
		
		//(AULA 14_18.1) ESPAÇAMENTOS DOS ELEMENTOS NA TELA (TOP, LEFT, BOTTON, RIGHT).
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);// SENTIDO ANT-HORARIO.
		
		
		/*Voltando a imaginar uma estante de livro vai ser o primeiro vão. 
		 *Que no Swing chamamos de painel ( JPanel )*/
		
		/*Iremos criar agora os paineis da tela
		 *Abaixo da declaração da Classe fora do construtor criaremos uma extensão "JPanel - javax.swing" */
		
		
		//Vamos dizer para o controlador o tamanho do nosso componente criado.
		
		//Componente 01
		descriçãoHora.setPreferredSize(new Dimension(200, 25));
		
		//Componente 02 ( AULA 14_7.1 )
		mostraTempo.setPreferredSize(new Dimension(200, 25));
		mostraTempo.setEditable(false);
		
		//Componente 03 ( AULA 14_7.1 )
		descriçãoHora2.setPreferredSize(new Dimension(200, 25));
		
		//Componente 04 ( AULA 14_7.1 )
		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		mostraTempo2.setEditable(false);
		
		
		//Botão Start ( AULA 14_8 )
		
		jButton.setPreferredSize(new Dimension(92, 25));
		
		//Botão Stop ( AULA 14_8 )
		
		jButton2.setPreferredSize(new Dimension(92, 25));
		
	
		
		
		/*Agora iremos adicionar o elemento no painel ( fora do construtor )
		 *E também em qual painel ele sera colocado neste caso o 
		 *Controlador foi estipulado "X"= 0 e "Y" = 0. */
		jPanel.add(descriçãoHora, gridBagConstraints);
		
		
		/*//(AULA 14_7.1) Para que fique um elemento em cima do outro prescisa-mos 
		 * mudar a posição do eixo "Y" acrescentando +1 
		 * No Controlador de posicionamento */
		
		gridBagConstraints.gridy ++ ;// mudança no grid"y" fazendo o elemento passar para linha de baixo.
		jPanel.add(mostraTempo, gridBagConstraints);
		
		// AULA 14_7.1 ADD NO PAINEL OS OUTROS 2 COMPONENTES.
		gridBagConstraints.gridy ++ ;
		jPanel.add(descriçãoHora2, gridBagConstraints);
		
		gridBagConstraints.gridy ++ ;
		jPanel.add(mostraTempo2, gridBagConstraints);
		
		//AULA 14_8 ADD BOTOES NO PAINEL
		gridBagConstraints.gridwidth = 1;// OBS2 -
		
		gridBagConstraints.gridy ++;
		jPanel.add(jButton, gridBagConstraints);
		
		gridBagConstraints.gridx ++;
		jPanel.add(jButton2, gridBagConstraints);
		
		//===========================================================================
	
		/* 3° PARTE - AULA 14_8 ADICIONANDO BOTOES JBUTTON */
		
		/* Agora Iremos adicionar botoes em nossa tela para controlar a nossas Threads.
		 * Criaremos mais 2 elementos na nossa tela ( fora do Construtor ).
		 * "OBS1"- Teremos um problema no alinhamento ja que temos 2 Botoes ocupando 
		 * 2 colunas ao inves de linhas como era nos elementos acima. 
		 * Então teremos de informar o gerenciador que os elementos ocuparam o
		 * espaço de  2 colunas . 
		 * "OBS2" - agora informare-mos ao gerenciador que os 2 botoes vão ocupar o 
		 * espaço de 1 coluna.
		 * 14_8.1 - AGORA IREMOS AJUSTAR EM NOSSO GERENCIADOR A 
		 * ANCORAGEM E OS ESPAÇOS ENTRE  OS COMPONENTES (TOP, LEFT, BOTTON, RIGHT).
		 * 14_8.2 - IREMOS AGORA TRAVAR OS CAMPOS DE IMPUT PARA NAO HAVER DIGITAÇÃO.*/
		
		
		
		
		//Agora vamos adicionar o Painel na tela
		add(jPanel, BorderLayout.WEST);// BordeLayout.west e para ele ficar a esquerda.
		
		//Esse comando sempre deve ser o ultimo comando na ordem logica.
		setVisible(true);// Permite a visualização da tela.	
	}
}
