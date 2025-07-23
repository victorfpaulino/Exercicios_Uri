package logica_e_algoritmos;

import java.util.Locale;
import java.util.Scanner;

public class Imposto_De_Renda {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double salario = sc.nextDouble();
		double imposto = 0.0;
		
        if (salario <= 2000.00) {
            System.out.println("Isento");
        } else {
            // Calcula o imposto por faixas
            double faixa1 = 0.0;
            double faixa2 = 0.0;
            double faixa3 = 0.0;
            
            // Primeira faixa (8% sobre R$ 2000.01 até R$ 3000.00)
            if (salario > 2000.00) {
                if (salario <= 3000.00) {
                    faixa1 = salario - 2000.00;
                } else {
                    faixa1 = 1000.00;
                }
            }
            
            // Segunda faixa (18% sobre R$ 3000.01 até R$ 4500.00)
            if (salario > 3000.00) {
                if (salario <= 4500.00) {
                    faixa2 = salario - 3000.00;
                } else {
                    faixa2 = 1500.00;
                }
            }
            
            // Terceira faixa (28% sobre acima de R$ 4500.00)
            if (salario > 4500.00) {
                faixa3 = salario - 4500.00;
            }
            
            imposto = (faixa1 * 0.08) + (faixa2 * 0.18) + (faixa3 * 0.28);
            
            System.out.printf("R$ %.2f%n", imposto);
        }

		sc.close();
	}

}
