package lista_arrays_e_matrizes;

import java.util.Scanner;

public class Exec_07 {

	public static void main(String[] args) {
	 
		/*FA�A UM PROGRAMA QUE LEIA UMA MATRIZ A DE TAMANHO 3X3. EM SEGUIDA O PROGRAMA DEVE SOLICITAR
    	UM N�MERO AO USU�RIO E GERAR UMA MATRIZ RESULTADO (OS ELEMENTOS DA MATRIZ A MULTIPLICADO PELO 
		VALOR INFORMADO PELO USU�RIO). APRESENTE A MATRIZ A E A MATRIZ RESULTADO.*/
		
		System.out.println("Bem vindo; \nO presente programa l� os dados de uma matriz A (3x3) e um n�mero. "
				+ "\nAp�s isso ele imprime a matriz A e a matriz resultado, a qual � o produto do n�mero pela matriz A.");

//		Declara��o

		Scanner input = new Scanner(System.in);
		double[][] matrizA = new double[3][3];
		double[][] matrizResultado = new double [matrizA.length][matrizA[0].length];
		
//		Capta��o de entradas da matriz		

		for ( int i = 0 ; i < matrizA.length ; ++i ) {
			for ( int j = 0 ; j < matrizA[i].length ; ++j) {
				System.out.print("\nPor favor insira o valor da posi��o [" + i + "][" + j + "] da matriz: ");
				matrizA[i][j] = input.nextDouble();
			}
		}
		
//		Capta��o do n�mero multiplicador		

		System.out.print("\nPor favor insira um n�mero para multiplicar a matriz A: ");
		double multiplicador = input.nextDouble();
		
//		Multiplica��o dos elementos		
		
		for ( int i = 0 ; i < matrizResultado.length ; ++i ) {
			for ( int j = 0 ; j < matrizResultado[i].length ; ++j) {
				matrizResultado[i][j] = matrizA[i][j] * multiplicador;
			}
		}
		
//		Apresenta��o de resultados
		
		System.out.println("\nA matriz A inserida �:\n");
		for ( int i = 0 ; i < matrizA.length ; ++i ) {
			for ( int j = 0 ; j < matrizA[i].length ; ++j) {
				System.out.print( " " + matrizA[i][j] + " ");
				
			}
			System.out.println();
		}
		
		System.out.println("\nA matriz resultado gerada �:\n");
		for ( int i = 0 ; i < matrizResultado.length ; ++i ) {
			for ( int j = 0 ; j < matrizResultado[i].length ; ++j) {
				System.out.print( " " + matrizResultado[i][j] + " ");
				
			}
			System.out.println();
		}
		
		input.close();
	}
}
