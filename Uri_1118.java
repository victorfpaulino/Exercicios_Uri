package logica_e_algoritmos;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1118 {

    public static void main(String[] args) {
    	Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
         // Para garantir ponto decimal
        
        int continuar = 1;
        
        while (continuar == 1) {
            double nota1 = -1;
            double nota2 = -1;
            
            // Lendo e validando a primeira nota
            while (nota1 < 0 || nota1 > 10) {
                nota1 = scanner.nextDouble();
                if (nota1 < 0 || nota1 > 10) {
                    System.out.println("nota invalida");
                }
            }
            
            // Lendo e validando a segunda nota
            while (nota2 < 0 || nota2 > 10) {
                nota2 = scanner.nextDouble();
                if (nota2 < 0 || nota2 > 10) {
                    System.out.println("nota invalida");
                }
            }
            
            // Calculando e mostrando a média
            double media = (nota1 + nota2) / 2;
            System.out.printf("media = %.2f%n", media);
            
            // Verificando se o usuário quer continuar
            System.out.println("novo calculo (1-sim 2-nao)");
            continuar = scanner.nextInt();
            
            // Validando a opção de continuar
            while (continuar != 1 && continuar != 2) {
                System.out.println("novo calculo (1-sim 2-nao)");
                continuar = scanner.nextInt();
            }
        }
        
        scanner.close();
    }

}
