package teste;

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        // Questão 02.
        System.out.println("*----- Questão 05 ---------------------------------------------------------*\n");

        String entrada;
        StringBuilder saida = new StringBuilder();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a palavra ou frase que deseja ser invertida: ");
        entrada = scanner.nextLine();

        for (int i = (entrada.length() - 1); i > -1; i--) {
            saida.append(entrada.charAt(i));
        }

        System.out.println("\nResultado obtido:");
        System.out.println(saida);

        scanner.close();

    }
}
