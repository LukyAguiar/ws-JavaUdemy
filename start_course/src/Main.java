import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;	
		//double x = 10.35784;
		
		//System.out.println(" Hello World ");	
		//System.out.println(" Good Morning ");
		//System.out.printf("%.2f %n", x);  
	    //System.out.printf("%.4f %n", x); 
		//Locale.setDefault(Locale.US);
		//System.out.printf("%.2f %n", x);
		//System.out.println("Resultado" + x + " Metros"); // Concatena��o 
		//System.out.println("Resultado = %.2f metros%n");  
		  System.out.printf("%s tem %d anos e ganha R$ %.2f reais %n", nome, idade, renda);
		  System.out.println();
		  atividadeUm();
	}
		
	public static void atividadeUm() {
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30; 
		int code = 5290;
		char gender = 'F';
		
		double price = 2100.0;
		double price2 = 650.50; 
		double measure = 53.234567; 
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f %n", product1 ,price);
		System.out.printf("%s, wich price is $ %.2f %n", product2, price2);
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender: %s %n", age, code, gender);
		System.out.println();
		System.out.printf("Measue with eight decima places: %.8f %n", measure);
		System.out.printf("Rouded (three decimal places): %.3f %n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);
		
	}
}

