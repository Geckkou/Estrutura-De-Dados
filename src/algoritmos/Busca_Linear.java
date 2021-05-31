package algoritmos;

import java.util.Scanner;

public class Busca_Linear {
	public static void main(String[] args) {
		
		int [] vetor = new int [8];
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * 100000);
			System.out.println(vetor[i]);
		}
		
		System.out.println("Qual número você busca ?");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		boolean achou = false;
		int pos = 0;
		
		//BUSCA LINEAR O(N)
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] == num) {
				pos = i;
				achou = true;
				break;
			} 
		}
		
		if(achou) {
			System.out.println("Número encontrado na posição: " + pos);
		} else {
			System.out.println("Número não encontrado");
		}
	}

}
