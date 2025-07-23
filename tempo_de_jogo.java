package logica_e_algoritmos;

import java.util.Scanner;

public class tempo_de_jogo {

	public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			
			int horaInicial = sc.nextInt();
			int horaFinal = sc.nextInt();
			int tempoDeJogo = 0;
			
			if (horaInicial < horaFinal) {
				tempoDeJogo = horaFinal - horaInicial;
			}else if (horaInicial > horaFinal){
				tempoDeJogo = 24 - horaInicial + horaFinal;
			}else {
				tempoDeJogo = 24;
			}
		
			System.out.println("O JOGO DUROU " + tempoDeJogo + " HORA(S)");
			sc.close();
	}

}
