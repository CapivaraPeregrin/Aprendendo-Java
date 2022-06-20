package lista_arrays_e_matrizes;

import java.util.Scanner;

public class Exec_10_ordenacao_bolha {

	public static void main(String[] args) {

		/*FA�A UM PROGRAMA QUE LEIA E ARMAZENE 10 N�MEROS EM UM ARRAY. AP�S ISTO, O
		 PROGRAMA DEVE ORDENAR OS N�MEROS E APRESENTAR O ARRAY ORDENADO DE FORMA
		 CRESCENTE.*/

		System.out.println("Bem vindo; \nO presente programa l� 10 n�meros;"
				+ " Ap�s isso ele organiza e apresenta os n�meros em oredem crescente.\n");

//		Capta��o de entradas

		Scanner input = new Scanner(System.in);
		double[] numeros = new double[10];
		
		for (int i = 0; i < numeros.length; ++i) {
			System.out.print("Por favor insira o " + (i + 1) + "� n�mero:");
			numeros[i] = input.nextDouble();
		}
		
//		Organiza lista
		
		for (int i = 0; i < numeros.length ; ++i) {
			for (int j = 0; j < (numeros.length - 1 ) ; ++j) {
				if (numeros[j] > numeros[(j+1)] ) {
					double memoriaDeTroca = 0;
					memoriaDeTroca = numeros[j];
					numeros[j] = numeros[j+1];
					numeros[j+1] = memoriaDeTroca;
				}
			}
		}
	
		 
//		Apresenta��o de resultados

		System.out.println("\n------------------------------\nNa ordem crescente:\n");
		for ( int i = 0; i < numeros.length; ++i ) {
			System.out.println("O " + (i+1) + "� n�mero �: " + numeros[i]);
		}
		
		input.close();
	}
}
