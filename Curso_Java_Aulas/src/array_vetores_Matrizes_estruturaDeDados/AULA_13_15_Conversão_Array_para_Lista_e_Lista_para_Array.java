package array_vetores_Matrizes_estruturaDeDados;

import java.util.Arrays;
import java.util.List;

public class AULA_13_15_Conversão_Array_para_Lista_e_Lista_para_Array {

	public static void main(String[] args) {

		// criaremos uma Variavel de String
		String texto = "Wellington, Curso Java, 80, 70, 90, 89";

		// Criamos um Array tipo String com a referencia de "valoresArray"
		// Atribuimos a variavel texto
		// Chamamos a rotina .Split e no parametro"()" passamos o separador " , " .
		String[] valoresArray = texto.split(",");

		// imprimir para fazer e fazer o debug.
		System.out.println("Nome : " + valoresArray[0]);
		System.out.println("Curso : " + valoresArray[1]);
		System.out.println("Nota 1 : " + valoresArray[2]);
		System.out.println("Nota 2 : " + valoresArray[3]);
		System.out.println("Nota 3 : " + valoresArray[4]);
		System.out.println("Nota 4 : " + valoresArray[5]);
		
		System.out.println("========================================");
		
//==============================================================
		
		/* CONVERTENDO UM ARRAY EM UMA LISTA *///aula 03/01 
		
		//Cria-se uma lista do tipo String com a referencia list
		List<String> list = Arrays.asList(valoresArray);
		
		//VARRENDO A LISTA
		
		for (String string : list) {
			
			System.out.println(string);
			
		}
		
		/*CONVERTER UMA LISTA PARA ARRAY*/
		String[]conversaoArray = list.toArray(new String [6]);
		
		//VARRENDO O ARRAY 
		for (int i = 0; i < conversaoArray.length; i++) {
			
			System.out.println(conversaoArray[i]);
			
		}

	}
}
