package array_vetores_Matrizes_estruturaDeDados;

public class AULA13_5_Diferentesformas_de_atribuição_de_valores {

	// Veremos Nesta aula outras maneiras de se trabalhar com Arrays
	public static void main(String[] args) {

		/*
		 * Vimos que para se criar um Array temos que instanciar-mos o tipo. a variavel
		 * e a quantidade de posiçoes contidas no Array. 
		 * Ex: double[] Valores = newdouble[4];
		 * Agora veremos que podemos passar de forma direta: usando os vetores "{ }"Onde
		 * os valores e os elementos são separadas por virgulas.
		 *
		 * Ex:
		 */
				  //posição:   0     1     2    3       
		double[] valores = { 10.3, 11.5, 13.3, 14.2 };
		
	/*OBS: 
	 * Lembrando que que se passar-mos qualquer outro dado que nao seja um double (0.0)
	 * o codigo vai quebrar.
	 * 
	 * Para se usar varios tipos de dados faremos o Array como "String" e converte-mos para double ou interio 
	 * quando preciso.*/
		
		//EX:
		String[] valores2 = {"Wellington", " 42 ", "10.1", "10.2"};
	/*
	 * Acima temos dados do tipo String, porem temos numeros em string que pode ser convertidos usando
	 *"Interger . ParseInt para números inteiros" e double.
	 *value String para numeros double.
	 *Para recuperar esses valores é igualmente ao array convencional.
	 *OBS: CADA DADO DEVE SER REPRENSENTANDO POR UMA STRING SEPARADO POR VIRGULA.*/
	
		
	for (int i = 0; i < valores2.length; i++) {
		
		System.out.println("Os Valores do array na posição " + i + "é = " + valores2[i]);
		System.out.println("----------------------------");
	}
	

		
		
	}
}
