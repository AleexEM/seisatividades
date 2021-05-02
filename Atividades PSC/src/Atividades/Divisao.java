package Atividades;

import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {
		int dividindo;
		int divisor;
		double divisao;
		
		//Entradas
		Scanner teclado = new Scanner(System.in);
		
		
		
		System.out.println("Digite o dividindo:");
		dividindo = teclado.nextInt();
		
		
		System.out.println("Digite o divisor:");	
		divisor = teclado.nextInt();		
		
		//Processamento
		divisao = dividindo / divisor;
		
		//Saida
		
		System.out.println("A divisão é:" + divisao);
		
		teclado.close();

	}

}
