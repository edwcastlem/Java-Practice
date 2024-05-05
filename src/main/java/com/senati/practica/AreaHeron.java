package com.senati.practica;

import java.util.Scanner;

public class AreaHeron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al juego 'Adivina el numero'");

        int numIntentos = 0;

        int numSecreto;
        do {
            numSecreto = (int) (Math.random() * 100d);
        } while (!(numSecreto >= 1 && numSecreto <=100));

        //System.out.println(numSecreto);

        while (numIntentos < 5) {
            System.out.print("Ingresa un número entre 1 y 100: ");
            int num = sc.nextInt();

            if (num > numSecreto) {
                System.out.println("Lo siento el numero secreto es menor");
            }
            else {
                if (num < numSecreto) {
                    System.out.println("Lo siento el numero secreto es mayor");
                }
                else {
                    System.out.println("Encontraste el numero secreto!!!");
                    break;
                }
            }
            numIntentos++;
        }

        if (numIntentos == 5) {
            System.out.println("Lo siento. Agostaste tus intentos!!");
            System.out.println("El número secreto era: %d".formatted(numSecreto));
        }
        else {
            System.out.println("Número de intentos: %d".formatted(numIntentos + 1));
        }

    }
}
