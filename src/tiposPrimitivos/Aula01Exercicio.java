package tiposPrimitivos;

import java.util.Scanner;

public class Aula01Exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Informe a quantidade de n�meros que voc� vai informar: ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		double media=0;
		int result;
		int cont =0;
		double me;
		
		System.out.print("\nInforme 2 n�meros nos quais a m�dia vai ser feita entre os valores k e l: ");
		System.out.print("\nprimeiro n�mero: ");
		int k = s.nextInt();
		System.out.print("\nSegundo n�mero: ");
		int l = s.nextInt();
	    
		if(k < l ) {
			for(int i = 1; i <= n; i++) {
				System.out.println("Informe o "+ (i)+"� valor da cole��o: ");
				result = s.nextInt();
					if(result > k && result < l) {
						media += result;
						cont++;
					}
			}
		}else {
			System.out.println("condi��o incorreta.");
		}
		me = media/cont;
		System.out.println("A m�dia foi: " + me);

	}

}
