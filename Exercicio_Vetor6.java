package logica_e_algoritmos;

import java.util.Scanner;

public class Exercicio_Vetor6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String [] nomes = new String[N];
		int [] idades = new int [N];
		
		for (int i=0; i<N; i++) {
			nomes[i] = sc.next();
			idades[i] = sc.nextInt();
		}
		
		int maisVelho = 0;
		int posMaisVelho = 0;
		
		for (int i=0; i<N; i++) {
			if (idades[i] > maisVelho) {
				maisVelho = idades[i];
				posMaisVelho = i;
			}
		}
		
		System.out.printf("Pessoa mais velha: %s", nomes[posMaisVelho]);
		
		sc.close();

	}

}
