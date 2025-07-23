package logica_e_algoritmos;

import java.util.Scanner;

public class Exercicio_Vetor2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int [] vetor = new int [N];
		
		// Preenchendo o vetor
		for (int i=0; i<N; i++) {
			vetor[i] = sc.nextInt();
		}
		
		int contadorPar = 0;
		
		for (int num : vetor) {
			if (num % 2 == 0) {
				System.out.print(num + " ");
				contadorPar++;
			}
		}
		System.out.println();
		System.out.println(contadorPar);		
		
		sc.close();

	}

}
