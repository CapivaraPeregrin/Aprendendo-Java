package lista_procedimentos_e_funcoes;

import java.util.Scanner;

public class Exec_09 {

	public static void main(String[] args) {

//		9 � FA�A UM PROGRAMA QUE LEIA E ARMAZENE 10 N�MEROS EM UM ARRAY. DESENVOLVA UM M�TODO COM
//		RETORNO (�FUN��O�) QUE RECEBA O ARRAY COMO PAR�METRO E DEVOLVA UM ARRAY COMO RETORNO, SENDO
//		QUE OS ELEMENTOS DEVER�O ESTAR ORDENADOS DE FORMA CRESCENTE DE PARES SEGUIDO DE FORMA
//		CRESCENTE DE �MPARES. O PROGRAMA DEVE APRESENTAR O ARRAY ORIGINAL E O AJUSTADO.

		Scanner input = new Scanner(System.in);
		System.out.println("Bem vindo; "
							+ "\nO presente programa l� 10 n�meros."
							+ "\nAp�s isso ele apresenta os n�meros pares e �mpares em ordem crescente."
							+ "\nSeguido dos n�meros na ordem original.\n");
		
		double[] listaDesordenada = new double[10];
		for ( int i = 0; i < listaDesordenada.length; ++i) {
			System.out.println("Insira o " + (i+1) + "� n�mero:");
			listaDesordenada[i] = input.nextDouble();
		}
		
		double[] listaOrdenada = ordenar(listaDesordenada);
		
		System.out.print("\nLista ordenada e dividida entre pares e �mpares:\n");
		for ( int i = 0; i < listaOrdenada.length; ++i) {
			System.out.print(" " + listaOrdenada[i] + " ");
		}
		
		System.out.print("\n\nLista na ordem em que foi inserida:\n");
		for ( int i = 0; i < listaDesordenada.length; ++i) {
			System.out.print(" " + listaDesordenada[i] + " ");
		}
		input.close();
	}
	
	static double[] ordenar (double[] lista) {
		
		// Contar quantia de pares
		int contadorPares = 0;
		for ( int i = 0; i < lista.length; ++i) {
			if ( lista [i] % 2 == 0 ) {
				contadorPares++;
			}
		}
		
		
		// Separar em lista de pares e impares
		double[] pares = new double[contadorPares];
		double[] impares = new double[lista.length - contadorPares];
		int posicaoPar = 0;
		int posicaoImpar = 0;
		
		for (int i = 0; i < lista.length; ++i) {
			if (lista[i] % 2 == 0) {
				pares[posicaoPar] = lista[i];
				++posicaoPar;
			} else {
				impares[posicaoImpar] = lista[i];
				++posicaoImpar;
			}
		}
		
		// Ordenar pares
		for (int i = 0; i < pares.length; ++i) {
			for (int j = (i+1); j < pares.length; ++j) {
				if ( pares[i] > pares[j]) {
					double memoriaTrocaDePosicao = 0;
					memoriaTrocaDePosicao = pares[i];
					pares[i] = pares[j];
					pares[j] = memoriaTrocaDePosicao;
				}
			}
		}
		
		// Ordenar impares
		for (int i = 0; i < impares.length; ++i) {
			for (int j = (i+1); j < impares.length; ++j) {
				if ( impares[i] > impares[j]) {
					double memoriaTrocaDePosicao = 0;
					memoriaTrocaDePosicao = impares[i];
					impares[i] = impares[j];
					impares[j] = memoriaTrocaDePosicao;
				}
			} 
		}
		
		//Unir em lista ordenada
		double[] listaOrdenada = new double[lista.length];
		
		for (int i = 0; i < pares.length; ++i) {
			listaOrdenada[i] = pares[i];			
		}
		for (int i = 0; i < impares.length; ++i) {
			listaOrdenada[i + pares.length] = impares[i];			
		}
 
		return listaOrdenada;
	}
}
