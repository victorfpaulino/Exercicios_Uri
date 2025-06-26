package logica_e_algoritmos;

import java.util.Scanner;

public class Uri_1153 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int fatorial = 1;
		
		for (int i = N; i != 1; i--) {
			fatorial = fatorial * i;
		}
		System.out.println(fatorial);
		
		sc.close();

	}

}
