package logica_e_algoritmos;

import java.util.Scanner;

public class Soma_Pares_Consecutivos {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int X = sc.nextInt();
		int soma = 0;
		
		while (X != 0) {
			if (X % 2 == 0) {
				int cont1 = 0;
				while (cont1 < 5) {
					soma += X;
					X = X + 2;
					cont1++;
				}
			}else {
				X = X +1;
				int cont2 = 0;
				while (cont2 < 5) {
					soma += X;
					X = X + 2;
					cont2++;
				}
			}
			System.out.println(soma);
			X = sc.nextInt();
			soma = 0;
		}
				
		sc.close();

	}

}
