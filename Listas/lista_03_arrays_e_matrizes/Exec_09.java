package lista_arrays_e_matrizes;

import java.util.Scanner;

public class Exec_09 {

	public static void main(String[] args) {

	  /*FA�A UM PROGRAMA QUE LEIA UMA MATRIZ A DE TAMANHO 4X4. O PROGRAMA DEVE 
		IDENTIFICAR QUAL O MENOR ELEMENTO E A SUA POSI��O NA MATRIZ*/
		
		System.out.println("Bem vindo; \nO presente programa l� os dados de uma matriz A (4x4). "
							+ "\nAp�s isso informa qual � o menor elemento e sua posi��o na matriz A.");
		
//		Capta��o de entradas e c�lculo	

		Scanner input = new Scanner(System.in);
		double[][] matrizA = new double[4][4];
		double menor = 0;
		String posicaoMenor = "";
		
		
		for ( int i = 0 ; i < matrizA.length ; ++i ) {
			for ( int j = 0 ; j < matrizA[i].length ; ++j) {
				System.out.print("\nPor favor insira o valor do elemento de posi��o "
								+ "[" + i + "][" + j + "] da matriz A: ");
				matrizA[i][j] = input.nextDouble();
				
				if ( matrizA[i][j] < menor || ( i == 0 && j == 0 )) {
					menor = matrizA[i][j];
					posicaoMenor =  "[" + i + "] [" + j + "]";
				}
			}
		}
		
//		Apresenta��o de resultados
		
		System.out.println("\n-------------------------------------------------------------------------------\n"
							+ "\nO menor elemento inserido �: " + menor 
							+ "\nSua posi��o � a de ind�ces: " + posicaoMenor);
		
		input.close();
	}
}
