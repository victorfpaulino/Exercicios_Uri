package logica_e_algoritmos;

import java.util.Locale;

import java.util.Scanner;

public class Media_tres {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float N1 = sc.nextFloat();
		float N2 = sc.nextFloat();
		float N3 = sc.nextFloat();
		float N4 = sc.nextFloat();
		
		double media = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1))/(2+3+4+1);
		
		if (media >= 7) {
			System.out.printf("Media: %.1f%n", media);
			System.out.println("Aluno aprovado.");
		}else if(media < 5) {
			System.out.printf("Media: %.1f%n", media);
			System.out.println("Aluno reprovado.");
		}else if (media >= 5 && media <= 6.9) {
			System.out.printf("Media: %.1f%n", media);
			double N5 = sc.nextDouble();
			System.out.println("Aluno em exame.");
			System.out.printf("Nota do exame: %.1f%n", N5);
			double mediaFinal = (N5 + media)/2;
			if (mediaFinal >= 5) {
				System.out.println("Aluno aprovado.");
			}else if (mediaFinal <= 4.9) {
				System.out.println("Aluno reprovado.");
			}
			System.out.printf("Media final: %.1f%n", mediaFinal);
			
		}
				
		sc.close();
	}

}
