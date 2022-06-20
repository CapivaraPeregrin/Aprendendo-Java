package lista_arrays_e_matrizes;

import java.util.Scanner;

public class Exec_02 {

	public static void main(String[] args) {

	  /*ESCREVA UM PROGRAMA QUE LEIA 10 N�MEROS E ARMAZENE-OS EM UM ARRAY. AP�S AS LEITURAS O
		PROGRAMA DEVE SOLICITAR AO USU�RIO UM NOVO N�MERO. O PROGRAMA DEVE FAZER UMA BUSCA NO ARRAY
		E ESCREVER A MENSAGEM �ACHEI�, SE O N�MERO ESTIVER ENTRE OS 10 ARMAZENADOS, OU �N�O ACHEI�
		CASO CONTR�RIO.*/
		
		System.out.println("Bem vindo; \nO presente programa l� 10 n�meros; Ap�s isso ele solicita um n�mero"
							+ "\na ser procurado, informando se ele se encontra entre os 10.\n");
		
//		Capta��o de entradas e c�lculo	

		Scanner input = new Scanner(System.in);
		double[] numeros = new double[10];
		String respostaDaPesquisa = "N�o Achei";

		for ( int i = 0; i < numeros.length; ++i ) {
			System.out.println("Por favor insira o " + (i + 1) + "� n�mero:");
			numeros[i] = input.nextDouble();
		}
		
		System.out.println("Por favor insira um n�mero para ser pesquisado entre os demais:");
		double numeroPesquisado = input.nextDouble();

		for ( int i = 0; i < numeros.length; ++i ) {
			if ( numeros[i] == numeroPesquisado ) {
				respostaDaPesquisa = "Achei";		
			}
		}
		
//		Apresenta��o de resultados

		System.out.println("\n-----------------------------------\n            " + respostaDaPesquisa);

		input.close();
	}
}
