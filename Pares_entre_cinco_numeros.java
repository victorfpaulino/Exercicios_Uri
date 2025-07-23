package logica_e_algoritmos;

import java.util.Scanner;

public class Pares_entre_cinco_numeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contadorPares = 0;
		for (int i = 0; i < 5; i++) {
			int valor = sc.nextInt();
			if (valor % 2 == 0) {
				contadorPares++;
			}
		}
		System.out.println(contadorPares + " valores pares");
		
		sc.close();

	}

}
