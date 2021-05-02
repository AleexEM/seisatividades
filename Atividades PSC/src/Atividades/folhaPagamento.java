package Atividades;

import java.util.Scanner;

public class folhaPagamento {

	public static void main(String[] args) {
  		//Declara��o das vari�veis.
		
		//1- o nome do funcion�rio;
		//2- o n�mero de horas trabalhadas por este funcion�rio;
		//3- e o n�mero de dependentes deste funcion�rio.		

		final double VALOR_HORA = 32.00;
		
  		String nome; 
  		int numeroHoras;
  		int dependentes;
  		
	  	//Entradas de dados
  		Scanner teclado = new Scanner(System.in);
  		
  		System.out.println("Nome:");
  		nome = teclado.next();

  		System.out.println("Horas:");
  		numeroHoras = teclado.nextInt();
  		
  		System.out.println("Dependentes:");
  		dependentes = teclado.nextInt();  
  		
  		/*
  			Considerando que:
A. A empresa paga fixo R$32.00 por hora;
B. A empresa paga fixo R$40.00 por dependente;
C. Sobre o sal�rio bruto s�o feitos descontos fixos de 8.5% para o INSS
D. Sobre o sal�rio bruto s�o feitos descontos fixos de 5% para o IR;


Fa�a um algoritmo que leia os dados da ficha do funcion�rio, calcule:
1- O sal�rio bruto (hora * valorhora + dependente * valordependente)
2- Valor do desconto de INSS (percentual sobre o salario bruto);
3- Valor de desconto de IR (percentual sobre o salario bruto);
4- Valor liquido do sal�rio deste funcion�rio (Salario Bruto - INSS - IR).
  		*/
  	    double salarioBruto   = numeroHoras * 32 + dependentes * 40;
  	    double valorINSS      = salarioBruto * 8.5 / 100;
  	    double valorIR        = salarioBruto * 5 / 100;
  	    double salarioLiquido = salarioBruto - valorINSS - valorIR;  	
  	    
	  	//Sa�da
  	    System.out.println("Nome:" + nome);
 		System.out.println("Bruto:" + salarioBruto);
 		System.out.println("INSS:" + valorINSS);
 		System.out.println("IR:" + valorIR);
 		System.out.println("Liquido:" + salarioLiquido);
 		
  		teclado.close();
	}


}
