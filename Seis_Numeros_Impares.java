package logica_e_algoritmos;

import java.util.Scanner;

public class Seis_Numeros_Impares {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt();
		
		int primeiroImpar = (x % 2 ==0) ? x + 1: x;
		
		for (int i = 0; i < 6; i++) {
			System.out.println(primeiroImpar + 2 * i);
		}
		
		sc.close();
		
		

	}

}
