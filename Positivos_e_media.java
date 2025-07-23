package logica_e_algoritmos;

import java.util.Locale;
import java.util.Scanner;

public class Positivos_e_media {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int contadorPositivos = 0;
		double soma = 0;
		for (int i = 0; i < 6; i++) {
			double valor = sc.nextDouble();
			if (valor > 0) {
				contadorPositivos++;
				soma += valor;
			}
		}
		double media = soma/contadorPositivos;
		
		System.out.println(contadorPositivos+ " valores positivos");
		System.out.printf("%.1f%n", media);
		
		sc.close();
	}

}
