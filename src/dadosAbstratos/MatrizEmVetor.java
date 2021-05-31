package dadosAbstratos;

import java.util.ArrayList;
import java.util.Scanner;

public class MatrizEmVetor {
	
public static void vetorDeMatriz(int linha,int coluna) {
		int matriz [][] = new int[linha][coluna];
		Scanner input = new Scanner(System.in);
		
		
		for(int l = 0; l < matriz.length; l++ ) {
			for(int c=0; c <matriz[l].length; c++) {
				System.out.print("informe os valores da matriz: "+ "["+l+","+c+"] : ");
				matriz[l][c] = input.nextInt();
			}
		}
		ArrayList<Integer> vetor = new ArrayList<>();
		
		for(int l = 0; l < matriz.length; l++ ) {
			for(int c=0; c <matriz[l].length; c++) {
					vetor.add(matriz[l][c]);
			}
		}
		
		 for(int ve : vetor) {
			 System.out.print("[" + ve + "]");
		 }
		
		
	}
}
