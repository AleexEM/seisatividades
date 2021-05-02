package Atividades;

import java.util.Scanner;

public class valorAcrescido {

	public static void main(String[] args) {
		//Declaracao da Variaveis
		double valor;
		double valorNovo;
		
		//Entradas de dados
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor:");
		valor = teclado.nextDouble();
		
		valorNovo = valor + (valor * (15.8/100));
		
		//Caso de teste 1486,45 deve gerar como resultado 1721,3091.
		
		//Processamento e Saida
		System.out.println("Valor Novo:" + valorNovo);
		
		teclado.close();
		
	}

}
