package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//exerciseOne();
		//exerciseTwo();
		//exerciceTre();
		//exerciceFor();
	}
	
	public static void exerciseTest() {
		
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
	
	
	//Segundo Concluido 
	public static void exerciseOne() {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int n1 = sc.nextInt();
		System.out.print("Digite outro número inteiro: ");
		int n2 = sc.nextInt();
		
		int soma = n1 + n2; 
		
		System.out.println("SOMA = " + soma);
		
		sc.close();
	}
	
	
	public static void exerciseTwo() {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double tt = 3.14159;
		
		System.out.print("digite o valor do raio: ");
		double raio = sc.nextDouble();
		
		double area = tt * Math.pow(raio,2.0);
		
		System.out.printf("A = %.4f ",area);
		
		sc.close();
	}
	
	
	public static void exerciceTre() {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor inteiro para A: ");
		int A = sc.nextInt();
		System.out.print("Digite um valor inteiro para B: ");
		int B = sc.nextInt();
		System.out.print("Digite um valor inteiro para C: ");
		int C = sc.nextInt();
		System.out.println("Digite um valor inteiro para D: ");
		int D = sc.nextInt();
		
		int result = (A * B - C * D );
		
		System.out.println("Diferença = " + result);
	}
	
	
	public static void exerciceFor() {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número do Funcionario: ");
		int codFunc = sc.nextInt(); 
		System.out.print("Digite o número de horas trabalhadas: ");
		double horasTrab = sc.nextDouble();
		System.out.print("Digite o Valor das horas trabalhadas: ");
		double valorHorasTrab = sc.nextDouble();
		
		double salario = horasTrab * valorHorasTrab;
		
		System.out.printf("NUMBER = %d %n",codFunc);
		System.out.printf("SALARY = %.2f", salario);
	}

}
