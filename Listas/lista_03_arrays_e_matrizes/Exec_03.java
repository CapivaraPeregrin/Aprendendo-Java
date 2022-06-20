package lista_arrays_e_matrizes;

import java.util.Scanner;

public class Exec_03 {

	public static void main(String[] args) {
		
	  /*ESCREVA UM PROGRAMA QUE LEIA E ARMAZENE 10 N�MEROS EM UM ARRAY. AP�S ISSO O PROGRAMA DEVE
		SOLICITAR QUE O USU�RIO INFORME MAIS UM N�MERO. O PROGRAMA DEVE INFORMAR QUANTAS VEZES ESSE
		N�MERO APARECE NO ARRAY.*/

		System.out.println("Bem vindo; \nO presente programa l� 10 n�meros; Ap�s isso ele solicita um n�mero"
						+ "\na ser procurado informando quantas vezes ele se encontra entre os 10.\n");

//		Capta��o de entradas e c�lculo	

		Scanner input = new Scanner(System.in);
		double[] numeros = new double[10];
		int contadorAparecimento = 0;

		for (int i = 0; i < numeros.length; ++i) {
			System.out.println("Por favor insira o " + (i + 1) + "� n�mero:");
			numeros[i] = input.nextDouble();
		}

		System.out.println("Por favor insira um n�mero para ser pesquisado entre os demais:");
		double numeroPesquisado = input.nextDouble();

		for (int i = 0; i < numeros.length; ++i) {
			if (numeros[i] == numeroPesquisado) {
				++contadorAparecimento;
			}
		}

//		Apresenta��o de resultados

		System.out.println("\n-------------------------------------------------------------------------------"
						+ "\nO n�mero " + numeroPesquisado + " apareceu " 
						+ contadorAparecimento + " vezes entre os 10 n�meros inseridos.");

		input.close();
	}
}
