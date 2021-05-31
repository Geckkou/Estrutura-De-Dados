package pilhas;

import java.util.Scanner;
import java.util.Stack;

public class Exerc_FraseInvertida {

	public static void main(String[] args) {
		Pilha_array pa = new Pilha_array();
		
		
		System.out.println("Digite uma frase ou palavra: ");
		Scanner input = new Scanner(System.in);
		String frase = input.next();
		String fraseInvertida = "";
		input.nextLine();
		
		
		
		for(int i = 0;i <frase.length();i++) {
		pa.push(frase.charAt(i));
		}
		
		while(!pa.underflow()) {
			fraseInvertida = fraseInvertida + pa.pop();
		}
		
		
		System.out.println("Frase: " + frase);
		System.out.println("Frase invertida: " + fraseInvertida);

	}

}
