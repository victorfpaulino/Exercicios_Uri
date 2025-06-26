package logica_e_algoritmos;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1154 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int idade = sc.nextInt();
		int cont = 0;
		double somaIdades = 0.0;
		
		while (idade >= 0) {
			somaIdades += idade;
			cont++;
			idade = sc.nextInt();
		}
		
		System.out.printf("%.2f%n", (somaIdades/cont));
		
		
		sc.close();
	}

}
