package lista_procedimentos_e_funcoes;

import java.util.Scanner;

public class Exec_06 {

	public static void main(String[] args) {
		
//		6 � FA�A UM PROGRAMA QUE LEIA UMA MATRIZ A DE TAMANHO 3X3. EM SEGUIDA DESENVOLVA UM M�TODO SEM
//		RETORNO (�PROCEDIMENTO�) QUE RECEBA COMO PAR�METRO A MATRIZ A E IDENTIFIQUE A POSI��O DO MENOR
//		N�MERO DA MATRIZ. O PROGRAMA DEVE APRESENTAR A POSI��O E O MENOR ELEMENTO DA MATRIZ A.

	
		Scanner input = new Scanner(System.in);
		System.out.println("Bem vindo; O presente programa l� uma matriz 3X3."
							+ "\nAp�s isso ele apresenta qual o menor n�mero "
							+ "\ne sua posi��o na matriz.\n");
		
		// Capta��o de dados
		double[][] matrizA = new double[3][3];
		for ( int i = 0; i < matrizA.length; ++i) {
			for ( int j = 0; j < matrizA[i].length; ++j) {
				System.out.print("\nPor favor insira o n�mero da posi��o " + i + "X" + j + " : ");
				matrizA[i][j]= input.nextDouble();
			}
		}
		
		// Invoca��o para c�lculo
		menorElemento(matrizA);
		input.close();
	}

	// C�lculo
	static void menorElemento (double[][] matrizA) {
		double menor = 0;
		int linha = 0;
		int coluna = 0;
		
		for ( int i = 0; i < matrizA.length; ++i) {
			for ( int j = 0; j < matrizA[i].length; ++j) {
				if ( (i+j) == 0 ) {
					menor = matrizA[i][j];
				}
				if ( matrizA[i][j] < menor ) {
					menor = matrizA[i][j];
					linha = i;
					coluna = j;
				}
			}
		}
		
		// Apresenta��o de resultados
		System.out.print("\nO menor elemento da matriz �: " + menor
							+ "\nSua posi��o �: " + linha + "X" + coluna + "." );
		
		
	}
}
