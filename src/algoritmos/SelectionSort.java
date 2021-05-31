package algoritmos;

public class SelectionSort {

	public static void main(String[] args) {
		
		int [] vetor = new int [10];
		
		System.out.println("===== VETOR DESORDENADO =====");
		for(int i = 0; i < vetor.length; i++ ) {
			vetor[i] = (int) (Math.random() * vetor.length);
			System.out.print("["+vetor[i]+"]");
		}
		
		//SELECTION SORT 0(N^2)
		int pos_menor, aux; 
		for(int  i = 0; i< vetor.length; i++) {
			pos_menor = i;
			for(int j = i + 1; j < vetor.length; j++) {
				if(vetor[j] < vetor[pos_menor]) {
					pos_menor = j;
				}
			}
			aux = vetor[pos_menor];
			vetor[pos_menor] = vetor[i];
			vetor[i] = aux;
		}
		
		System.out.println("\n\n===== VETOR ORDENADO =====");
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("["+vetor[i]+"]");
		}

	}

}
