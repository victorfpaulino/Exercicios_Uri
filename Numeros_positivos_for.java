package logica_e_algoritmos;

import java.util.Locale;
import java.util.Scanner;

public class Numeros_positivos_for {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		int contadorPositivos = 0;
		
		for (int i = 0; i < 6; i++) {
			double valor = sc.nextDouble();
			if (valor > 0) {
				contadorPositivos++;
			}
		}
		
		System.out.println(contadorPositivos+" valores positivos");
		sc.close();

	}

}
