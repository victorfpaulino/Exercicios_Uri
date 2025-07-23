package logica_e_algoritmos;

import java.util.Locale;
import java.util.Scanner;

public class Aumento_De_Salario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();

		if (salario > 0 && salario <= 400.00) {
			double reajuste = salario * 0.15;
			salario += reajuste;
			System.out.printf("Novo salario: %.2f%n", salario);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 15 %");
		}else if (salario >= 400.01 && salario <= 800.00) {
			double reajuste = salario * 0.12;
			salario += reajuste;
			System.out.printf("Novo salario: %.2f%n", salario);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 12 %");
		}else if (salario >= 800.01 && salario <= 1200.00) {
			double reajuste = salario * 0.10;
			salario += reajuste;
			System.out.printf("Novo salario: %.2f%n", salario);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 10 %");
		}else if (salario >= 1200.01 && salario <= 2000.00) {
			double reajuste = salario * 0.07;
			salario += reajuste;
			System.out.printf("Novo salario: %.2f%n", salario);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 7 %");
		}else if (salario > 2000) {
			double reajuste = salario * 0.04;
			salario += reajuste;
			System.out.printf("Novo salario: %.2f%n", salario);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 4 %");
		}
		
		

		sc.close();
	}

}
