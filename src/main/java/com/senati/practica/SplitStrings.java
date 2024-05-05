package com.senati.practica;

import java.util.Scanner;

public class SplitStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa la serie de números (Separa con -): ");
        String cadena = sc.nextLine();
        
        String[] resultado = cadena.split("-");
        int suma = 0;
        
        for (int i = 0; i < resultado.length; i++) {
            suma += Integer.parseInt(resultado[i].trim());
        }
        
        System.out.println("La suma de los números es: %d".formatted(suma));
    }
}
