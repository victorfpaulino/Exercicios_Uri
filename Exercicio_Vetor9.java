package logica_e_algoritmos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_Vetor9 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String [] produtos = new String[N];
		double [] precoCompra = new double[N];
		double [] precoVenda = new double [N];
		
		for (int i=0; i<N; i++) {
			produtos[i] = sc.next();
			precoCompra[i] = sc.nextDouble();
			precoVenda[i] = sc.nextDouble();
		}
		
		double [] lucro = new double[N];
		
		for (int i=0; i<N; i++) {
			lucro[i] = (precoVenda[i] - precoCompra[i])/precoCompra[i] * 100;
		}
		
		int quantLucroAbaixo = 0;
		int quantLucroEntre = 0;
		int quantLucroAcima = 0;
		
		for (int i=0; i<N; i++) {
			if (lucro[i] < 10) {
				quantLucroAbaixo++;
			}else if (lucro[i] >= 10 && lucro[i] < 20) {
				quantLucroEntre++;
			}else if (lucro[i] > 20) {
				quantLucroAcima++;
			}
		}
		
		double somaCompra = 0.0;
		double somaVenda = 0.0;
		double lucroTotal = 0.0;
		
		for (int i = 0; i<N; i++) {
			somaCompra += precoCompra[i];
			somaVenda += precoVenda[i];
		}
		
		lucroTotal = somaVenda - somaCompra;
		
		System.out.printf("Lucro abaixo de 10%%: %d%n", quantLucroAbaixo);
		System.out.printf("Lucro entre de 10%% e 20%%: %d%n", quantLucroEntre);
		System.out.printf("Lucro acima de 20%%: %d%n", quantLucroAcima);
		System.out.printf("Valor total de compra: %.2f%n", somaCompra);
		System.out.printf("Valor total de venda: %.2f%n", somaVenda);
		System.out.printf("Lucro total: %.2f%n", lucroTotal);
		
		sc.close();

	}

}
