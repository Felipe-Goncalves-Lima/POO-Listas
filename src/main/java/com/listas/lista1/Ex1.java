package com.listas.lista1;

import java.util.Scanner;

public class Ex1 {
    public static void resolucao(){
        
        //1) Escreva um programa que faça a soma entre 2 números.

        int n1;
        int n2;

        System.out.println("Digite o primeiro número:");
        Scanner Leia = new Scanner(System.in);
        n1 = Leia.nextInt();

       System.out.println("Digite o segudo número: ");
        n2 = Leia.nextInt();

        System.out.println("A soma é: "+(n1+n2));

        
    }
}