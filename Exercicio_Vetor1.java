package logica_e_algoritmos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_Vetor1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		double[] vet = new double [N];

		
		//Preenchendo o vetor
		for (int i=0; i<N; i++) {
			vet[i] = sc.nextDouble();
		}
		
		double maior = 0.00;
		int posMaior = 0;
		
		for (int i=0; i<N; i++) {
			if (vet[i] > maior) {
				maior = vet[i];
				posMaior = i;
			}
		}
		
		System.out.println(maior);
		System.out.println(posMaior);
		
		sc.close();

	}

}
