package logica_e_algoritmos;

import java.util.Scanner;

public class Animal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String texto1 = sc.next();
		String texto2 = sc.next();
		String texto3 = sc.next();
		
		if (texto1.equals("vertebrado")) {
			if (texto2.equals("ave")) {
				if (texto3.equals("carnivoro")) {
					System.out.println("aguia");
				}else if (texto3.equals("onivoro")) {
					System.out.println("pomba");
				}
			}else if (texto2.equals("mamifero")) {
				if (texto3.equals("onivoro")) {
					System.out.println("homem");
				}else if (texto3.equals("herbivoro")) {
					System.out.println("vaca");
				}
			}
		}else if (texto1.equals("invertebrado")) {
			if (texto2.equals("inseto")) {
				if (texto3.equals("hematofago")) {
					System.out.println("pulga");
				}else if(texto3.equals("herbivoro")) {
					System.out.println("lagarta");
				}
			}else if(texto2.equals("anelideo")) {
				if (texto3.equals("hematofago")) {
					System.out.println("sanguessuga");
				}else if (texto3.equals("onivoro")) {
					System.out.println("minhoca");
				}
			}
		}
			
		sc.close();
	}

}
