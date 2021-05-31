package dadosAbstratos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int [][] mat = new int[5][5];
		
		MatrizAbstrata_Escrever.escrever(mat, 4, 4, 4);
		
		System.out.println("mat [0][0] = " + mat[4][4]);
		System.out.println("mat [0][0] (ler): " + MatrizAbstrata_Ler.ler(mat, 4, 4));
		*/
		
		MatrizEmVetor.vetorDeMatriz(2, 2);
		System.out.println("");
		System.out.println("------ mat_oo ------");
		Metodos_Matriz mat_oo = new Metodos_Matriz(5, 7);
		
		mat_oo.exibir();
		mat_oo.preencher(4);
		
		System.out.println("Soma: " + mat_oo.somatorio());
		
		mat_oo.escrever(1, 1, 2);
		mat_oo.escrever(1, 7, 9);

		mat_oo.exibir();
		mat_oo.escrever(1, 1, 2);
		mat_oo.escrever(1, 7, 9);
		
		System.out.println("Primeira linha de mat_oo: ");
		for (int c = 1; c <= mat_oo.qtd_Colunas(); c++) {
			System.out.print( mat_oo.ler(1, c) +  " ");
		}
		System.out.println();

	}

}
