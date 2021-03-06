package listas;

public class Lista_ponteiro {

	private No ini, fim;
	private int max, tam;
	
	public Lista_ponteiro (){
		ini = null;
		fim = null;
		tam = 0;
		max = 1000;
	}

	public Lista_ponteiro ( int maxElementos){
		ini = null;
		fim = null;
		tam = 0;
		max = maxElementos;
	}

	public void addLast( double e ){
		if ( tam < max ) {
			// addLast
			if ( tam == 0 ) {
				ini = new No ( e );
				fim = ini;
				tam++;
			}
			else {
				No novo  = new No (e);
				fim.prox = novo;
				fim = novo;
				tam++;
			}
		} else
			System.out.println("Lista cheia!!!");	
	}
	
	public void addFirst( double e ){
		//implementar
		if ( tam < max ) {
			// addFist
			if ( tam == 0 ) {
				ini = new No ( e );
				fim = ini;
				tam++;
			}
			else {
				No novo  = new No (e);
				novo.prox = ini;
				ini = novo;
				tam++;
			}
		} else
			System.out.println("Lista cheia!!!");	
	}
	
	public double removeFirst( ){
		//implementar
		if ( size() != 0 ) {
			double res = ini.info;
			if(size() == 1) {
				ini = null;
				fim = null;
				tam--;
			} else {
				ini = ini.prox;
				tam--;
			}
			return res;
		} else {
			System.out.println("Lista vazia!!!");
			return 0;
		}	
	}
	
	public double removeLast( ){
		//implementar
		if(size() != 0) {
			double res = fim.info;
			if(size() == 1) {
				ini = null;
				fim = null;
				tam--;
			} else {
				No aux = ini;
				while(aux.prox.prox != null) 
					aux = aux.prox;
				aux.prox = null;
				fim = aux; 
				tam--;
			}
			return res;
		} else {
			System.out.println("Lista vazia !");
			return 0;
		}
		
	}
	
	public void addLast_sem_fim( double e ){
		
		if ( tam == 0 )
		{
			ini = new No(e);
			tam++;
		}
		else
		{
			No aux = ini;
			while ( aux.prox != null ) 
				aux = aux.prox;
			No novo = new No(e);
			aux.prox = novo;
			tam++;
		}
	}
	
	public void addLast_Padrao( double e ){
		if ( tam == 0 ) {
			ini = new No();
			ini.info = e;
			ini.prox = null;
			fim = ini;
			tam++;
		}
		else {
			No novo = new No();
			novo.info = e;
			novo.prox = null;
			fim.prox = novo;
			fim = novo;
			tam++;
		}
	}
	// addLast():
	// criar um novo N??
	// Se a lista estiver vazia, esse N?? novo ser?? o primeiro e o ??ltimo
	// sen??o ligar o ??ltimo elemento (atual) com esse novo N??!
	// Esse novo N?? ser?? ??ltimo n?? da lista 
	
	public int size() {
		return tam;
	}

	// double <- get(i):
	// criar um N?? aux
	// Se o i est?? na lista, entao percorrer at?? o elemento i; depois retorna a informa????o
	// sen??o imprime a mensagem que o i est?? fora da lista!
	
	public double get ( int index ) {
		if (index >=0 && index<size() )
		{
			No aux = ini;
			for (int i = 0; i < index; i++) 
				aux = aux.prox;
			return aux.info;	
		}
		else
		{
			System.out.println("Posi????o fora da lista!");
			return 0;
		}
	}


	public double getLast() {
		// implementar
		if ( size() != 0 ) {
			return fim.info;
		}
		else {
			System.out.println("Lista vazia!!!");
			return 0;
		}
	}

	public double getFirst() {
		// implementar
		if ( size() != 0 ) {
			return ini.info;
		}
		else {
			System.out.println("Lista vazia!!!");
			return 0;
		}
	}
	
	@Override
	public String toString() {
		String res = "[ ";
		for (int i = 0; i < size(); i++) {
			res = res + get(i) + " ";
		}
		res = res + "]";
		return res;
	}
	

}
