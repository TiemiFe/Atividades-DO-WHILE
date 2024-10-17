/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contador;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Contador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int numero;

        System.out.println("Insira números inteiros (digite 0 para encerrar):");

        do {
            numero = scanner.nextInt(); // Lê o número do usuário
            if (numero != 0) {
                contador++; // Incrementa o contador se o número não for 0
            }
        } while (numero != 0); // Continua até que 0 seja inserido

        System.out.println("Você inseriu " + contador + " números.");
        scanner.close(); // Fecha o scanner
    }
}
