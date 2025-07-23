package logica_e_algoritmos;

import java.util.Locale;
import java.util.Scanner;

public class Tipos_De_Triangulos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		
		// ORDENANDO
		if (A < B) {
			double A2 = A;
			A = B;
			B = A2;
		}
		if (A < C) {
			double A3 = A;
			A = C;
			C = A3;
		}
		if (B < C) {
			double B2 = B;
			B = C;
			C = B2;
		}
		
		if (A >= B + C) {
			System.out.println("NAO FORMA TRIANGULO");
		}else if ((A*A) == (B*B + C*C)){
			System.out.println("TRIANGULO RETANGULO");
		}else if ((A*A) > (B*B + C*C)) {
			System.out.println("TRIANGULO OBTUSANGULO");
		}else if ((A*A) < (B*B + C*C)) {
			System.out.println("TRIANGULO ACUTANGULO");
		}
		if (A == B && B == C) {
			System.out.println("TRIANGULO EQUILATERO");
		}else if(A == B || A == C || B == C) {
			System.out.println("TRIANGULO ISOSCELES");
		}
			
		sc.close();
	}

}
