package logica_e_algoritmos;

import java.util.Scanner;

public class Uri_1132 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		int maior, menor = 0;
		int soma = 0;
		
		if (X > Y) {
			maior = X;
			menor = Y;
		}else {
			maior = Y;
			menor = X;
		}
		
		for (int i = menor; i <= maior; i++) {
			if (i % 13 != 0) {
				soma = soma + i;
			}
		}
		
		System.out.println(soma);
			
		sc.close();
	}

}
