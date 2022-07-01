package obj;

import java.util.Locale;
import java.util.Scanner;

public class cambio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	
		double dolar = dola.dolar;
		System.out.printf("What is the dollar price? %.2f%n", dolar);
		System.out.print("How many dollars will be bought? ");
		double din = sc.nextDouble();
		double result = dola.currencyConverter(din);
		System.out.printf("Amount to be paid in Reais =  %.2f ",  result); 
		
		sc.close();

	}

}
