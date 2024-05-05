package com.senati.practica;

import java.util.Scanner;

public class ContadorModulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("========== Contador Módulo M ==========");
        System.out.print("Ingrese el módulo m = ");
        int mod = sc.nextInt();
        
        System.out.print("Ingrese el numero de elementos: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        
        // ingreso 
        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa el elemento %d: ".formatted(i+1));
            array[i] = sc.nextInt();
        }
        
        // recorremos y contamos
        for (int j = 0; j < mod; j++) {
            int contador = 0;
            for (int i = 0; i < n; i++) {
                if (array[i] % mod == j) {
                    contador++;
                }
            }
            System.out.println("Cantidad de elementos con residuo = %d es: %d".formatted(j, contador));
        }
    }
}
