import java.util.Scanner;

public class Main {
	
	
	
	public static void main(String[] args) {
		
		
		entradaString();
		System.out.println();
		entradaInteiro();
		System.out.println();
		entradaDouble();
		
	}
		
	public static void entradaString() {
		
		
		String x;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite uma Palavra: ");
		x = sc.next();
		System.out.println("Voc� digitou: " + x);
		
	
	}
	
	public static void entradaInteiro() {
		
		Scanner sc = new Scanner(System.in);
		int x; 
		
		System.out.print("Digite um n�mero Inteiro: ");
		x = sc.nextInt();
		System.out.println("Voc� digitou: " + x );
		
		
	}
	
	public static void entradaDouble() {
		Scanner sc = new Scanner(System.in);
		double x;
		
		System.out.print("Digite um n�mero double: ");
		x = sc.nextDouble();
		System.out.println("Voc� digitou: " + x);
	}
}
