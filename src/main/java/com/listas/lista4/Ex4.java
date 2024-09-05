package com.listas.lista4;

public class Ex4 {
        public static void resolucao4(){
    
            int lista[] = {3, 5, 6, 7, 8, 10, 22, 55, 110};
            int cont = 0;
    
            for (int i = 0; i < 9; i++) {
                if(lista[i]%2==0){
                    lista[i] += cont;
                    cont++;
                }
            }
            System.out.println("Quantidade de números pares: " + cont);
        }
    } 