package recursividade;

public class MdcRecursividade {

	public static void main(String[] args) {
		int resposta = mdc(8, 20);
		System.out.println(resposta);
	}
	
	public static int mdc(int n, int m) {
		if ((m <= n) && (n%m == 0)) {
			return  m;
		}else if(n < m) {
			return mdc(m, n);
		}else {
			return mdc(m, (n % m));
		}
	}

}
