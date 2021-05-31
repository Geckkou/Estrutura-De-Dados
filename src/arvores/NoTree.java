package arvores;

public class NoTree {
	public int info, dobro;
	public NoTree L, R;
	
	public NoTree(int v, int d) {
		this.info = v;
		this.dobro = d;
		this.L = null;
		this.R = null;
	}
	
	public NoTree() {
		this.L = null;
		this.R = null;
	}

}
