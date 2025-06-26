package logica_e_algoritmos;

import java.util.Scanner;

public class Uri_1158 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 0; i < N;i++) {
			int X = sc.nextInt();
			int Y = sc.nextInt();
			int soma = 0;
			
			// Verificando se o "X" é impar se não for, vai ser transformado
			if (X % 2 == 0) {
				X += 1;
			}else {
				X = X;
			}
			
			for (int cont = 0; cont < Y; cont++) {
				soma = soma + X;
				X = X + 2;
			}
			
			System.out.println(soma);
			
		}
		
		
		sc.close();

	}

}
