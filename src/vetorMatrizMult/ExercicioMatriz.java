package vetorMatrizMult;

import java.util.Scanner;

public class ExercicioMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ex 1 ler e imprimir uma matriz
		Scanner s  = new Scanner(System.in);
		int [][]mat = new int[2][4];
		
		for(int l =0; l <mat.length; l++ ) {
			for(int c=0; c <mat[l].length; c++) {
				System.out.print("informe os valores da matriz: "+ "["+l+","+c+"] : ");
				mat[l][c] = s.nextInt();
			}
		}
		
		for(int l =0; l < mat.length; l++) {
			for(int c = 0 ; c < mat[l].length; c++) {
				System.out.print(mat[l][c] + " ");
			}
			System.out.println(" ");
		}

	}

}
