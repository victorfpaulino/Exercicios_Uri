package logica_e_algoritmos;

import java.util.Scanner;

public class Ddd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		sc.close();
		
		switch(id) {
		case 61:
			System.out.println("Brasilia");
			break;
		case 71:
			System.out.println("Salvador");
			break;
		case 11:
			System.out.println("Sao Paulo");
			break;
		case 21:
			System.out.println("Rio de Janeiro");
			break;
		case 32:
			System.out.println("Juiz de Fora");
			break;
		case 19:
			System.out.println("Campinas");
			break;
		case 27:
			System.out.println("Vitoria");
			break;
		case 31:
			System.out.println("Belo Horizonte");
			break;
		default:
			System.out.println("DDD nao cadastrado");

		}

	}

}
