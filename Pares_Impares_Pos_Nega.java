package logica_e_algoritmos;

import java.util.Scanner;

public class Pares_Impares_Pos_Nega {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int contadorPositivos = 0;
		int contadorNegativos = 0;
		int contadorPares = 0;
		int contadorImpares = 0;
		
		for (int i = 0; i < 5; i++) {
			int valor = sc.nextInt();
			if (valor % 2 == 0) {
				contadorPares++;
			}else {
				contadorImpares++;
			}
			if (valor > 0) {
				contadorPositivos++;
			}else if (valor < 0){
				contadorNegativos++;
			}
		}
		
		System.out.println(contadorPares + " valor(es) par(es)");
		System.out.println(contadorImpares + " valor(es) impar(es)");
		System.out.println(contadorPositivos + " valor(es) positivo(s)");
		System.out.println(contadorNegativos + " valor(es) negativo(s)");
		
		sc.close();

	}

}
