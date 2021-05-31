package arvores;

public class Teste_Arvore2 {
	
	public static NoTree insert (NoTree p, int d){
		if (p == null){
			p = new NoTree(d, d*2);
			/*p = new NoTree();
			p.info = d;
			p.L = null;
			p.R = null;
			*/
			return p;
		} 
		else {
			if (d > p.info) {
				p.R = insert(p.R, d);
			}else {
				p.L = insert(p.L, d);
			}
			return p;
		}
	}

	public static void Ler_LDR (NoTree p){
		if (p != null){
			Ler_LDR(p.L);
			System.out.print(p.info+ " ");
			Ler_LDR(p.R);
		}
	}

	public static void Ler_DLR (NoTree p){
		if (p != null){
			System.out.print(p.info+ " ");
			Ler_DLR(p.L);
			Ler_DLR(p.R);
		}
	}

	public static void Ler_LRD (NoTree p){
		if (p != null){
			Ler_LRD(p.L);
			Ler_LRD(p.R);
			System.out.print(p.info+ " ");
		}
	}
	

	public static void printNo (NoTree p, int chave){
		if (p != null){
			printNo(p.L, chave);
			printNo(p.R, chave);
			if (p.info==chave) System.out.println(p.info+ " ");
		}
	}
	
	public static NoTree search(NoTree p, int d) {
		if (p == null) {
			return p;
		} else {
			if (d == p.info) {
				return p;
			} else {
				if (d > p.info) {
					return search(p.R, d);
				} else {
					return search(p.L, d);
				}
			}
		}
	}

	public static NoTree search2(NoTree p, int key){
        NoTree aux = p;
        while(aux != null){
            if(aux.info == key){
                return aux;
            }
            else if(aux.info > key){
                aux = aux.L;
            }
            else{
                aux = aux.R;
            }
        }
        return aux;
    }


}
