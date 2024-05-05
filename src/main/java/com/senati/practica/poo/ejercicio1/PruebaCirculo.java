package com.senati.practica.poo.ejercicio1;

import java.util.Scanner;

public class PruebaCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa el radio: ");
        float radio = sc.nextFloat();
        
        Circulo c = new Circulo(radio);
        
        c.imprimirInformacion();
    }
}
