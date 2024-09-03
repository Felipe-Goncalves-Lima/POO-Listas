package com.listas.lista1;

import java.util.Scanner;

public class Ex2 {
    public static void resolucao2() {
    
   String nome, sobrenome;

    System.out.print("Digite seu nome: ");
    Scanner leia = new Scanner(System.in);
    nome = leia.nextLine();


    System.out.print("Digite seu sobrenome: ");
    sobrenome = leia.nextLine();

    System.out.println("Olá, " + nome + " " + sobrenome);

    }
}
