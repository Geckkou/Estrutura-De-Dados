package filas;

public class Teste_Fila {

	public static void main(String[] args) {
		Fila_Ponteiro f = new Fila_Ponteiro(5);

		System.out.println("\n--== Fila_ponteiro ==--");
		System.out.println( f );
		System.out.println("f underflow: " +  f.underflow() );
		System.out.println("f overflow : " +  f.overflow() );
		f.entraFila(4);
		f.entraFila(8);
		System.out.println( f );
		System.out.println("Inicio da fila f: " +  f.consultaFila());
		f.entraFila(12);
		f.entraFila(15);
		f.entraFila(7);
		System.out.println( f );
		System.out.println("f underflow: " +  f.underflow() );
		System.out.println("f overflow : " +  f.overflow() );
		f.entraFila(100);
		System.out.println( f );
		f.saiFila();
		System.out.println( f );
		f.saiFila();
		System.out.println( f );
		f.entraFila(50);;
		System.out.println( f );

	}

}


