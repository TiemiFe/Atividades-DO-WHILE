package com.mycompany.contagemregressiva;

public class ContagemRegressiva {

    public static void main(String[] args) {
        System.out.println("Iniciando contagem regressiva!");

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000); // Pausa de 1 segundo
            } catch (InterruptedException e) {
                System.err.println("Erro na pausa: " + e.getMessage());
            }
        }
        System.out.println("Fim da contagem!");
    }
}
