package logica_e_algoritmos;

import java.util.Scanner;

public class Uri_1145 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Lendo os valores de X e Y
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        
        // Contador para controlar quando quebrar a linha
        int contador = 0;
        
        for (int i = 1; i <= Y; i++) {
            // Imprime o número atual
            System.out.print(i);
            
            // Incrementa o contador
            contador++;
            
            // Verifica se precisa quebrar a linha ou adicionar espaço
            if (contador == X) {
                System.out.println();  // Quebra de linha
                contador = 0;         // Reinicia o contador
            } else if (i < Y) {
                System.out.print(" "); // Espaço entre números
            }
        }
        
        // Caso especial para quando Y não é múltiplo de X
        if (contador != 0) {
            System.out.println();
        }
        
        scanner.close();
    }

}
