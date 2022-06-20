package lista_procedimentos_e_funcoes;

import java.util.Scanner;

public class Exec_08 {

	public static void main(String[] args) {
		
//		8 � DESENVOLVA UM PROGRAMA ONDE O USU�RIO INFORMA TR�S N�MEROS. DESENVOLVA UM M�TODO COM
//		RETORNO (�FUN��O�) QUE VERIFIQUE SE ESSES VALORES (PASSADOS POR PAR�METROS) FORMAM UM
//		TRI�NGULO. CASO FORMEM UM TRI�NGULO O SISTEMA DEVE TER UM M�TODO SEM RETORNO
//		(�PROCEDIMENTO�) QUE RECEBA ESSES VALORES COMO PAR�METROS E CLASSIFIQUE ESSE TRI�NGULO.
//		DEFINI��ES:
//		 PARA SER UM TRI�NGULO O COMPRIMENTO DE CADA LADO DE UM TRI�NGULO DEVE SER MENOR QUE A
//		SOMA DO COMPRIMENTO DOS OUTROS DOIS LADOS. CADA N�MERO INFORMADO PELO USU�RIO
//		CONSISTE EM UM LADO.
//		UM TRI�NGULO EQUIL�TERO TEM TODOS OS LADOS IGUAIS, J� O TRI�NGULO IS�SCELES TEM DOIS
//		LADOS IGUAIS E O TRI�NGULO ESCALENO TEM OS TR�S LADOS DIFERENTES.
//		O SISTEMA DEVE INFORMAR SE OS N�MEROS FORMAM OU N�O UM TRI�NGULO E QUAL A SUA CLASSIFICA��O.

		Scanner input = new Scanner(System.in);
		System.out.println("Bem vindo; O presente programa l� 3 n�meros."
							+ "\nAp�s isso ele informa se eles formam um tri�ngulo."
							+ "\nE se sim classifica o tri�ngulo.");
		
		// Capta��o de dados
		System.out.print("\nPor favor insira o 1� n�mero: ");
		double ladoA= input.nextDouble();
		System.out.print("\nPor favor insira o 2� n�mero: ");
		double ladoB= input.nextDouble();
		System.out.print("\nPor favor insira o 3� n�mero: ");
		double ladoC= input.nextDouble();
		

		boolean triangulo = verificarTriangulo(ladoA, ladoB, ladoC);
		if ( triangulo == true ) {
			System.out.println("\nOs n�meros inseridos constituem um tri�ngulo.");
			classificacaoTriangulo(ladoA, ladoB, ladoC);	
		} else {
			System.out.println("\nOs n�meros inseridos n�o constituem um tri�ngulo.");
		}
		
		input.close();
	}

	static boolean verificarTriangulo ( double ladoA, double ladoB, double ladoC) {
		boolean resposta = true;
		double somaAB = ladoA + ladoB;
		double somaAC = ladoA + ladoC;
		double somaCB = ladoC + ladoB;

		if (somaAB <= ladoC || somaAC <= ladoB || somaCB <= ladoA ) {
			resposta = false;
		}
		return resposta;
	}
	
	static void classificacaoTriangulo ( double ladoA, double ladoB, double ladoC) {
	String tipo = "";
		
		if (ladoA == ladoB && ladoA == ladoC) {
			tipo = "equil�tero";
		}
	
		if ((ladoA == ladoB && ladoA != ladoC) 
			|| (ladoA == ladoC && ladoA != ladoB ) 
			|| (ladoB == ladoC && ladoA != ladoB )) {
			tipo = "is�celes";
		}
		
		if (ladoA != ladoB && ladoA != ladoC && ladoB != ladoC) {
			tipo = "escaleno";
		}
		
		System.out.println("\nO tipo de tri�ngulo � o " + tipo +".");
	}

}
