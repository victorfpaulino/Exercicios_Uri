package logica_e_algoritmos;

import java.util.Scanner;

public class Sorte_Simples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		sc.close();
		
		int menor = 0, meio = 0, maior = 0;

		if (n1 < n2 && n2 < n3) {
			menor = n1;
			meio = n2;
			maior = n3;
		}else if (n1 < n3 && n3 < n2) {
			menor = n1;
			meio = n3;
			maior = n2;
		}else if (n2 < n1 && n1 < n3) {
			menor = n2;
			meio = n1;
			maior = n3;
		}else if (n2 < n3 && n3 < n1) {
			menor = n2;
			meio = n3;
			maior = n1;
		}else if (n3 < n1 && n1 < n2) {
			menor = n3;
			meio = n1;
			maior = n2;
		}else if (n3 < n2 && n2 < n1) {
			menor = n3;
			meio = n2;
			maior = n1;

		}
		
		System.out.println(menor);
		System.out.println(meio);
		System.out.println(maior);
		System.out.println("");
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);

	}

}
