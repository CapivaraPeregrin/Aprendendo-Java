package lista_procedimentos_e_funcoes;

import java.util.Scanner;

public class Exec_05 {

	public static void main(String[] args) {

//		5 � FA�A UM PROGRAMA QUE LEIA UMA MATRIZ A DE TAMANHO 4X4. EM SEGUIDA DESENVOLVA UM M�TODO
//		COM RETORNO (�FUN��O�) QUE RECEBA COMO PAR�METRO A MATRIZ A E SOME OS VALORES DA DIAGONAL
//		PRINCIPAL. O PROGRAMA DEVE APRESENTAR A SOMA DA DIAGONAL PRINCIPAL DA MATRIZ A.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Bem vindo; O presente programa l� uma matriz 4X4."
							+ "\nAp�s isso ele apresenta a soma dos valores "
							+ "\nda diagonal principal.\n");
		
		// Capta��o de dados
		double[][] matriz = new double[4][4];
		for ( int i = 0; i < matriz.length; ++i) {
			for ( int j = 0; j < matriz[i].length; ++j) {
				System.out.print("\nPor favor insira o n�mero da posi��o " + i + "X" + j + " : ");
				matriz[i][j]= input.nextDouble();
			}
		}
		
		// Invoca��o de c�lculo
		double somaDiagonal = somarDiagonalPrincipal(matriz);
		
		// Apresenta��o de resultados
		System.out.print("\nA soma dos elementos da diagonal principal da "
						+ "\nmatriz �: " + somaDiagonal );
		input.close();
	}

	// C�lculo
	static double somarDiagonalPrincipal (double[][] matrizA) {
		double soma = 0;
		for ( int i = 0; i < matrizA.length; ++i) {
			for ( int j = 0; j < matrizA[i].length; ++j) {
				if ( i == j ) {
					soma += matrizA[i][j];
				}
			}
		}
		return soma;
	}
}
