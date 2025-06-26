package logica_e_algoritmos;

import java.util.Scanner;

public class Uri_1131 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int contador = 0;
		int contVitInter = 0;
		int contVitGremio = 0;
		int contEmpates = 0;
		int golInter = sc.nextInt();
		int golGremio = sc.nextInt();
		contador ++;
		if (golInter > golGremio) {
			contVitInter++;
		}else if (golGremio > golInter) {
			contVitGremio++;
		}else if (golGremio == golInter) {
			contEmpates++;
		}
		
		
		System.out.println("Novo Grenal (1-sim 2-nao)");
		int resposta = sc.nextInt();
		
		while (resposta == 1) {
			golInter = sc.nextInt();
			golGremio = sc.nextInt();
			contador++;
			if (golInter > golGremio) {
				contVitInter++;
			}else if (golGremio > golInter) {
				contVitGremio++;
			}else if (golGremio == golInter) {
				contEmpates++;
			}
			System.out.println("Novo Grenal (1-sim 2-nao)");
			resposta = sc.nextInt();
		}
		
		System.out.println(contador + " grenais");
		System.out.println("Inter:" + contVitInter);
		System.out.println("Gremio:"+ contVitGremio);
		System.out.println("Empates:"+ contEmpates);
		if (contVitGremio > contVitInter) {
			System.out.println("Gremio venceu mais");
		}else if (contVitInter > contVitGremio) {
			System.out.println("Inter venceu mais");
		}else if (contVitInter == contVitGremio) {
			System.out.println("Nao houve vencedor");
		}
		
		sc.close();

	}

}
