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
		System.out.println("A Soma dos dois numeros �: " + soma);
		
		int subtracao = (numero1 - numero2); //Subtra��o dos numeros
		System.out.println("A Subtra��o dos dois numeros �: " + subtracao);
		
		int multiplicacao = (numero1 * numero2); //multiplica��o dos numeros
		System.out.println("A Multiplica��o dos dois numeros �: " + multiplicacao);
		
		int divisao = (numero1 / numero2); //Divisao dos numeors
		System.out.println("A Divis�o dos dois numeros �: " + divisao);
	}

}
