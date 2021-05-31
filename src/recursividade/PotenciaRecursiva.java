package recursividade;

public class PotenciaRecursiva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PotenciaRecursiva elevado = new PotenciaRecursiva();
		System.out.println(elevado.power(5, 2));
		
		System.out.println(powerIterativo(5, 2));

	}
	
	public  double power(double a, int b) {
		if(b == 0) {
			return 1;
		}else {
			return a * power(a, b - 1);
		}
	}
	
	public static double powerIterativo(double n, int e) {
		int result =1;
		if(e == 0) {
			return 1;
		}else {
			for(int  i =0; i <= e; i++) {
				result *= n;
				e--;
			}
		}
		return result;
	}
}
