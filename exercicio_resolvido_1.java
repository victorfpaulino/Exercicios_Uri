package logica_e_algoritmos;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_resolvido_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nota 1:");
		double nota1 = sc.nextDouble();
		System.out.println("Nota 2:");
		double nota2 = sc.nextDouble();
		double notaFinal = nota1 + nota2;
		
		System.out.printf("NOTA FINAL: %.1f%n", notaFinal);
		if (notaFinal < 60.0) {
			System.out.println("REPROVADO!");
		}
		
		sc.close();
	}

}
