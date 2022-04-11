package Aplicacao;

import java.util.Scanner;

import Entidades.Alunos;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			Alunos aluno = new Alunos();
			
			System.out.print("Entre com o nome do aluno: ");
			aluno.nome = sc.nextLine();
			
			System.out.print("\nEntre com a primeira nota de " + aluno.nome + ": ");
			aluno.nota1 = sc.nextDouble();
			
			System.out.print("Entre com a segunda nota de " + aluno.nome + ": ");
			aluno.nota2 = sc.nextDouble();
			
			System.out.print("Entre com a terceira nota de " + aluno.nome + ": ");
			aluno.nota3 = sc.nextDouble();

			System.out.printf("\nNota Final de " + aluno.nome +" : %.2f%n", aluno.notaFinal());
			
			if(aluno.notaFinal() < 60) {
				System.out.println("REPROVADO");
				System.out.printf("Faltando %.2f", aluno.pontosFaltando());
			}
			else {
				System.out.println("Aprovado");
			}
			
			
			sc.close();
	}
}
