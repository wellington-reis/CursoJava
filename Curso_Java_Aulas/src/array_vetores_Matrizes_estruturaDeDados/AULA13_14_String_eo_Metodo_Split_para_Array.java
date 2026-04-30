package array_vetores_Matrizes_estruturaDeDados;

public class AULA13_14_String_eo_Metodo_Split_para_Array {
	
	/* Split e uma rotina onde se pega um texto (String) e separa ele 
	 * em Arrays.  
	 * Os padr�es de separa��o pode ser : ( , .  - _  / | ) */
	
	public static void main(String[] args) {
		// criaremos uma Variavel de String
		String texto = "Wellington, Curso Java, 80, 70, 90, 89";
		
		//Criamos um Array tipo String com a referencia de "valoresArray"
		//Atribuimos a variavel texto
		//Chamamos a rotina .Split e no parametro"()" passamos o separador " , " .
		String[] valoresArray = texto.split(",");
		
		//imprimir para fazer e fazer o debug.
		System.out.println("Nome : "+valoresArray[0]);
		System.out.println("Curso : "+valoresArray[1]);
		System.out.println("Nota 1 : "+valoresArray[2]);
		System.out.println("Nota 2 : "+valoresArray[3]);
		System.out.println("Nota 3 : "+valoresArray[4]);
		System.out.println("Nota 4 : "+valoresArray[5]);
		
	}

}
