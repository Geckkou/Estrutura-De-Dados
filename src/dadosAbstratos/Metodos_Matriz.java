package dadosAbstratos;

public class Metodos_Matriz {
	private int[][] m;
	
	public Metodos_Matriz(int qLin, int qCol){
		m = new int[qLin][qCol];
	}
	
	public void escrever( int l, int c, int valor) {
		if (l>=1 && l<=m.length && c>=1 && c<=m[0].length)
		  m[l-1][c-1] = valor;
		else
			System.out.println("Fora dos limies!");
	}

	public int ler(int l, int c) {
		if (l>=1 && l<=m.length && c>=1 && c<=m[0].length)
			return (m[l-1][c-1]);
		else
			System.out.println("Fora dos limies!");
		return -1;
	}

	public int qtd_Linhas() {
		return m.length;
	}
	
	public int qtd_Colunas() {
		return m[0].length;
	}

	
	public void exibir() {	
		for (int i = 1; i <= qtd_Linhas(); i++) {
			for (int j = 1; j <= qtd_Colunas(); j++) {
				System.out.print( ler(i, j) + " " );
			}
			System.out.println();
		}
	}

	public void preencher (int valor ){
		for (int i = 1; i <= qtd_Linhas(); i++) {
			for (int j = 1; j <= qtd_Colunas(); j++) {
				escrever(i, j , valor );
			}
		}	
	}
	
	public int somatorio() {
	int somaall = 0;
	for(int l =0; l < qtd_Linhas(); l++ ) {
		for(int c=0; c < qtd_Colunas(); c++) {
			somaall += ler(l, c);
		}
	}
	return somaall;
}

}
