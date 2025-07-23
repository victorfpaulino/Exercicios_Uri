package logica_e_algoritmos;

import java.util.Locale;
import java.util.Scanner;

public class Numeros_positivos_ifs {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double v1 = sc.nextDouble();
		double v2 = sc.nextDouble();
		double v3 = sc.nextDouble();
		double v4 = sc.nextDouble();
		double v5 = sc.nextDouble();
		double v6 = sc.nextDouble();
		sc.close();
		
		int cont = 0;
		
		if (v1 > 0) {
			cont += 1;
		}
		if (v2 > 0) {
			cont += 1;
		}
		if (v3 > 0) {
			cont += 1;
		}
		if (v4 > 0) {
			cont += 1;
		}
		if (v5 > 0) {
			cont += 1;
		}
		if (v6 > 0) {
			cont += 1;
		}
		System.out.println(cont+" valores positivos");
		
		
	}

}
