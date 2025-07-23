package logica_e_algoritmos;

import java.util.Locale;
import java.util.Scanner;

public class Calculo_idade {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int idade = sc.nextInt();	
		double somaIdades = 0;
		int contador = 0;
		
		if (idade > 0) {
			while (idade > 0) {
				contador += 1;
				somaIdades += idade;
				idade = sc.nextInt();
			}
			System.out.printf("%.2f%n"
					+ "",(somaIdades/contador));
		}else {
			System.out.println("Impossivel calcular");
		}

		
			
		sc.close();
	}

}
