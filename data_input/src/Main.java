import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		
		//entradaString();
		//System.out.println();
		
		//entradaInteiro();
		//System.out.println();
		
		//entradaDouble();
		//System.out.println();
		
		//entradaChar();
		//System.out.println();
		
		//variasEntradas();
		
		 entradaLinhas();
	}
	
	//Entrada de Letras|Palavras
	public static void entradaString() {
		
		
		String x;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite uma Palavra: ");
		x = sc.next();
		System.out.println("Você digitou: " + x);
		
	
	}
	
	//Entrada de Inteiro
	public static void entradaInteiro() {
		
		Scanner sc = new Scanner(System.in);
		int x; 
		
		System.out.print("Digite um número Inteiro: ");
		x = sc.nextInt();
		System.out.println("Você digitou: " + x );
		
		
	}
	
	//Entrada de Double
	public static void entradaDouble() {
		Scanner sc = new Scanner(System.in);
		double x;
		
		System.out.print("Digite um número double: ");
		x = sc.nextDouble();
		System.out.println("Você digitou: " + x);
	}
	
	//Entrada de Char
	public static void entradaChar() {
		
		Scanner sc = new Scanner(System.in);
		char x; 
		
		System.out.print("Digite um caractere: ");
		x = sc.next().charAt(0);
		System.out.println("Você digitou:" + x );
	}
	
	//Exemplo Varias entradas de Teste
	public static void variasEntradas() {
		
		Scanner sc = new Scanner(System.in);
		int x; 
		String y; 
		char z;
		double c;
		
		System.out.print("Digite um número Inteiro: ");
		x = sc.nextInt();
		
		System.out.print("Digite um número flutuante: ");
		c = sc.nextDouble();
		
		System.out.print("Digite uma Palavra: ");
		y = sc.next();
		
		System.out.print("Digite um caractere:");
		z = sc.next().charAt(0);
		
		System.out.printf("O valores colocados nas variaveis são x: %d - c: %.2f - y: %s -  z: %s", x,c,y,z);
		
	}
	
	public static void entradaLinhas() {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		sc.nextLine(); //Limpando Buffer
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados Digitados: ");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
				
	}
	
}
