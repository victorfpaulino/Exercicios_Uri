package logica_e_algoritmos;

import java.util.Scanner;

public class Uri_1143 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int numeroAtual = 1;
		
		for (int i = 0; i < N; i++) {
			System.out.printf("%d %d %d\n", numeroAtual, numeroAtual*numeroAtual, numeroAtual*numeroAtual*numeroAtual);
			numeroAtual++;
		}
				
		sc.close();

	}

}
