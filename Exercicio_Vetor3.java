package logica_e_algoritmos;

import java.util.Scanner;

public class Exercicio_Vetor3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int [] A = new int [N];
		int [] B = new int [N];
		int [] C = new int [N];
		
		// Preenchendo o vetor
		for (int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		
		for (int i=0; i<N; i++) {
			B[i] = sc.nextInt();
		}
		
		for (int i=0; i<N; i++) {
			C[i] = A[i] + B[i];
		}
		
		// Imprimindo o vetor
		for (int num : C) {
			System.out.print(num + " ");
		}
		
		sc.close();

	}

}
