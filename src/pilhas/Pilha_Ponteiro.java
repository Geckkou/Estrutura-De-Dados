package pilhas;

public class Pilha_Ponteiro {
	private No_Char ini, fim;
	private int max, tam;
	
	public Pilha_Ponteiro (){
		ini = null;
		fim = null;
		tam = 0;
		max = 1000;
	}

	public Pilha_Ponteiro ( int maxElementos){
		ini = null;
		fim = null;
		tam = 0;
		max = maxElementos;
	}

	public boolean underflow(){
		return ( size() == 0 );
	}
	
	public boolean overflow(){
		return ( size() == max );
	}
	
	public void addLast( char e ){
		if ( tam < max ) {
			// addLast
			if ( tam == 0 ) {
				ini = new No_Char ( e );
				fim = ini;
				tam++;
			}
			else {
				No_Char novo  = new No_Char (e);
				fim.prox = novo;
				fim = novo;
				tam++;
			}
		} else
			System.out.println("Lista cheia!!!");	
	}
	
	public void push( char e ){
		//implementar
		if ( tam < max ) {
			// addFist
			if ( tam == 0 ) {
				ini = new No_Char ( e );
				fim = ini;
				tam++;
			}
			else {
				No_Char novo  = new No_Char (e);
				novo.prox = ini;
				ini = novo;
				tam++;
			}
		} else
			System.out.println("Lista cheia!!!");	
	}
	
	public char getLast() {
		// implementar
		if ( size() != 0 ) {
			return fim.info;
		}
		else {
			System.out.println("Lista vazia!!!");
			return 0;
		}
	}

	public char top() {
		// implementar
		if ( size() != 0 ) {
			return ini.info;
		}
		else {
			System.out.println("Lista vazia!!!");
			return 0;
		}
	}

	public char pop( ){
		//implementar
		if ( size() != 0 ) {
			char res = ini.info;
			if ( size() == 1 ) {
				ini = null;
				fim = null;
				tam--;
			}
			else {
					ini = ini.prox;
					tam--;
			}
			return res;
		}
		else {
			System.out.println("Lista vazia!!!");
			return 0;
		}	
	}
	
	public char removeLast( ){
		//implementar
		if ( size() != 0 ) {
			char res = fim.info;
			if ( size() == 1 ) {
				ini = null;
				fim = null;
				tam--;
			}
			else {
				No_Char aux = ini;
					while ( aux.prox.prox != null )
						aux = aux.prox;
					aux.prox = null;
					fim = aux;
					tam--;
			}
			return res;
		}
		else {
			System.out.println("Lista vazia!!!");
			return 0;
		}	
	}
	
	@Override
	public String toString() {
		String res = "TOPO>>[ ";
		for (int i = 0; i < size(); i++) {
			res = res + get(i) + " ";
		}
		res = res + "]<<BASE";
		return res;
	}
	
	
	
	public void addLast_sem_fim( char e ){
		
		if ( tam == 0 )
		{
			ini = new No_Char(e);
			tam++;
		}
		else
		{
			No_Char aux = ini;
			while ( aux.prox != null ) 
				aux = aux.prox;
			No_Char novo = new No_Char(e);
			aux.prox = novo;
			tam++;
		}
	}
	
	public void addLast_Padrao( char e ){
		if ( tam == 0 ) {
			ini = new No_Char();
			ini.info = e;
			ini.prox = null;
			fim = ini;
			tam++;
		}
		else {
			No_Char novo = new No_Char();
			novo.info = e;
			novo.prox = null;
			fim.prox = novo;
			fim = novo;
			tam++;
		}
	}
	// addLast():
	// criar um novo Nó
	// Se a lista estiver vazia, esse Nó novo será o primeiro e o último
	// senão ligar o último elemento (atual) com esse novo Nó!
	// Esse novo Nó será último nó da lista 
	
	public int size() {
		return tam;
	}

	// char <- get(i):
	// criar um Nó aux
	// Se o i está na lista, entao percorrer até o elemento i; depois retorna a informação
	// senão imprime a mensagem que o i está fora da lista!
	
	public char get ( int index ) {
		if (index >=0 && index<size() )
		{
			No_Char aux = ini;
			for (int i = 0; i < index; i++) 
				aux = aux.prox;
			return aux.info;	
		}
		else
		{
			System.out.println("Posição fora da lista!");
			return 0;
		}
	}
}
