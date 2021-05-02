package Atividades;
import java.util.Scanner;

public class Multiplicacao {

	public static void main(String[] args) {
			int Multiplicando;
			int Multiplicador;
			double Multiplicacao;
			
			//Entradas
			Scanner teclado = new Scanner(System.in);
			
			
			
			System.out.println("Digite o Multiplicando:");
			Multiplicando = teclado.nextInt();
			
			
			System.out.println("Digite o Multiplicador:");	
			Multiplicador = teclado.nextInt();		
			
			//Processamento
			Multiplicacao = Multiplicando * Multiplicador;
			
			//Saida
			
			System.out.println("A Multiplicacao é:" + Multiplicacao);
			
			teclado.close();


	}

}
