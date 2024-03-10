/*
 Imprima a tabulada de um número
 */

package com.mycompany.ex04while;

import java.util.Scanner;

public class Ex04While {

    public static void main(String[] args) {
        System.out.println("Digite um número para ver o resultado de sua tabuada: \n");
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        int x = 1;
        
        while(x <= 10){
            System.out.println(numero  + " x " + x + " = " + (numero * x)); x++;
        }
        teclado.close();
    }
}
