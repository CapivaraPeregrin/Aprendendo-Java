package lista_procedimentos_e_funcoes;

import java.util.Scanner;

public class Exec_12 {

	public static void main(String[] args) {

//		12 � DESENVOLVA UM PROGRAMA PARA SIMULAR UMA CALCULADORA COM AS OPERA��ES DE ADI��O,
//		SUBTRA��O, DIVIS�O E MULTIPLICA��O. AS OPERA��ES S�O APENAS DE DOIS N�MEROS. DESENVOLVA
//		M�TODOS PARA AS OPERA��ES E O PROGRAMA AL�M DE MOSTRAR O RESULTADO DA OPERA��O SELECIONADA
//		PELO USU�RIO DEVE PERMITIR QUE ELE POSSA EXECUTAR QUANTAS OPERA��ES ELE DESEJAR AT� QUE ELE
//		DECIDA ENCERRAR O PROGRAMA
		
		Scanner input = new Scanner(System.in);
		System.out.println("Bem vindo; "
							+ "\nO presente programa � uma calculadora."
							+ "\nPossuindo as opera��es de + , - , / e *.");
		
		//Escolha de opera��o
		int opcao = 0;
		do {
			System.out.println("\nAs opera��es dispon�veis s�o: "
							+ "\n1 - Adi��o;"
							+ "\n2 - Subtra��o;"
							+ "\n3 - Divis�o;"
							+ "\n4 - Multiplica��o."
							+ "\nInsira o n�mero espec�fico da opera��o que deseja fazer: ");
			int operacao = input.nextInt();
			
			// Inser��o de valores e invoca��o de C�lculo
			double resultado = 0;
			if ( operacao == 3 ) {
				
				System.out.print( "\nPor favor insira o n�mero a ser dividido: ");
				double valor1 = input.nextDouble();
				System.out.print( "\nPor favor insira o divisor: ");
				double valor2 = input.nextDouble();
				resultado = divisao( valor1 , valor2 , resultado );
				
			} else {
				
				System.out.print( "\nPor favor insira o 1� valor: ");
				double valor1 = input.nextDouble();
				System.out.print( "\nPor favor insira o 2� valor: ");
				double valor2 = input.nextDouble();
				
				if ( operacao == 1 ) {
					resultado = adicao( valor1 , valor2 , resultado );
				}
				if ( operacao == 2 ) {
					resultado = subtracao( valor1 , valor2 , resultado );
				}
				if ( operacao == 4 ) {
					resultado = multiplicacao( valor1 , valor2 , resultado );
				}
			}
			
			//Apresenta��o de resultados
			System.out.println("\nO resultado da opera��o �: " + resultado);
			
			System.out.print("\nDigite '1' para realizar mais uma opera��o ou '2' para concluir:");
			opcao = input.nextInt();
			while (opcao != 2 && opcao != 1) {
				System.out.print("\nEntrada inv�lida digite '1' para realizar"
								+ "\nmais uma opera��o ou '2' para concluir:");
				opcao = input.nextInt();
			}
		} while (opcao == 1);
		
		input.close();
	}
	//
	static double adicao( double valor1 , double valor2 , double resultado ) {
		resultado = valor1 + valor2;
		return resultado;
	}
	
	static double subtracao( double valor1 , double valor2 , double resultado ) {
		resultado = valor1 - valor2;
		return resultado;
	}
	
	static double divisao( double dividendo , double divisor , double resultado ) {
		resultado = dividendo / divisor;
		return resultado;
	}
	
	static double multiplicacao( double valor1 , double valor2 , double resultado ) {
		resultado = valor1 * valor2;
		return resultado;
	}
}
