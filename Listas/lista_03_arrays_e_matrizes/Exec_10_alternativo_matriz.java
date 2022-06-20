package lista_arrays_e_matrizes;

import java.util.Scanner;

public class Exec_10_alternativo_matriz {

	public static void main(String[] args) {

		/*FA�A UM PROGRAMA QUE LEIA E ARMAZENE 10 N�MEROS EM UM ARRAY. AP�S ISTO, O
		 PROGRAMA DEVE ORDENAR OS N�MEROS E APRESENTAR O ARRAY ORDENADO DE FORMA
		 CRESCENTE.*/

		System.out.println("Bem vindo; \nO presente programa l� 10 n�meros;"
				+ " Ap�s isso ele organiza e apresenta os n�meros em oredem crescente.\n");

//		Capta��o de entradas
		
		Scanner input = new Scanner(System.in);
		double[] numeros = new double[10];
		double[][] matriz = new double[numeros.length][2];
		
		for (int i = 0; i < numeros.length; ++i) {
			System.out.print("Por favor insira o " + (i + 1) + "� n�mero:");
			numeros[i] = input.nextDouble();
			
//		C�pia de dados do array para a 1� coluna
			
			matriz[i][0] = numeros[i];
		}
		
//		Pontua os valores da matriz na segunda coluna 
		
		for (int i = 0; i < numeros.length ; ++i) {
			for (int j = 0 ; j < numeros.length; ++j) {
				if ( matriz[i][0] > matriz[j][0] ) {
					matriz[i][1] += 1;
				}				
			}
		}
		
//		Reordena o array usando potua��o da matriz

		for (int i = 0; i < numeros.length; ++i) {
			int pontuacao = (int) matriz[i][1];
			numeros[pontuacao]=matriz[i][0];
		}
		
//		Apresenta��o de resultados

		System.out.println("\n------------------------------\nNa ordem crescente:\n");
		for ( int i = 0; i < numeros.length; ++i ) {
			System.out.println("O " + (i+1) + "� n�mero �: " + numeros[i]);
		}
		
		input.close();
	}
}
