package logica_e_algoritmos;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1116 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double divisao = 0;
		
		for (int i = 0; i < N; i++) {
			int  X = sc.nextInt();
			int Y = sc.nextInt();
			
			if (Y == 0) {
				System.out.println("divisao impossivel");
			}else {	
				divisao = (double) X/Y;
				System.out.printf("%.1f%n",divisao);
			}		
		}			
		sc.close();
	}

}
