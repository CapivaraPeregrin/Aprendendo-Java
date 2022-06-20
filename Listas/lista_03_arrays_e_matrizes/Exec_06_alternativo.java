package lista_arrays_e_matrizes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exec_06_alternativo {

	public static void main(String[] args) {

	  /*FA�A UM PROGRAMA PARA LER A ARMAZENAR EM UM ARRAY A TEMPERATURA M�DIA DOS MESES DO ANO. O
		PROGRAMA DEVE CALCULAR:
		- MENOR TEMPERATURA M�DIA;
		- MAIOR TEMPERATURA M�DIA;
		- M�DIA DA TEMPERATURA DO ANO;
		- A QUANTIDADE DE MESES EM QUE A TEMPERATURA FOI INFERIOR � M�DIA ANUAL;*/
		
		System.out.println("Bem vindo; \nO presente programa l� as temperaturas m�dias dos meses do ano"
							+ "\nAp�s isso ele informa a menor, a maior, a m�dia anual e em quantos meses "
							+ "\na temperatura foi menor que a m�dia anual.\n");

//		Capta��o de entradas e c�lculo	

		DecimalFormat formatando = new DecimalFormat("0.00");
		Scanner input = new Scanner(System.in);
		double[] temperaturas = new double[12];
		double soma = 0;

		for (int i = 0; i < temperaturas.length; ++i) {
			System.out.println("Por favor insira a temperatura m�dia do " 
								+ (i + 1) + "� m�s:");
			temperaturas[i] = input.nextDouble();
			soma += temperaturas[i];
		}

//		Obten��o do maior e do menor; Contador temperaturas abaixo da m�dia
		
		double maior = temperaturas[0];
		double menor = temperaturas[0];
		double mediaAnual = (soma / temperaturas.length);
		int contadorMesesAbaixoDaMedia = 0;
		
		for(int i = 0; i < temperaturas.length; ++i) {
			
			if (temperaturas[i] > maior) {
				maior = temperaturas[i];
			}

			if (temperaturas[i] < menor) {
				menor = temperaturas[i];
			}
			
			if (temperaturas[i] < mediaAnual) {
				contadorMesesAbaixoDaMedia++;
			}
		}

//		Apresenta��o de resultados

		System.out.println("\n-----------------------------------------\n"
							+ "A menor temperatura m�dia �: " + menor
							+ "\nA maior temperatura m�dia �: " + maior
							+ "\nA m�dia anual das temperaturas inseridas �: " + formatando.format(mediaAnual)
							+ "\nA quantidade de meses com temperaturas abaixo dessa m�dia �: " + contadorMesesAbaixoDaMedia);

		input.close();
	}
}
