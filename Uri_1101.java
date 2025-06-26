package logica_e_algoritmos;

import java.util.Scanner;

public class Uri_1101 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int M = sc.nextInt();
			int N = sc.nextInt();
			
			if (M <= 0 || N <= 0) {
				break;
			}
			
			int menor, maior;
			
			if (M < N) {
				menor = M;
				maior = N;
			}else {
				menor = N;
				maior = M;
			}
			
			int soma = 0;
			for (int i = menor; i <= maior; i++) {
				System.out.print(i + " ");
				soma += i;
			}
			
			System.out.println("Sum=" + soma);	
		}
					
		sc.close();

	}

}
