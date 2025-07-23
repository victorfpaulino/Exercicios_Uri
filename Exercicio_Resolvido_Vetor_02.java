package logica_e_algoritmos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_Resolvido_Vetor_02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double [] vetor = new double[N];
		double soma = 0;
		
		for (int i=0; i<N; i++) {
			vetor[i] = sc.nextDouble();
			soma += vetor[i];
		}
		
		for (int i=0; i<N; i++) {
			System.out.print(vetor[i] + " ");
		}
		
		System.out.println();
		
		System.out.printf("%.2f\n", soma);
		System.out.printf("%.2f", soma/N);
		
		
		sc.close();

	}

}
