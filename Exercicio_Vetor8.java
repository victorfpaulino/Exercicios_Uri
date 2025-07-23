package logica_e_algoritmos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_Vetor8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		double [] alturas = new double [N];
		String [] sexos = new String[N];
		
		for (int i=0; i<N; i++) {
			alturas[i] = sc.nextDouble();
			sexos[i] = sc.next();
		}
		
		double maior = alturas[0];
		double menor = alturas[0];
		
		for (int i=0; i<N; i++) {
			if (alturas[i] > maior) {
				maior = alturas[i];
			}
			if (alturas[i] < menor) {
				menor = alturas[i];
			}
		}
		
		double somaAltF = 0.0;
		double quantF = 0.0;
		int quantM = 0;
		
		for (int i=0; i<N; i++) {
			if (sexos[i].equals("F")) {
				somaAltF += alturas[i];
				quantF++;
			}else if (sexos[i].equals("M")) {
				quantM++;
			}
		}
		
		System.out.printf("Menor altura = %s%n", menor);
		System.out.printf("Maior altura = %s%n", maior);
		System.out.printf("Maior altura das mulheres = %.2f%n" , somaAltF/quantF);
		System.out.printf("Numero de homens = %d", quantM);
		
		sc.close();

	}

}
