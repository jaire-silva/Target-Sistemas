package teste;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao02 {

    public static void main(String[] args) {

        System.out.println("*----- Questão 02 ---------------------------------------------------------*\n");
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        int entrada;

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o numero que deseja verifcar ser da sequência de Fibonacci: ");
            entrada = scanner.nextInt();
        } catch (InputMismatchException e) {
            entrada = -1;
            System.out.println("Entrada invadalida!!!");
        }

        while (entrada > n3) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }

        if (entrada == 0) {
            System.out.println("O número está na sequência de Fibonacci.");
        } else if (entrada == n3) {
            System.out.println("O número está na sequência de Fibonacci.");
        } else {
            System.out.println("O número não está na sequência de Fibonacci.");
        }

        scanner.close();
    }
}
