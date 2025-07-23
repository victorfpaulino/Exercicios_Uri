package logica_e_algoritmos;

import java.util.Scanner;

public class Tipo_Combustivel {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int combust = sc.nextInt();
		int contAlcool = 0, contGasolina = 0, contDiesel = 0;
		
		
		while (combust != 4) {
			//fazer a contagem dos combustíveis
			if (combust == 1) {
				contAlcool++;
			}else if (combust == 2) {
				contGasolina++;
			}else if (combust == 3) {
				contDiesel++;
			}
			combust = sc.nextInt();
		}
		
		// imprimir resumo apos a entrada do nº 4
		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d\n", contAlcool);
		System.out.printf("Gasolina: %d\n", contGasolina);
		System.out.printf("Diesel: %d\n", contDiesel);
		
		
		sc.close();
	}

}
