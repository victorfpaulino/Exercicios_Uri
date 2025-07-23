package logica_e_algoritmos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_Matriz6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double[][] mat = new double [N][N];
		
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}
		
		double somaPos = 0.0;
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				if (mat[i][j] > 0) {
					somaPos+= mat[i][j];
				}
			}
		}
		System.out.printf("SOMA DOS POSITIVOS: %.2f%n", somaPos );
		
		int indiceLinha = sc.nextInt();
		System.out.print("LINHA ESCOLHIDA: ");
		for (int i=0; i<N; i++) {
			if (i == indiceLinha) {
				for (int j=0; j<N; j++) {
					System.out.print(mat[indiceLinha][j] + " ");
				}
			}
		}
		System.out.println();
		
		int indiceColuna = sc.nextInt();
		System.out.print("COLUNA ESCOLHIDA: ");
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				if (j == indiceColuna) {
					System.out.print(mat[i][indiceColuna]+ " ");
				}
			}
		}
		System.out.println();
		
		System.out.print("DIAGONAL PRINCIPAL: ");
		for (int i=0; i<N;i++) {
			System.out.print(mat[i][i]+ " ");
		}
		System.out.println();
		
		System.out.println("MATRIZ ALTERADA:");
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				if (mat[i][j] < 0) {
					mat[i][j] = mat[i][j] * mat[i][j];
				}
			}
		}
		
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		sc.close();

	}

}
