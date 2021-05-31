package pilhas;

import java.util.LinkedList;
import java.util.Stack;

public class Teste_Pilha{

	public static void main(String[] args) {
	
		LinkedList <Character> a = new LinkedList <Character>();
		Stack p = new Stack ();
		Pilha_array pa = new Pilha_array(5);
		Pilha_Ponteiro pp = new Pilha_Ponteiro(5);
		
		p.push('L');
		p.push('e');
		System.out.println( p );
		System.out.println("topo de p: " +  p.peek() );

		System.out.println("\n--== Pilha_array ==--");
		System.out.println( pa );
		System.out.println("pa underflow: " +  pa.underflow() );
		System.out.println("pa overflow : " +  pa.overflow() );
		pa.push('L');
		pa.push('e');
		System.out.println( pa );
		System.out.println("pa underflow: " +  pa.underflow() );
		System.out.println("pa overflow : " +  pa.overflow() );

		System.out.println("topo de pa: " +  pa.top() );
		pa.push('o');
		pa.push('p');
		pa.push('.');
		System.out.println( pa );
		System.out.println("pa underflow: " +  pa.underflow() );
		System.out.println("pa overflow : " +  pa.overflow() );
		pa.pop();
		pa.push('!');
		System.out.println( pa );

		System.out.println("\n--== Pilha_ponteiro ==--");
		System.out.println( pp );
		System.out.println("pp underflow: " +  pp.underflow() );
		System.out.println("pp overflow : " +  pp.overflow() );
		pp.push('L');
		pp.push('e');
		System.out.println( pp );
		System.out.println("pp underflow: " +  pp.underflow() );
		System.out.println("pp overflow : " +  pp.overflow() );

		System.out.println("topo de pp: " +  pp.top() );
		pp.push('o');
		pp.push('p');
		pp.push('.');
		System.out.println( pp );
		System.out.println("pp underflow: " +  pp.underflow() );
		System.out.println("pp overflow : " +  pp.overflow() );
		pp.pop();
		pp.push('!');
		System.out.println( pp );
		
		
		
		System.out.println( a );
		
		a.addFirst('A');
		a.addLast('B');
		System.out.println( a );
			
		// [ A B ]
		System.out.println( "retorno da posição(1): " + a.set(1,'C') );
		System.out.println( a );
		System.out.println( "retorno da posição(1): " + a.set(1,'X') );
		System.out.println( "Posição(1): " + a.get(1) );
		
		System.out.println( a );
		
		
		// Teste de Pilha
		
		String frase = "A casa é verde.", frase_invertida="", expr="(a+b*(2/3)-((2*3)+5))";
		
		System.out.println( frase.charAt(2) );
		System.out.println("Tamanho da frase = " + frase.length() );
		System.out.println( frase.charAt(14) );
		
		frase_invertida = frase_invertida + 'x';
		frase_invertida = frase_invertida + 'i'; // frase_invertida "xi"
		System.out.println("frase_invertida = " + frase_invertida );

	}

}
