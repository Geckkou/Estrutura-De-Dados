package projeto_unidade1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JOptionPane;

public class Lista_array {
	private double vet[];
	private int max,livre;
	
	//Construtor
	public Lista_array() {
		max = 10;
		vet =  new double[max];
		livre = 0 ;
	}
	
	public Lista_array(int maxElementos) {
		max = maxElementos;
		vet =  new double[max];
		livre = 0 ;
	}
	
	//M�todos
	//Tamanho
	public int size(){
		return livre; 
	}
	
	//Get Elemento
	public double get ( int i ) {
		if ((i >= 0) && (i < size())) {
			return vet[i];
		} else {
			System.out.println("Elemento n�o consta da lista!!!");
			return 0;
		}
	}
	
	//Adiciona elementos
	public void addLast(double v){
		if ( livre < max ) {
			vet[livre] = v;
			livre++;
		} else
			System.out.println("Lista cheia!!!");
	}
	
	
	//Remover elemento
	public void remove(int index,double valor) {
		if((index >=0) && (index < livre)) {
			for(int i = 0; i != vet.length; i++) {
				if(vet[i] == valor) 
				 vet[i] = 0;	
			} 
		} else {
			System.out.println("Valor n�o existe na lista.");
		}
	}

	
	//Alterando o valor do array
	public double set(int index, double valor) {
		if(index >= 0 && (index < size())) {
			System.out.println("Valor a ser alterado: " + vet[index]);
			vet[index] = valor;
		} else { 
			System.out.println("Valor n�o existe na lista !!");
	}
		return vet[index];
}
	
	
	//Faz a m�dia dos valores do array
	public double media(Lista_array array) {
		double soma = 0;
		double media = 0;
		
		for(int i = 0; i < size(); i++) {
			soma+=get(i);
		}
		media = soma / size();
		return media;
	}
	
	//Relat� de frequ�ncia
	public void relatorio() {
		double [] oco = new double[10];
		
		int cont = 1;
		System.out.println("");
		System.out.println("RELATÓRIO DE FREQUÊNCIA");
		System.out.println("=======================");
		double last = vet[0] + 1;
		double la = vet[1] + 1;
		//Arrays.sort(vet);
		
		//Conta quantas vezes o numero se repete
		for(int j = 0; j < vet.length; j++) {
			cont = 0;
			for(int k = 0; k < vet.length; k++) {
				if(vet[k] == vet[j]) {
					cont++;
					oco[j] = cont;
				}	
			}
		}
		
		//Mostra somento o numero repetido
		for(int i = 1; i < vet.length; i++) {
			if(vet[i] == vet[i-1] && last != vet[i-1]) {
				last = vet[i];
				System.out.println(last + " - " + (int)oco[i] + " Vezes");
			} 
		}
		
		/*Collection vetor = new ArrayList<>();
		for(int i = 0; i < vet.length; i++) {
			vetor.add(vet[i]);
		}
		
		Collection lista = new ArrayList<>();
		for(int i = 0; i < vet.length; i++) {
			lista.add(vet[i]);
		}
		
		Set<Integer> vezes = new HashSet<Integer>(vetor);
			Iterator<Integer> repeIterator = vezes.iterator();
			
		Set<Double> numeros = new HashSet<Double>(lista);
			Iterator<Double> iterator = numeros.iterator();
		
		//double [] res = Arrays.stream(vet).distinct().toArray();
			while(iterator.hasNext() && repeIterator.hasNext()) {
				System.out.println(iterator.next() + " - "+ Collections.frequency(vetor, repeIterator.next()) + " Vezes");	
		}*/
			
	}
	
	//Imprime o array
	@Override
	public String toString() {
		return  Arrays.toString(vet);
	}
}
