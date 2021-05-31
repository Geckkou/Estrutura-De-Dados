package listas;

public class Lista_array {
	private double[] vet;
	private int max, livre;

	public Lista_array (){
		max = 1000;
		vet = new double[max];
		livre = 0;
	}

	public Lista_array ( int maxElementos){
		max = maxElementos;
		vet = new double[max];
		livre = 0;
	}

	public void addLast( double v ){
		if ( livre < max ) {
			vet[livre] = v;
			livre++;
		} else
			System.out.println("Lista cheia!!!");
	}

	public void addFirst( double v ){
		//mover todos os elementos
		if ( livre < max ) {
			for (int i = livre; i > 0; i--) {
				vet[i] = vet[i-1];
			}
			vet[0] = v;
			livre++;
		} else
			System.out.println("Lista cheia!!!");

	}
	
	public double removeFirst( double v ){
		//implementar
		double inicio = vet[0];
		if ( size() != 0 ) {
			for (int i = 0; i < livre; i++) {
				vet[i] = vet[i+1];
			}
			livre --;
			return inicio;
		} else {
			System.out.println("Lista vazia !!!");
			return 0;
		}
	}
	
	public double removeLast( double v ){
		//implementar
		if ( size() != 0 ) {
			livre --;
			return vet[livre];
		} else {
			System.out.println("Lista vazia !!!");
			return 0;
		}
	}
	
	public double get ( int i ) {
		// implementar
		if ((i >= 0) && (i < size() )) {
			return vet[i];
		} else {
			System.out.println("Elemento não consta da lista!!!");
			return 0;
		}
	}
	
	public int size(){
		// implementar
		return livre; 
	}

	public double getLast() {
		// implementar
		if ( size() != 0 ) {
			return vet[ livre - 1 ];
		}
		else {
			System.out.println("Lista vazia!!!");
			return 0;
		}
	}

	public double getFirst() {
		// implementar
		if ( size() != 0 ) {
			return vet[ 0 ];
		}
		else {
			System.out.println("Lista vazia!!!");
			return 0;
		}
	}

	/*
	 * Supondo que a lista seja: [ 23.0, 56.0, 34.0, 87.0, 12.0 ]
	   Na hora que for chamada a operação, será exibido na tela de saída: [ 23.0; 12.0 ]

	 */
	public void extremos(){
		if ( size() != 0 ) {
			System.out.println("[ "+ vet[0] +"; "+vet[livre-1]+" ]"); 
		}
		else System.out.println("Lista Vazia!");
	}
	
	
}
