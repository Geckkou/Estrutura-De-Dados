package estruturaCompostaHeterogenas;

import java.util.Arrays;
import java.util.Scanner;

public class Registro extends Endereco {
	public String nome;
	public byte semestre;
	public byte sala;
	public String curso;
	public double [] notas = new double[6];
	
	
	
	public void dados() {
		Scanner input = new Scanner(System.in);
		System.out.print("informe o nome do aluno: ");
		this.nome = input.next(); 
	
		System.out.print("informe o semestre: ");
		this.semestre = input.nextByte();
		
		System.out.print("informe o número da sala: ");
		this.sala = input.nextByte();
		
		System.out.print("informe o nome do curso: ");
		this.curso = input.next();
		input.nextLine();
		int cont =0;
		for(int j =0; j < this.notas.length; j++) {
			cont++;
			System.out.print("informe a "+(j+1)+"º nota do aluno: ");
			this.notas[j] = input.nextDouble();
			}
	}


	@Override
	public String toString() {
		return "::::::DADOS:::::: [\nNome:" + nome + 
				"\nSemestre: " + semestre + 
				"\nSala: " + sala + 
				"\nCurso:" + curso + 
				"\nNota: "
				+ Arrays.toString(notas) + 
				"\n::::::ENDEREÇO::::::"+
				"\nRua: " + this.rua +
				"\nBairro: " + this.bairro +
				"\nCidade: " + this.cidade +
				"\nEstado: " +this.estado +
				"\nCep: " + this.cep + "]";
	}
}
	

