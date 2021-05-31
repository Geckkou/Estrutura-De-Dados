package vetorMatrizMult;

import java.util.Scanner;

public class ExercicioMatrizSoma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s  = new Scanner(System.in);
		int [][]mat = new int[3][3];
		
		for(int l =0; l <mat.length; l++ ) {
			for(int c=0; c <mat[l].length; c++) {
				System.out.print("informe uma matriz: "+ "["+l+","+c+"] : ");
				mat[l][c] = s.nextInt();
			}
		}
		
		//matriz
		System.out.println("<\n----Matriz---->");
		for(int l =0; l < mat.length; l++) {
			for(int c = 0 ; c < mat[l].length; c++) {
				System.out.print(mat[l][c] + " ");
			}
			System.out.println(" ");
		}
		
		//soma dos elementos da primeira coluna
	int  somapc = 0;
		for(int l =0; l <mat.length; l++ ) {
			for(int c=0; c <mat[l].length; c++) {
				if(c == 0) {
				somapc += mat[l][c];
				}
			}	
		}
		
		//o produto dos elementos da primeira linha
	int multpl = 1;
	
		for(int l =0; l <mat.length; l++ ) {
			for(int c=0; c <mat[l].length; c++) {
				if(l == 0) {
				multpl *= mat[l][c];
				}
			}
		}
		
		//a soma de todos os elementos da matriz;
	int somaall = 0;
		for(int l =0; l <mat.length; l++ ) {
			for(int c=0; c <mat[l].length; c++) {
				somaall += mat[l][c];
			}
		}
		
		//a soma do diagonal principal
			int somadp = 0;
				for(int l =0; l <mat.length; l++ ) {
					for(int c=0; c <mat[l].length; c++) {
						if(l == c) {
							somadp +=  mat[l][c];
						}
			}
		}
		
		//a soma das diagonais secundarias
				int somaSec = 0;
				int col = mat.length -1;
				for(int l =0; l< mat.length; l++) {
					somaSec+=mat[l][col];
					col--;
				}
				
				System.out.println("\nSoma dos elementos da primeira coluna: " + somapc);
				System.out.println("O produto dos elementos da primeira linha: " + multpl);
				System.out.println("A soma de todos os elementos da matriz: " + somaall);
				System.out.println("A soma do diagonal principal: " + somadp);
				System.out.println("A soma da diagonal secundária: " + somaSec);

	}

}
