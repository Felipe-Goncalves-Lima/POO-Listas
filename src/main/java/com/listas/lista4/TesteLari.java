package com.listas.lista4;

import java.util.Scanner;

public class TesteLari {
    private static int numero;

    public static void resolucao4()throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        int lista[] = {3, 5, 6, 7, 8, 10, 22, 55, 110};
        int par = 0;

        //for (int i = 0; i < 9; i++) {
            
        //}

        for ( int numero : lista);{


            if (numero % 2 == 0){
                lista[numero] += par;
                par++;
            }

        }
        System.out.println("Quantidade de números pares: " + par);
}

}