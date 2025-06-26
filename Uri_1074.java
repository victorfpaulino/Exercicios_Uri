package logica_e_algoritmos;

import java.util.Scanner;

public class Uri_1074 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i=0; i<N; i++) {
			int X = sc.nextInt();
			if (X % 2 == 0) {
				if (X > 0) {
					System.out.println("EVEN POSITIVE");
				}else if (X < 0) {
					System.out.println("EVEN NEGATIVE");
				}else {
					System.out.println("NULL");
				}
			}else{
				if (X > 0) {
					System.out.println("ODD POSITIVE");
				}else if (X < 0) {
					System.out.println("ODD NEGATIVE");
				}else {
					System.out.println("NULL");
				}
			}
		}
			
		sc.close();

	}

}
