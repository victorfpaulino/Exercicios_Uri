package logica_e_algoritmos;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_resolvido_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		double a = sc.nextDouble();
		System.out.println("Digite o valor de B: ");
		double b = sc.nextDouble();
		System.out.println("Digite o valor de C: ");
		double c = sc.nextDouble();
		
		double delta = (b*b) - 4*a*c;
		//System.out.println(delta);
		
		if (a == 0 || delta < 0) {
			System.out.println("Impossível calcular");
		}else {
			double r1 = (-(b)+Math.sqrt(delta))/(2*a);
			double r2 = (-(b)-Math.sqrt(delta))/(2*a);
			System.out.printf("R1 = %.5f%n", r1);
			System.out.printf("R1 = %.5f%n", r2);
		}
				
		sc.close();
	
	}

}
