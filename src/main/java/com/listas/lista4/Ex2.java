package com.listas.lista4;

import java.io.InterruptedIOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Ex2 {
    public static void resolucao() throws InterruptedException {

        Scanner leia = new Scanner(System.in);

        System.out.println("Número de vendas do dia: ");
        int numeroVendas = leia.nextInt();

        double vendas[] = new double [numeroVendas];
        double totalVendas = 0;

        for (int i = 0; i <= numeroVendas; i++) {
            System.out.println("Digite o valor da venda " + (i + 1) + ":");
            vendas[i] = leia.nextDouble();
        }
        for (double venda : vendas) {
            totalVendas += venda;
        }
        System.out.println("Total das vendas do dia: R$" + totalVendas);
        TimeUnit.SECONDS.sleep(3);
        System.out.println("\033[h\033[2J");
        System.out.flush();
    }
}

