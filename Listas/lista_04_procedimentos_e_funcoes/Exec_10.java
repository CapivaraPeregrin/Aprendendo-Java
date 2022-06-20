package lista_procedimentos_e_funcoes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exec_10 {

	public static void main(String[] args) {

//		10 � FA�A UM PROGRAMA ONDE O USU�RIO DEFINA A QUANTIDADE DE N�MEROS A SEREM LIDOS E EM SEGUIDA
//		LEIA OS N�MEROS E ARMAZENE-OS EM UM ARRAY. DEPOIS DESENVOLVA M�TODOS (�PROCEDIMENTOS OU
//		FUN��ES�) PARA IDENTIFICAR O MAIOR, O MENOR ELEMENTO DO ARRAY E QUE CALCULE A M�DIA DOS
//		N�MEROS. O PROGRAMA DEVE APRESENTAR ESSAS INFORMA��ES.

		DecimalFormat formatando = new DecimalFormat("0.00");
		Scanner input = new Scanner(System.in);
		System.out.println("Bem vindo; "
							+ "\nO presente programa l� uma s�rie de n�meros."
							+ "\nAp�s isso ele apresenta o n�mero maior e o menor."
							+ "\nSeguidos da m�dia dos n�meros.\n");
		
		System.out.print("Por favor insira quantos n�meros voc� deseja digitar: ");
		int tamanhoLista = input.nextInt();
		
		double[] lista = new double[tamanhoLista];
		for ( int i = 0; i < lista.length; ++i) {
			System.out.print("Insira o " + (i+1) + "� n�mero:");
			lista[i] = input.nextDouble();
		}
		
		double menor = retornarMenor(lista);
		double maior = retornarMaior(lista);
		double media = calcularMedia(lista);

		System.out.println("\nO menor n�mero inserido �: " + menor
						+ "\nO maior n�mero inserido �: " + maior
						+ "\nA m�dia dos n�meros inseridos �: " + formatando.format(media));
		input.close();
	}

	static double retornarMenor (double[] lista) {
		double menor = 0;
		for (int i = 0; i < lista.length; ++i ) {
			if (i == 0 || lista[i] < menor ) {
				menor = lista[i];
			}
		}
		return menor;
	}
	
	static double retornarMaior (double[] lista) {
		double maior = 0;
		for (int i = 0; i < lista.length; ++i ) {
			if (i == 0 || lista[i] > maior ) {
				maior = lista[i];
			}
		}
		return maior;
	}
	
	static double calcularMedia (double[] lista) {
		double soma = 0;
		for (int i = 0; i < lista.length; ++i ) {
			soma += lista[i];
		}
		double media = (soma / lista.length) ;
		return media;
	}
	
	
}
