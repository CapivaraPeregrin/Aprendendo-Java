package lista_procedimentos_e_funcoes;

import java.util.Scanner;

public class Exec_04 {

	public static void main(String[] args) {
		
//		 FA�A UM PROGRAMA QUE LEIA UMA MATRIZ A DE TAMANHO 3X4. EM SEGUIDA DESENVOLVA UM M�TODO 
//		 COM RETORNO (�FUN��O�) QUE RECEBA COMO PAR�METRO A MATRIZ A E CONTABILIZE OS N�MEROS PARES. O
//		 PROGRAMA DEVE APRESENTAR QUANTOS N�MEROS PARES A MATRIZ A POSSUI.

		Scanner input = new Scanner(System.in);
		System.out.println("Bem vindo, o presente programa l� uma matriz 3X4."
							+ "\nAp�s isso ele conta e apresenta o n�mero de n�meros pares.\n");
		
		double[][] matriz = new double[3][4];
		for ( int i = 0; i < matriz.length; ++i) {
			for ( int j = 0; j < matriz[i].length; ++j) {
				System.out.print("\nPor favor insira o n�mero da posi��o " + i + "X" + j + " : ");
				matriz[i][j]= input.nextDouble();
			}
		}
		int quantiaPares = funcaoContaPares(matriz);
		System.out.print("\n A matriz possui " + quantiaPares + " n�meros pares.");
		input.close();
	}
		
	static int funcaoContaPares (double[][] matrizNaFuncao) {
		
		int pares = 0;
		for ( int i = 0; i < matrizNaFuncao.length; ++i) {
			for ( int j = 0; j < matrizNaFuncao[i].length; ++j) {
				if ((matrizNaFuncao[i][j] % 2) == 0 ) {
					pares++;
				}
			}
		}
		return pares;
	}
}
