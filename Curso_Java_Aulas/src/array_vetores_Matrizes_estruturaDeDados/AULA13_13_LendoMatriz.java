package array_vetores_Matrizes_estruturaDeDados;

/* Para Ler-mos uma Matriz ultilizaremos um for dentro do outro.
 * Um for lerá o Elemento e o outro a posição */

public class AULA13_13_LendoMatriz {

	public static void main(String[] args) {

		// Instanciação de matriz
		int notas2[][] = new int[2][3];

		// PRONUNCIA-SE DESTA FORMA:
		notas2[0][0] = 90; // A MATRIZ NOTAS2 NA LINHA 0 NA COLUNA 0 RECEBE 90 
		notas2[0][1] = 70; // A MATRIZ NOTAS2 NA LINHA 0 NA COLUNA 1 RECEBE 70 
		notas2[0][2] = 50; // A MATRIZ NOTAS2 NA LINHA 0 NA COLUNA 2 RECEBE 50 

		// PRONUNCIA-SE DESTA FORMA:
		notas2[1][0] = 10; // A MATRIZ NOTAS2 NA LINHA 1 NA COLUNA 0 RECEBE 10 
		notas2[1][1] = 30; // A MATRIZ NOTAS2 NA LINHA 1 NA COLUNA 1 RECEBE 30 
		notas2[1][2] = 20; // A MATRIZ NOTAS2 NA LINHA 1 NA COLUNA 2 RECEBE 20 
		
		System.out.println(notas2);
		
		// Esse for percorre as linhas
		for (int poslinha = 0; poslinha < notas2.length; poslinha++) {
					
			System.out.println("----------------------------------------------");
			
			// Esse for percorre as Colunas
			for (int posColuna = 0; posColuna < notas2[poslinha].length; posColuna++) {
				
				System.out.println("Valor da matriz : " + notas2[poslinha][posColuna]);
				
				
				
			}
		}

	}

}
