package logica_e_algoritmos;

import java.util.Scanner;

public class Uri_1144 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int numeroAtual = 1;
		
		if (N > 1 && N < 1000) {
			for (int i = 0; i < (N * 2)/2; i++) {
				System.out.printf("%d %d %d\n", numeroAtual, numeroAtual*numeroAtual, numeroAtual*numeroAtual*numeroAtual);
				System.out.printf("%d %d %d\n", numeroAtual, (numeroAtual*numeroAtual)+1, (numeroAtual*numeroAtual*numeroAtual)+1);
				numeroAtual++;
			}
		}
		
		sc.close();

	}

}
