package projeto_unidade1;

public class MainLista {

	public static void main(String[] args) {

		Lista_array s = new Lista_array(10);
		
		s.addLast(8);
		s.addLast(5);
		s.addLast(3);
		s.addLast(5);
		s.addLast(2);
		s.addLast(8);
		s.addLast(3);
		s.addLast(3);
		s.addLast(1);
		s.addLast(4);		
		//s.remove(0,8);
		//s.set(9, 23);
		//s.addLast(34);
		
		//System.out.println(s.get(2));
		//System.out.println(s.get(1));
		s.relatorio();
		System.out.println("");
		System.out.println(s.toString());
		System.out.println("A média é: "+ s.media(s));
	
	}

}
