package logica_e_algoritmos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_Vetor4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double [] vetor = new double [N];
		
		// Preenchendo o vetor
		for (int i=0; i<N; i++) {
			vetor[i] = sc.nextDouble();
		}
		
		// Fazendo cálculos
		double soma = 0.0;
		
		for (int i=0; i<N; i++) {
			soma += vetor[i];
		}
		
		double media = soma/N;
		System.out.println(media);
		
		// Varrendo o vetor e mostrando quais elementos abaixo da media
		for (int i=0; i<N; i++) {
			if (vetor[i] < media) {
				System.out.println(vetor[i]);
			}
		}
		
		sc.close();

	}

}
