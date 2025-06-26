package logica_e_algoritmos;

import java.util.Scanner;

public class Uri_1071 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int min, max;
		
		if (num1 < num2) {
			min = num1;
			max = num2;
		} else {
			min = num2;
			max = num1;
		}
		
		int soma = 0;
		for (int i = min+1; i < max; i++) {
			if (i % 2 != 0) {
				soma = soma + i;
			}
		}
		
		System.out.println(soma);
			
		sc.close();

	}

}
