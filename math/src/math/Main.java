package math;

public class Main {
	
	
	public static void main(String[] args){		
		
		raizquadrada();
		potencia();
		absoluto();
		bhaskara();
	}
	
	
	public static void raizquadrada(){
		
		double x = 3.0;
		double y = 4.0; 
		double A, B, C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25" + " = " + C);
		System.out.println();		
	}
	
	public static void potencia() {
		
		double x = 3.0;
		double y = 4.0; 
		double A, B, C;
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		System.out.println();
		
	}
	
	public static void absoluto() {

		double y = 4.0; 
		double z = -5.0;
		double A, B;
		
		A = Math.abs(y); 
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
		System.out.println();
	}
	
	public static void bhaskara() {
		
		 double delta; 
		 double x1,x2 ;
		 double a = 3, b = -15, c = 12;
		 
		 delta = Math.pow(b, 2.0) - 4* a * c ;
		 
		 System.out.println("Valor de Delta é " + delta);
		 
		 x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		 System.out.println("X1 = " + x1);
		 x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
		 System.out.println("X2 = " + x2);
		
		
	}
}
