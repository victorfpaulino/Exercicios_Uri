package logica_e_algoritmos;

import java.util.Locale;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		// Declaração
		double [] A;
		
		//Instanciação
		A = new double[N];
		
		// declaração e instanciação no mesma linha double []A = new double [N];
		
		
		//Preenchendo o vetor
		for (int i=0; i<N;i++) {
			A[i] = sc.nextDouble();
		}
		
		//Printando o vetor
		for (int i=0; i<N; i++){
			System.out.printf("%.2f%n", A[i]);
		}
		
		sc.close();

	}

}
