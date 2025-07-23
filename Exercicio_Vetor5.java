package logica_e_algoritmos;

import java.util.Scanner;

public class Exercicio_Vetor5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int [] vetor = new int [N];
		
		
		// Preenchendo o VETOR
		for (int i=0; i<N; i++) {
			vetor[i] = sc.nextInt();
		}
		
		// Percorrendo o vetor e calculando
		int quantPar = 0;
		int somaPar = 0;
		
		for (int i=0; i<N; i++) {
			if (vetor[i] % 2 == 0) {
				quantPar++;
				somaPar+= vetor[i];
			}
		}
		
		System.out.println(somaPar/quantPar);
		
		sc.close();

	}

}
