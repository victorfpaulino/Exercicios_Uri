package logica_e_algoritmos;

import java.util.Scanner;

public class Uri_1142 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int numeroAtual = 1;
		
		for (int i = 0; i < N; i++) {
			System.out.printf("%d %d %d PUM\n", numeroAtual, numeroAtual+1, numeroAtual+2);
			numeroAtual = numeroAtual + 4;
		}
		
		
		
		sc.close();

	}

}
