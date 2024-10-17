package com.mycompany.senhanumerica;

import java.util.Scanner;

public class SenhaNumerica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int senhaCorreta = 1234; // Defina a senha correta
        int senhaInformada;

        do {
            System.out.print("Digite a senha: ");
            senhaInformada = scanner.nextInt(); // Lê a senha do usuário

            if (senhaInformada != senhaCorreta) {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        } while (senhaInformada != senhaCorreta); // Continua até a senha correta ser digitada

        System.out.println("Senha correta! Acesso permitido.");
        scanner.close(); // Fecha o scanner
    }
}
