package tiposPrimitivos;

import java.util.Scanner;

public class Aula01Exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Informe a quantidade de números que você vai informar: ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		double media=0;
		int result;
		int cont =0;
		double me;
		
		System.out.print("\nInforme 2 números nos quais a média vai ser feita entre os valores k e l: ");
		System.out.print("\nprimeiro número: ");
		int k = s.nextInt();
		System.out.print("\nSegundo número: ");
		int l = s.nextInt();
	    
		if(k < l ) {
			for(int i = 1; i <= n; i++) {
				System.out.println("Informe o "+ (i)+"ª valor da coleção: ");
				result = s.nextInt();
					if(result > k && result < l) {
						media += result;
						cont++;
					}
			}
		}else {
			System.out.println("condição incorreta.");
		}
		me = media/cont;
		System.out.println("A média foi: " + me);

	}

}
