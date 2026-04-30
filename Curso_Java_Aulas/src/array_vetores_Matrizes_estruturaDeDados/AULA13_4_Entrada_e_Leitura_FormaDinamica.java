package array_vetores_Matrizes_estruturaDeDados;

import javax.swing.JOptionPane;

public class AULA13_4_Entrada_e_Leitura_FormaDinamica  {

	/*
	 * Iremos pedir agora para o usuario a quantidade de elementos que vai dentro do
	 * Array e quais os valores vai em cada um dos elementos
	 */

	public static void main(String[] args) {

		String Elementos = JOptionPane.showInputDialog("Quantidade de Elementos?");

		// Para Organiza��o das aulas criaremos instancias diferentes.

		double[] Notas = new double[Integer.parseInt(Elementos)];

		for (int pos = 0; pos < Notas.length; pos++) {

			String valorElementos = JOptionPane.showInputDialog("Qual o valor do Elemento ?" + pos);
			Notas[pos] = Double.valueOf(valorElementos);

		}

		for (int posArray = 0; posArray < Notas.length; posArray++) {

			System.out.println("Nota " + (posArray + 1) + " � = " + Notas[posArray]);
		}

		System.out.println("======================== FIM DA AULA 13.4 ========================== ");

	}

}
