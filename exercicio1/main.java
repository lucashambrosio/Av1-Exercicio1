package br.com.prova.av1;
import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int opcao=0;
		String desAlimento = null;
		
		switch (opcao) {
		
		case 1: 
			
			System.out.println("Cadastrar Projeto Distribuir Alimentos: ");
			desAlimento = ler.next();
			
			break;
			
		case 2: 
			System.out.println("Cadastrar Projeto Trabalho Voluntario: ");
			
			break;
			
		case 3:
			
			System.out.println("Sair");
			break;
			
		
		
		}

	}

}
