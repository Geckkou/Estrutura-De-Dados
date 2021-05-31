package pilhas;

public class No_Char {

	public char info;
	public No_Char prox;
	
	public No_Char ( char v ){
		info = v;
		prox = null;
	}

	public No_Char ( char v, No_Char p ){
		info = v;
		prox = p;
	}

	public No_Char (){
		
	}
	

}
