package logica_e_algoritmos;

import java.util.Scanner;

public class Uri_1146 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int contador = 1;
		
		do {
			for (int i = 0; i < X; i++) {
				if (contador == X) {
					System.out.println(X);
				}else {
					System.out.printf("%d ", contador);
				}
				contador++;
			}
			
			X = sc.nextInt();
			contador = 1;
		}while (X !=0);
		
		
		sc.close();

	}

}
