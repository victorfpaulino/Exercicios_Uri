package logica_e_algoritmos;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1079 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double media = 0;
		
		for (int i = 0; i < N; i++) {
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			double n3 = sc.nextDouble();
			
			media = ((n1 * 0.2)+(n2 * 0.3)+(n3 * 0.5))/(0.2+0.3+0.5);
			System.out.printf("%.1f%n", media);
		}
		
		
		sc.close();

	}

}
