package lista_arrays_e_matrizes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exec_05 {

	public static void main(String[] args) {
		
	  /*ESCREVA UM PROGRAMA QUE PERMITA A LEITURA DAS NOTAS DE UMA TURMA DE 10 ALUNOS. ARMAZENE AS
		NOTAS EM UM ARRAY. O PROGRAMA DEVE CALCULAR A M�DIA DA TURMA E CONTAR QUANTOS ALUNOS
		OBTIVERAM NOTA ACIMA DESTA M�DIA CALCULADA. ESCREVA A M�DIA DA TURMA E O RESULTADO DA CONTAGEM.*/

		
		System.out.println("Bem vindo; \nO presente programa l� as notas de 10 alunos de uma turma."
							+ "\nAp�s isso ele informa a m�dia da turma e quantos alunos obtiveram nota acima dessa m�dia\n");

//		Capta��o de entradas e c�lculo	

		DecimalFormat formatando = new DecimalFormat("0.00");
		Scanner input = new Scanner(System.in);
		double[] notas = new double[10];
		double soma = 0;

		for (int i = 0; i < notas.length; ++i) {
			System.out.println("Por favor insira a nota do " + (i + 1) + "� aluno:");
			notas[i] = input.nextDouble();
			soma += notas[i];
		}

		double mediaDaTurma = (soma / notas.length);

		int contadorAlunosAcimaDaMedia = 0;
		
		for (int i = 0; i < notas.length; ++i) {
			if (notas[i] > mediaDaTurma) {
				contadorAlunosAcimaDaMedia++;
			}
		}

//		Apresenta��o de resultados

		System.out.println("\n-----------------------------------------\n" 
							+ "A m�dia das notas da turma �: " + formatando.format(mediaDaTurma)
							+ "\nA quantidade de notas acima dessa m�dia �: " + contadorAlunosAcimaDaMedia);

		input.close();
	}
}
