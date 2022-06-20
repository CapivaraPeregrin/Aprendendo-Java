package lista_procedimentos_e_funcoes;

import java.util.Scanner;

public class Exec_02 {

	public static void main(String[] args) {
		
		/*DESENVOLVA UM PROGRAMA QUE LEIA A QUANTIDADE DE PONTOS DE UM ALUNO EM UMA AVALIA��O.
		DESENVOLVA UM M�TODO SEM RETORNO (�PROCEDIMENTO�) QUE RECEBA ESSA PONTUA��O POR PAR�METRO 
		E INFORME O CONCEITO DO ALUNO NA AVALIA��O CONFORME A TABELA ABAIXO:
		
		PONTOS CONCEITO
		AT� 60 PONTOS INSATISFAT�RIO
		61 A 75 PONTOS SATISFAT�RIO
		76 A 90 PONTOS BOM
		ACIMA DE 90 �TIMO*/

		Scanner input = new Scanner(System.in);
		System.out.println("Ol� o presente programa l� a quantidade de pontos de um "
						+ "\naluno em uma avalia��o e informe sua classifica��o \n");
		
		System.out.print("Por favor insira a pontua��o do aluno: ");
		int idade = input.nextInt();
		indicadorDeConceito(idade);
		input.close();
	}

	static void indicadorDeConceito(int pontuacao) {

		String categoria = "";
		if (pontuacao < 61) {
			categoria = "INSATISFAT�RIO";
		} else {
			if (pontuacao < 76) {
				categoria = "SATISFAT�RIO";
			} else {
				if (pontuacao < 91) {
					categoria = "BOM";
				} else {
					categoria = "�TIMO";
				}
			}
		}
		System.out.print("O conceito do aluno na avalia��o � : " + categoria);
	}
}
