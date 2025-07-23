package logica_e_algoritmos;

import java.util.Locale;
import java.util.Scanner;

public class extra_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int quantMinutos = sc.nextInt();
		double conta = 50.00;
	
		if (quantMinutos > 100) {
			conta += (quantMinutos - 100) * 2.0;
		}
		
		System.out.printf("Valor da conta = R$%.2f%n", conta);
		
		sc.close();
	}

}
