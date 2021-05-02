package Atividades;

import java.util.Scanner;

public class aritimeticasbasicas {

	public static void main(String[] args) {
		int numero1;
		int numero2;
		
		//Entradas
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Digite o Primeiro Numero:");
		numero1 = teclado.nextInt();
		
		System.out.println("Digite o segundo numero:");
		numero2 = teclado.nextInt();
		
		//saidas
		
		int soma = (numero1 + numero2);//Soma dos numeros
		System.out.println("A Soma dos dois numeros é: " + soma);
		
		int subtracao = (numero1 - numero2); //Subtração dos numeros
		System.out.println("A Subtração dos dois numeros é: " + subtracao);
		
		int multiplicacao = (numero1 * numero2); //multiplicação dos numeros
		System.out.println("A Multiplicação dos dois numeros é: " + multiplicacao);
		
		int divisao = (numero1 / numero2); //Divisao dos numeors
		System.out.println("A Divisão dos dois numeros é: " + divisao);
	}

}
