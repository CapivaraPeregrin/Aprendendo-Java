package lista_arrays_e_matrizes;

import java.util.Scanner;

public class Exec_04_alternativo {

	public static void main(String[] args) {
		
	  /*DESENVOLVA UM PROGRAMA QUE LEIA 10 N�MEROS (ACEITAR SOMENTE N�MEROS POSITIVOS) E
		ARMAZENE EM UM ARRAY. O PROGRAMA DEVE INFORMAR O VALOR DO MAIOR E DO MENOR N�MERO E AS SUAS
		RESPECTIVAS POSI��ES NO ARRAY.*/

		System.out.println("Bem vindo; \nO presente programa l� 10 n�meros positivos; Ap�s isso ele informa o maior, "
				+ "\no menor e suas respectivas posi��es de inser��o.\n");

//		Capta��o de entradas e c�lculo	

		Scanner input = new Scanner(System.in);
		double[] numeros = new double[10];
		double maior = 0;
		double menor = 0;
		int posicaoMaior = 0;
		int posicaoMenor = 0;

		System.out.println("--------------- S� ser�o aceitos valores positivos -----------------\n");
		
		for (int i = 0; i < numeros.length; ++i) {
			
			System.out.print("Por favor insira o " + (i + 1) + "� n�mero:");
			numeros[i] = input.nextDouble();

			if (numeros[i] >= 0) {
				
				if ( i == 0 ) {
					maior = numeros[0];
					menor = numeros[0];
				}
				
				if (numeros[i] >= maior) {
					maior = numeros[i];
					posicaoMaior = i;
				}

				if (numeros[i] <= menor) {
					menor = numeros[i];
					posicaoMenor = i;
				}
				
			} else {
				System.out.println("\nO n�mero inserido n�o � positivo; Tente novamente!\n");
// Abaixo decremento o i para formar um loop
				--i;
			}
		}

//		Apresenta��o de resultados

		System.out.println("\n-------------------------------------------------------------------------------\n"
				+ "\nO maior n�mero inserido �: " + maior + " e sua posi��o � a de ind�ce:" + posicaoMaior
				+ "\nO menor n�mero inserido �: " + menor + " e sua posi��o � a de ind�ce:" + posicaoMenor);

		input.close();
	}
}
