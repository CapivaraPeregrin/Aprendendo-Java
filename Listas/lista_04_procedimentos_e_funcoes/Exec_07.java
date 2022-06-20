package lista_procedimentos_e_funcoes;

public class Exec_07 {

	public static void main(String[] args) {

//		7 � DESENVOLVA UM PROGRAMA QUE IDENTIFIQUE TODOS OS N�MEROS PRIMOS MENORES QUE 100.
//		DESENVOLVA UM M�TODO COM RETORNO (�FUN��O�) QUE RECEBA UM N�MERO COMO PAR�METRO E INFORME
//		SE ELE � UM N�MERO PRIMO. LEMBRANDO QUE O N�MERO 1 N�O � PRIMO E QUE TODO N�MERO PRIMO TEM
//		DOIS DIVISORES (O N�MERO 1 E ELE MESMO).
	
		System.out.println("Bem vindo; "
							+ "O presente programa identifica todos os n�meros primos menores que 100.\n");
	
		// Capta��o de dados
		
		System.out.println("S�o n�meros primos at� 100: \n");

		int[] naturaisAteCem = new int[100];
		for ( int i = 0; i < naturaisAteCem.length; ++i) {
				naturaisAteCem[i]= (i+1);
				boolean resposta = identificarPrimo (naturaisAteCem[i]);
				if ( resposta == true ) {
					System.out.print( naturaisAteCem[i] + "  ");
				}
		}
		
	}
	
	static boolean identificarPrimo (int numero) {
		boolean resposta = true;
		if ( numero == 1 ) {
			resposta = false;
			}
		for ( int i = 0; (i+2) < numero ; ++i) {
			if ( numero % (2+i) == 0 && (2+i) != numero ) {
			resposta = false;
			}
			
		}
		return resposta;
	}
	
}
