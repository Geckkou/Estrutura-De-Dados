package vetorMatrizMult;

import java.util.Scanner;

public class ExercicioVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] vet = new int[5];
		int menor =vet[0];
		double media =0;
		int maiorMedia =0;
		double result =0;
		Scanner s = new Scanner(System.in);
		
		//Leitura
		System.out.println("Informe os valores da matriz: ");
		for(int i = 0; i < vet.length; i++) {
			vet[i] = s.nextInt();
			media += vet[i];
		}
		result = media/vet.length;
		
		//conferindo menor n�mero
		for(int i = 0 ; i < vet.length; i++) {
			if(i == 0) {
				menor = vet[i];
			}else if(vet[i] < menor){
				menor = vet[i];
			}
		}
		
		
		//Conferindo n�meros pares
		for(int i = 0; i< vet.length; i++ ) {
			if(vet[i] % 2 == 0) {
				System.out.println("N�meros pares: " + vet[i]);
			}
			if(vet[i] > result) {
				maiorMedia++;
			}
		}
		
		//Resultado	
		System.out.print("\nMenor valor da matriz: " + menor);
		System.out.println("\nM�dia dos valores: " + result);
		System.out.println("\nQuantidade de n�meros maiores que a m�dia: " + maiorMedia);

	}

}
