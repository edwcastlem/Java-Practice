package com.senati.practica.poo.ejercicio2;

import java.util.Scanner;

public class PruebaRectangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa la base: ");
        float base = sc.nextFloat();
        sc.nextLine();
        System.out.print("Ingresa la altura: ");
        float altura = sc.nextFloat();
        
        Rectangulo r = new Rectangulo(base, altura);
        
        r.imprimirInformacion();
    }
}
