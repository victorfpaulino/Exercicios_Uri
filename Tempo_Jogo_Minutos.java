package logica_e_algoritmos;

import java.util.Scanner;

public class Tempo_Jogo_Minutos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int horaInicial = sc.nextInt();
		int minutoInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		int minutoFinal = sc.nextInt();
		
		int inicioEmMinutos = horaInicial * 60 + minutoInicial;
		int fimEmMinutos = horaFinal * 60 + minutoFinal;
		
		int duracaoEmMinutos;
		
		if (fimEmMinutos <= inicioEmMinutos) {
			fimEmMinutos += 24*60;
		}
		
		duracaoEmMinutos = fimEmMinutos - inicioEmMinutos;
		
		int duracaoHoras = duracaoEmMinutos / 60;
		int duracaoMinutos = duracaoEmMinutos % 60;
		
		System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", duracaoHoras, duracaoMinutos);
		
		sc.close();
	}

}
