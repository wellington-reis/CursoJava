package array_vetores_Matrizes_estruturaDeDados;

public class AULA13_1e2e3 {
	
	public static void main(String[] args) {
		
		// Aula 13-2- Criando o Primeiro Array

		/*
		 * O array e identificado pelo vetor [] que pode ser adicionado a frente da
		 * tipagem do objeto "doule" ou na frente frente da variável "notaJava". Ao
		 * instanciar um Array, note que o Array sempre acompanha a tipagem dos dados E
		 * quantidade de posiçoes definidas " new "double" "[4]" "
		 */

		// Ex:

		double[] notas = new double[4];
		// O Array "notas" do tipo double recebe um novo Array com 4 posiçoes

		// iremos imprimir na tela somente para testar com debug se foi instanciado o
		// Array.
		System.out.println("");

		/*
		 * Ao debugar o codigo podemos ver que aparece 4 posiçoes estando 0.0 em todas
		 * pois ainda nao temos os valores adicionados.
		 */

		// Adicionando Valores ao Array

		notas[0] = 10.3;// o Array "primeiroArray" no Elemento 0 recebe 10.3.
		notas[1] = 20.4;// o Array "primeiroArray" na Elemento 1 recebe 20.4.
		notas[2] = 30.5;// o Array "primeiroArray" na Elemento 2 recebe 30.5.
		notas[3] = 40.1;// o Array "primeiroArray" na Elemento 3 recebe 40.1.

		System.out.println("");
		/*
		 * Ao debugar o codigo novamente podemos ver que aparece 4 elementos agora com
		 * os valores definidos .
		 */

		/*
		 * OBS: Caso vc erre e adicione mais elementos doque pedido no Array ele
		 * estourar uma excessão. caso coloca a menos ficar um elemento com 0.0
		 */

		// ==========================================================================

		// AULA 13_3 - Recuperando valores no Array

		/*
		 * Para recuperar os valores dentro do Array iremos ultilizar um laço de
		 * repetição "for" que ira "varrer" o array e nos retornar os valores nele
		 * contido.
		 */

		for (int posArray = 0; posArray < 4; posArray++) {

			// imprimi no console os valores no array.
			System.out.println(" Os valores do array sáo : " + notas[posArray]);

		}

		System.out.println("======================== FIM DA AULA 13.3 ========================== ");

	}

}
