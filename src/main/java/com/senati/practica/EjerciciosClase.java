package com.senati.practica;

import java.util.Scanner;

public class EjerciciosClase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Ingrese la longitud del array: ");
        int n = sc.nextInt();
        
        int[] array = new int[n];
        
        for(int i=0; i < n; i++) {
            System.out.print("Ingrese el elemento %d: ".formatted(i+1));
            array[i] = sc.nextInt();
        }
        
        System.out.println("Los elemenos ingresados: ");
        
        for(int i = 0; i < n; i++) {
            System.out.println("Array[%d] = %d".formatted(i, array[i]));
            
        }

        sc.close();
    }
}
