package lista_procedimentos_e_funcoes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exec_03 {

	public static void main(String[] args) {

		/* DESENVOLVA UM PROGRAMA QUE LEIA E ARMAZENE 3 NOTAS DE UM ALUNO EM UM ARRAY.
		 * DESENVOLVA UM M�TODO SEM RETORNO (�PROCEDIMENTO�) QUE RECEBA O ARRAY DE NOTAS
		 * DE UM ALUNO E O TIPO DE C�LCULO A SER EXECUTADO POR PAR�METRO. O PAR�METRO
		 * TIPO DE C�LCULO SER� UM INTEIRO (1 OU 2) E DEVE REALIZAR O C�LCULO CONFORME
		 * ESPECIFICADO ABAIXO: 1 � O M�TODO CALCULA E APRESENTA A M�DIA ARITM�TICA DAS
		 * NOTAS DO ALUNO; 2 � O M�TODO CALCULA E APRESENTA A M�DIA PONDERADA (PESOS: 5,
		 * 3 E 2)*/

		Scanner input = new Scanner(System.in);
		System.out.println("Bem vindo, o presente programa recebe tr�s notas"
							+ "\nde um aluno e calcula a m�dia aritim�tica ou ponderada " 
							+ "\na depender da escolha do usu�rio.\n");

		double[] notas = new double[3];
		for (int i = 0; i < notas.length; ++i) {
			System.out.print("Por favor insira a " + (i + 1) + "� nota do aluno: ");
			notas[i] = input.nextDouble();
		}
		System.out.print("\nDigite  '1' para c�lculo de m�dia aritm�tica "
							+ "\nou '2' para c�lculo de m�dia ponderada.");
		int opcao = input.nextInt();
		calculadorDeMedia(notas, opcao);
		input.close();
	}

	static void calculadorDeMedia(double[] notas, int opcao) {
		
		DecimalFormat formatando = new DecimalFormat("0.00");
		double soma = 0;
		if (opcao == 1) {
			for (int i = 0; i < notas.length; ++i) {
				soma += notas[i];
			}
		} else {
			for (int i = 0; i < notas.length; ++i) {
				double numero = notas[i];
				int[] pesos = { 5, 3, 2 };
				soma += pesos[i]*numero;
			}
		}

		double media = soma / notas.length;
		System.out.println("\nA m�dia �: " + formatando.format(media));
	}
}
