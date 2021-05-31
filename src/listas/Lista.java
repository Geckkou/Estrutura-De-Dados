package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista {

	public static void main(String[] args) {
		salariosInput(3);
		

	}
	
	public static void salariosInput(int qntd) {
		float vetor [] = new float [qntd];
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < vetor.length;i++) {
			System.out.print("Informe o salário do " + (i+1) +"º funcionário: ");
			vetor[i] = s.nextFloat();
		}
		
			ArrayList<Float> valor = new ArrayList<>();
		
			for(int i = 0;i <vetor.length; i++) {
				valor.add(vetor[i]);
			}
			
			for(float val : valor) {
				System.out.println(" [" +"R$ "+ val + "] ");
			}
			System.out.println("Número de funcionários: " + qntd);
			media(valor);
	}
	
	
	
	public static void media(ArrayList<Float> array) {
		int soma =0;
		double media = 0;
		int cont = 0;
		
		for(float val : array) {
			soma+=val;
		}
		media = soma/array.size();
		
		for(float me : array) {
			if(media < me) cont++;
		}
		System.out.println("Valores a cima da média: " + cont);
		System.out.println("A média dos sálarios é de: " + media);
	}
	
	
	

}
