package Atividades;

import java.time.LocalDateTime;
import java.util.Scanner;

public class idade {

	public static void main(String[] args) {
  		//Declara��o das vari�veis.
  		int anoNascimento; 
  		int anoAtual;
  		
	  	//Entradas de dados
  		Scanner teclado = new Scanner(System.in);
  		
  		System.out.println("Digite o Ano do Seu Nascimento:");
  		anoNascimento = teclado.nextInt();
  		
  		LocalDateTime data1 = LocalDateTime.now();
  		anoAtual = data1.getYear();
  		
	  	//Processamento e Sa�da
 		System.out.println("Sua idade �: " + (anoAtual-anoNascimento) + " Anos");
 		
 		teclado.close();
	}	

}
