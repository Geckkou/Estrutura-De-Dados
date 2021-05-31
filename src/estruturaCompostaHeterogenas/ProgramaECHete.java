package estruturaCompostaHeterogenas;

import java.util.Scanner;

public class ProgramaECHete {

	public static void main(String[] args) {
		
		//Pessoa p1 = new Pessoa();
		//Pessoa [] vet = new Pessoa[50];
		
		/*
		p1.nome = "Pedro";
		p1.idade = 21;
		p1.altura = 1.70;
		p1.sexo = 'm';
		
		System.out.println(p1.nome);
		System.out.println(p1.idade);
		System.out.println(p1.altura);
		System.out.println(p1.sexo);
		*/
//---------------------------------------------------------------		
		/*
		Aluno[] a1 = new Aluno[50];
		a1[0] = new Aluno();
		a1[0].notas = new double[3];
		
		a1[0].nome = "Pedro";
		a1[0].matricula = 123;
		a1[0].notas[0] = 9.8;
		
		System.out.println(a1[0].nome);
		System.out.println(a1[0].notas[0]);
		System.out.println(a1[0].matricula);
		*/
//----------------------------------------------------------------
		System.out.println("Cadastre os dados do aluno.");
		Registro [] alunos = new Registro[50];
		Scanner s = new Scanner(System.in);
		alunos[0]= new Registro();
		
		System.out.print("Informe a quantidade de alunos: ");
		int n = s.nextInt();
		
		for(int i =1; i <= n;i++) {
			alunos[0].dados();
		}
		
		for(int h= 1; h<= n; h++) {
			alunos[0].endereco();
		}
		
		for(int k= 1; k<= n; k++) {
			System.out.println(alunos[0].toString());
		}
		
		
		
}
	
}

