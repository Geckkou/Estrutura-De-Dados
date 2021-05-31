package estruturaCompostaHeterogenas;

import java.util.Scanner;

public class Endereco {
	public String rua;
	public String bairro;
	public String cidade;
	public String estado;
	public int cep;
	
	public void endereco() {
		Scanner input = new Scanner(System.in);
		System.out.print("Informe a Rua: ");
		this.rua = input.next(); 
		input.nextLine();
		System.out.print("Informe o Bairro: ");
		this.bairro = input.next();
		input.nextLine();
		System.out.print("Informe a Cidade: ");
		this.cidade = input.next();
		input.nextLine();
		System.out.print("Informe o Estado: ");
		this.estado = input.next();
		
		System.out.print("Informe o Cep: ");
		this.cep = input.nextInt();
		
	}

	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + ", cep="
				+ cep + "]";
	}

}
