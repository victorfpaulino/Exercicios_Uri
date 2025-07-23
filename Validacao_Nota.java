package logica_e_algoritmos;

import java.util.Locale;
import java.util.Scanner;

public class Validacao_Nota {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double nota1 = 0, nota2 = 0;
		int notasValidas = 0;
		
		while (notasValidas < 2) {
			double nota = sc.nextDouble();
			
			if (nota >= 0 && nota <= 10) {
				if (notasValidas == 0) {
					nota1 = nota;
				} else {
					nota2 = nota;
				}
				notasValidas++;
			}else {
				System.out.println("nota invalida");
			}
		}
		
		double media = (nota1+ nota2) / 2;
		System.out.printf("media = %.2f\n", media);
				
		sc.close();
	}

}
