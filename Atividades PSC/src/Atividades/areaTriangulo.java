package Atividades;

import java.util.Scanner;

public class areaTriangulo {

	public static void main(String[] args) {
		//Declaracao da Variaveis
		int base;
		int altura;
		int area;
		
		//Entradas de dados
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("base:");
		base = teclado.nextInt();
		
		System.out.println("Altura:");
		altura = teclado.nextInt();
		
		area = base * altura / 2;
			
	  	//Processamento e Saída
 		System.out.println("Area:" + area);
		
		teclado.close();
		
	}

}
