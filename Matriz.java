package logica_e_algoritmos;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int[][] matriz = new int[M][N];
		
		for (int i=0; i<M; i++) {
			for (int j=0; j<N; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		for (int i=0; i<M; i++) {
			for (int j=0; j<N; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
