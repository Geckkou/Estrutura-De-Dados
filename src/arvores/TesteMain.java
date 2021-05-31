package arvores;

public class TesteMain extends Teste_Arvore2{

	public static void main(String[] args) {

		int vet [] = { 9, 5, 14, 3, 7, 12, 17, 2, 4, 6, 8, 13, 16, 18 };
		NoTree a, resp;

		a = null;

		for (int i = 0; i < vet.length; i++){
			a = insert(a, vet[i]);
		}


		System.out.print("Árvore (DLR): [ ");
		Ler_DLR(a);
		System.out.println(" ]");

		System.out.print("Árvore (LDR): [ ");
		Ler_LDR(a);
		System.out.println(" ]");

		System.out.print("Árvore (LRD): [ ");
		Ler_LRD(a);
		System.out.println(" ]");

		System.out.println("--- printNo ---");
		printNo(a, 16);

		int b = 17;
		System.out.println("--- search ---");
		resp = search(a, b);
		if (resp!= null) System.out.println( "Chave (info): "+ resp.info + "\ndobro = " + resp.dobro);
		else System.out.println("Não encontrou!");
		System.out.println("--- search2 ---");
		resp = search2(a, b);
		if (resp!= null) System.out.println( "Chave (info): "+ resp.info + "\ndobro = " + resp.dobro);
		else System.out.println("Não encontrou!");

	}

}


