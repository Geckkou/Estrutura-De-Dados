package algoritmos;

import java.util.Scanner;

public class Busca_Binaria {
	
	public static void main(String[] args) {
		
		int [] vetor = new int [8];
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = i * 2;
			//System.out.println(vetor[i]);
		}
		
		System.out.println("Qual número você busca ?");
		Scanner s = new Scanner(System.in);
		int buscado = s.nextInt();
		
		boolean achou = false;
		
		int contador = 0;
		int inicio = 0;
		int fim = vetor.length - 1;
		int meio;
		
		// BUSCA BINÁRIA O(LOG N)
		while(inicio <= fim) {
			meio = (int) ((inicio + fim) / 2);
			contador++;
			if(vetor[meio] == buscado) {
				achou = true;
				break;
			} else if(vetor[meio] < buscado) {
				inicio = meio + 1;
			} else { //so pode ser maior 
				fim = meio - 1;
			}
		}
		
		System.out.println("Número de testes: " + contador);
		
		if(achou) {
			System.out.println("Número encontrado");
		} else {
			System.out.println("Número não encontrado");
		}
	}

}
