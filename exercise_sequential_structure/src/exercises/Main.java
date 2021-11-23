package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//exerciseOne();
		System.out.println();
		exerciseTwo();
	}
	
	public static void exerciseOne() {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a lagura do terreno: ");
		double largura = sc.nextDouble();
		
		System.out.println("Digite o Comprimento do terreno: ");
		double comprimento = sc.nextDouble();
		
		System.out.println("Digite a quantidade de Metros Quadrados do terreno: ");
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento; 
		double preco = area * metroQuadrado; 
		
		System.out.println();
		System.out.printf("A Area tem exatamente %.2f Metros Quadrados %n", area);
		System.out.printf("O valor do terreno foi estimado em $ %.2f " , preco );
		
		sc.close();
		
	}
	
	//Primeiro Concluido 
	public static void exerciseTwo() {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int n1 = sc.nextInt();
		System.out.print("Digite outro número inteiro: ");
		int n2 = sc.nextInt();
		
		int soma = n1 + n2; 
		
		System.out.println("SOMA = " + soma);
		
	}

}
