package logica_e_algoritmos;

import java.util.Scanner;

public class Para {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int soma = 0;
		
		for (int i = 0; i < N; i++) {
			int num = sc.nextInt();
			soma = soma + num;
		}
		System.out.println(soma);
		
		
		sc.close();

	}

}
