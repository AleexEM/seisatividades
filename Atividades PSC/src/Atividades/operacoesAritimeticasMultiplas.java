package Atividades;

import java.util.Scanner;

public class operacoesAritimeticasMultiplas {
	
	public static void main(String[] args) {
  		//Declara��o das vari�veis.
  		int V1; 
  		int V2;
  		int V3;

	  	//Entradas de dados
  		Scanner teclado = new Scanner(System.in);
  		
  		System.out.println("Digite o numero 1:");
	  	V1 = teclado.nextInt();	  	
	  	
	  	System.out.println("Digite o numero 2:");	  	
	  	V2 = teclado.nextInt();
	  	
	  	System.out.println("Digite o numero 3:");	  	
	  	V3 = teclado.nextInt();
	  		
		//Processamento
	  	System.out.println("Opera��o 1:" + (V1 + V2));
	  	System.out.println("Opera��o 2:" + (V2 - V1));
	  	System.out.println("Opera��o 3:" + (V3 * V1));
	  	System.out.println("Opera��o 4:" + (V3 + V2));
	  	System.out.println("Opera��o 5:" + (V3 - V2));
	  	System.out.println("Opera��o 6:" + (V1 + V2 + V3));

 		teclado.close();
	}

}
