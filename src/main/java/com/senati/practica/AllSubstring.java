package com.senati.practica;

import java.util.Scanner;

public class AllSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el string: ");
        String texto = sc.nextLine();
        
        for (int i = 0; i < texto.length(); i++) {
            System.out.println("L = %d".formatted(i+1));
            for (int j = 0; j < texto.length() && j + i + 1 <= texto.length(); j++) {
                System.out.println(texto.substring(j, j + i + 1));
            }
        }
    }
}
