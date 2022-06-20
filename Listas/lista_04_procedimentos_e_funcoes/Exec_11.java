package lista_procedimentos_e_funcoes;

import java.util.Scanner;

public class Exec_11 {

	public static void main(String[] args) {

//		11 � DESENVOLVA UM PROGRAMA QUE LEIA E ARMAZENE 10 N�MEROS EM UM ARRAY. DEPOIS DESENVOLVA
//		M�TODOS (�PROCEDIMENTOS OU FUN��ES�) PARA ORDENAR O ARRAY DE FORMA CRESCENTE E DECRESCENTE.
//		O PROGRAMA DEVE SOLICITAR QUE O USU�RIO DEFINA SE QUER ORDENAMENTO CRESCENTE OU
//		DECRESCENTE. POR FINAL O PROGRAMA DEVE APRESENTAR O RESULTADO.

		Scanner input = new Scanner(System.in);
		System.out.println("Bem vindo; "
							+ "\nO presente programa l� 10 n�meros."
							+ "\nAp�s isso ele apresenta os n�meros em ordem crescente"
							+ "\nou decrescente conforme solicitado pelo usu�rio.\n");
		
		//Capta��o de dados
		double[] lista = new double[10];
		for ( int i = 0; i < lista.length; ++i) {
			System.out.print("Insira o " + (i+1) + "� n�mero: ");
			lista[i] = input.nextDouble();
		}
		
		System.out.print("Digite '1' para ordem crescente ou '2' para ordem decrescente: ");
		int opcao = input.nextInt();
		
		//Invoca��o de c�lculo
		if( opcao == 1 ) {
			ordenarCrescente(lista);
		} 
		if( opcao == 2 ) {
			ordenarDecrescente(lista);
		}
		
		//Apresenta��o de Resultados
		System.out.println("\n A lista ordenada:\n");
		for ( int i = 0; i < lista.length; ++i) {
			System.out.print(" " + lista[i] + " ");
		}
		
		input.close();
	}

	static void ordenarCrescente(double[] lista) {
		for (int i = 0; i < lista.length; ++i) {
			for (int j = (i+1); j < lista.length; ++j) {
				if ( lista[i] > lista[j]) {
					double memoriaTrocaDePosicao = 0;
					memoriaTrocaDePosicao = lista[i];
					lista[i] = lista[j];
					lista[j] = memoriaTrocaDePosicao;
				}
			}
		}
	}
	
	static void ordenarDecrescente(double[] lista) {
		for (int i = 0; i < lista.length; ++i) {
			for (int j = (i+1); j < lista.length; ++j) {
				if ( lista[i] < lista[j]) {
					double memoriaTrocaDePosicao = 0;
					memoriaTrocaDePosicao = lista[i];
					lista[i] = lista[j];
					lista[j] = memoriaTrocaDePosicao;
				}
			}
		}
	}
}
