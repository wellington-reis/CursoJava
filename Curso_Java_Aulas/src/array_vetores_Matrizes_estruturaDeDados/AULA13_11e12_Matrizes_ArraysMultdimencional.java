package array_vetores_Matrizes_estruturaDeDados;

public class AULA13_11e12_Matrizes_ArraysMultdimencional {

	/*
	 * Matriz e uma Array de um Array Imagine uma planilha de excel, O primeiro
	 * vetor "[]" é a linha da planilha O segundo vetor "[]" é a coluna da planilha
	 * A linha Chamamos de "ElEMENTO" e a coluna de "POSIÇÃO"
	 * 
	 * 
	 * A Primeira coluna e nao e contada
	 */

	public static void main(String[] args) {

		// Nesta matriz temos 1 linha com 3 colunas.
		int notas[][] = new int[1][3];// Instanciação de matriz

		// PRONUNCIA-SE DESTA FORMA:
		notas[0][0] = 90; // NA 1° LINHA O ELEMENTO "0" na POSIÇÃO "0" RECEBE 90
		notas[0][1] = 70; // NA 1° LINHA O ELEMENTO 0 na POSIÇÃO 1 RECEBE 70
		notas[0][2] = 50; // NA 1° LINHA O ELEMENTO 0 na POSIÇÃO 2 RECEBE 50

		// Nesta matriz temos 2 linha com 3 colunas.
		// Se Pronuncia 2 ELEMENTOS com 3 POSICÕES.

		int notas2[][] = new int[2][3];// Instanciação de matriz

		// PRONUNCIA-SE DESTA FORMA:
		notas2[0][0] = 90; // NA 1° LINHA O 1° ELEMENTO na POSIÇÃO 0 RECEBE 90
		notas2[0][1] = 70; // NA 1° LINHA O 1° ELEMENTO na POSIÇÃO 1 RECEBE 70
		notas2[0][2] = 50; // NA 1° LINHA O 1° ELEMENTO na POSIÇÃO 2 RECEBE 50

		// PRONUNCIA-SE DESTA FORMA:
		notas2[1][0] = 10; // NA 2° LINHA O 2° ELEMENTO na POSIÇÃO 0 RECEBE 10
		notas2[1][1] = 30; // NA 2° LINHA O 2° ELEMENTO na POSIÇÃO 1 RECEBE 30
		notas2[1][2] = 20; // NA 2° LINHA O 2° ELEMENTO na POSIÇÃO 2 RECEBE 20

	}

}
