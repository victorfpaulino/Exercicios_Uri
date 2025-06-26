package logica_e_algoritmos;

import java.util.Scanner;

public class Uri_1080 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int cont = 3;
		int valor = sc.nextInt();
		int maior = valor;
		int pos = 1;
		int valorNovo = 0;
		
		for (int i = 2; i <= cont; i++) {
			valorNovo = sc.nextInt();
			if (valorNovo > maior) {
				maior = valorNovo;
				pos = i;
			}
		}
		System.out.println(maior);
		System.out.println(pos);
		
		sc.close();

	}

}
