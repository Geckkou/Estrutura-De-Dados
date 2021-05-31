package projeto_unidade1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class MainLinkedList {

	public static void main(String[] args) {
		input();
			
	}
	
	public static void input() {
		LinkedList<Double> list = new LinkedList<>();
		double [] vetor = new double[10];
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < vetor.length;i++) {
			System.out.print("Informe 10 números " + (i+1) +"º número: ");
			vetor[i] = s.nextDouble();
			list.add(vetor[i]);
			
		}
		
			System.out.println("");
			System.out.print("Lista de números: ");
			Iterator<Double> it = list.iterator();
			while(it.hasNext()) {
				System.out.print("[" + it.next() + "" + "]");
			}
			System.out.println("");
			media(list);
			relatorio(list);
	}
	
	
	public static void media(LinkedList<Double> list) {
		double soma =0;
		double media = 0;
	
		
		for(double val : list) {
			soma+=val;
		}
		media = soma/list.size();
		
		System.out.println("A média dos elementos é de: " + media);
	}
	
	public static void relatorio(LinkedList<Double> list) {
		//LinkedList<Double> lista = new LinkedList<>();
		
		Collection lista1 = new LinkedList<>();
		lista1 = list;
		
		Collection lista2 = new LinkedList<>();
		lista2 = list;
		
		
		System.out.println("");
		System.out.println("RELATÓRIO DE FREQUÊNCIA");
		System.out.println("=======================");
		
		/*lista2 = Collections.singleton(new HashSet(lista2));*/
		
		/*for (Object object : lista2) {
			System.out.println(object);
		}*/
		
		Set<Double> lista = new HashSet<Double>(lista1);
		
		Set<Integer> numerosSemRepeticoes = new HashSet<Integer>(lista2);

		Iterator<Integer> iteradorDeNumerosSemRepeticoes = numerosSemRepeticoes
				.iterator();
		
		Iterator<Double> valores = lista
				.iterator();
		
		
		while (iteradorDeNumerosSemRepeticoes.hasNext() && valores.hasNext()) {
			System.out.println(valores.next() + " - " +
					Collections.frequency(lista2,iteradorDeNumerosSemRepeticoes.next()) + " Vezes");
			
		}	
	}
}
