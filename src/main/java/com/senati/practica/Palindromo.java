package com.senati.practica;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa la frase: ");
        String frase = sc.nextLine();
        String fraseInvertida = "";
        
        //quitamos escacios
        String palabras[] = frase.split(" ");
        frase = "";
        //String.join(, palabras)
        
        for (int i = 0; i < palabras.length; i++) {
            frase += palabras[i].toLowerCase().trim();
        }      
        
        // invertimos la frase
        for (int i = frase.length() - 1; i >= 0; i--) {
            fraseInvertida += frase.charAt(i);
        }
        
        // comparamos
        if (frase.equals(fraseInvertida)) {
            System.out.println("Es palíndromo");
        }
        else {
            System.out.println("No es palíndromo");
        }
    }
}
