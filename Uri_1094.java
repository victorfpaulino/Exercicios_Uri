package logica_e_algoritmos;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1094 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char letra = ' ';
		int soma = 0, somaC = 0, somaS = 0, somaR = 0, quant = 0;
		
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			quant = sc.nextInt();
			letra = sc.next().charAt(0);
			soma = soma + quant;
			
			if (letra == 'C') {
				somaC += quant;
			}else if (letra == 'S') {
				somaS += quant;
			}else if (letra == 'R') {
				somaR += quant;
			}
			
		}
		
		double percentualC = ((double)somaC/(double)soma)*100;
		double percentualR = ((double)somaR/(double)soma)*100;
		double percentualS = ((double)somaS/(double)soma)*100;
		
		System.out.printf("Total: %d cobaias\n", soma);
		System.out.printf("Total de coelhos: %d\n", somaC);
		System.out.printf("Total de ratos: %d\n", somaR);
		System.out.printf("Total de sapos: %d\n", somaS);
		System.out.printf("Percentual de coelhos: %.2f %%\n", percentualC);
		System.out.printf("Percentual de ratos: %.2f %%\n", percentualR);
		System.out.printf("Percentual de sapos: %.2f %%\n", percentualS);
		
		sc.close();

	}

}
